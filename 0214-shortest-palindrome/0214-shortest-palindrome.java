
class Solution {
    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        String combined = s + "#" + rev;

        int n = combined.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        // Build LPS array
        while (i < n) {

            if (combined.charAt(i) == combined.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {

                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int longestPrefix = lps[n - 1];

        String remaining = s.substring(longestPrefix);

        return new StringBuilder(remaining).reverse() + s;
    }
}
