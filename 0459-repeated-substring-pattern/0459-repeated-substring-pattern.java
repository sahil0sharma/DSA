class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] z = new int[n];

        int l = 0;
        int r = 0;

        for (int i = 1; i < n; i++) {
            if (i > r) {
                l = r = i;

                while (r < n && s.charAt(r - l) == s.charAt(r)) {
                    r++;
                }

                z[i] = r - l;
                r--;
            } else {
                z[i] = Math.min(z[i - l], r - i + 1);

                while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                    z[i]++;
                }

                if (i + z[i] - 1 > r) {
                    r = i + z[i] - 1;
                    l = i;
                }
            }
            if (n % i == 0 && i + z[i] == n) {
                return true;
            }
        }

        return false;
    }
}