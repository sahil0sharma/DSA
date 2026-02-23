package Basic.Basic_concept.Math1;
// Palindrome Number

public class C1 {
    public boolean isPalindrome(int n) {
        int ncopy = n;

        int rev = 0;
        while ( ncopy > 0){
            int last_digit = ncopy % 10;
            rev = rev * 10 + last_digit;
            ncopy /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        C1 c1 = new C1();

        int n = 121;

        System.out.println(c1.isPalindrome(n));
    }
}
