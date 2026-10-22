class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        char[] arr = s.toCharArray();

        StringBuilder ans = new StringBuilder();
        int i = arr.length - 1;

        while (i >= 0) {
            if (arr[i] == ' ') {
                i--;
                continue;
            }

            int j = i;

            while (j >= 0 && arr[j] != ' ') {
                j--;
            }

            for (int k = j + 1; k <= i; k++) {
                ans.append(arr[k]);
            }

            ans.append(' ');
            i = j;
        }

        if (ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1);
        }

        return ans.toString();
    }
}