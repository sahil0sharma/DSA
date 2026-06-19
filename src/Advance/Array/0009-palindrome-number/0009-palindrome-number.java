class Solution {
    public boolean isPalindrome(int n) {
        if ( n == 0)  return true;

        int ncopy = n;

        int rev = 0;
        while ( ncopy > 0){
            int last_digit = ncopy % 10;
            rev = rev * 10 + last_digit;
            ncopy /= 10;
        }
        return n == rev;

    }
}