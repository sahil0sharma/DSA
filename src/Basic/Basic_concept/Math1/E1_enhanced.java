package Basic.Basic_concept.Math1;
// Perfectno no.
// ex 153 so this no. has -> 3 digit | so, 1cube + 5cube + 3cube = after cubing and adding is 153 same as original no.

public class E1_enhanced {

    private int digit(int n){
        int count = (int) (Math.log10(n) + 1);
        return count;
    }

    public boolean is_Armstrong(int n){

        int count = digit(n);

        int sum = 0;
        int copy = n;

        while( n > 0 ){

            int last_digit = n % 10;

            sum += (int) Math.pow(last_digit, count);

            n = n / 10;
        }
        return sum == copy;
    }
    public static void main(String[] args) {
        E1_enhanced e1Enhanced = new E1_enhanced();

        int n = 153;
        System.out.println(e1Enhanced.is_Armstrong(n));
    }
}
