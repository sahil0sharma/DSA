package Basic.Basic_concept.Math1;
// Armstrong no.
// ex 153 so this no. has -> 3 digit | so, 1cube + 5cube + 3cube = after cubing and adding is 153 same as original no.

public class E1 {

    public boolean isArmstrong(int n) {

        int count = 0;
        int sum = 0;
        int copy1 = n;
        int copy2 = n;

        while ( copy1 > 0 ){
            int last_digit = copy1 % 10;
            count++;
            copy1 = copy1 / 10;
        }

        while ( copy2 > 0)
        {
            int mult = 1;
            int lastdigit = copy2 % 10;

            for ( int i = 0; i < count; i++){
                mult = mult * lastdigit;
            }
            sum = sum + mult;
            copy2 = copy2 / 10;
        }

//        return lastdigit;
        return n == sum;
    }
    public static void main(String[] args){
        E1 e1 = new E1();

        int n = 153;

        System.out.println(e1.isArmstrong(n));
    }
}
