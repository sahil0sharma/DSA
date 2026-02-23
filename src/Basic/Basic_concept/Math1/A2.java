package Basic.Basic_concept.Math1;
// Return the Largest Digit in a Number

public class A2 {

    public int largest_no_in_Digit(int n){
        if (n == 0) return 0;

        int max = 0;
        while (n > 0){
            int digit = n % 10;

            if(digit > max){
                max = digit;
            }
            n /= 10;
        }
        return max;
    }
    public static void main(String[] args) {

        A2 p2 = new A2();
        int n = 12345;

        System.out.println(p2.largest_no_in_Digit(n));

    }
}

