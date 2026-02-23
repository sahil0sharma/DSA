package Basic.Basic_concept.Math1;


public class A4 {
    public int Reverse_a_number(int n ){

        if (n == 0) return 0;

        int rev = 0;
        while (n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;

            n = n / 10;

        }
        return rev;
    }
    public static void main(String[] args) {

        A4 p4 = new A4();

        int n = 1234;

        System.out.println(p4.Reverse_a_number(n));
    }
}
