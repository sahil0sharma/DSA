package Basic.Basic_concept.Math;
// Count number of odd digits in a number
public class B1 {

    public int cout_odd_digit(int n){

        int count = 0;
        while (n > 0) {
            int last_digit = n % 10;
            if (last_digit % 2 != 0 ){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        B1 b1 = new B1();
        int n = 1;

        System.out.println(b1.cout_odd_digit(n));

    }

}
