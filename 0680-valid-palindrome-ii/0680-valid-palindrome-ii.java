class Solution {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j){
        char a = s.charAt(i);
        char b = s.charAt(j);

            if(a != b){
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int i, int j){
        while(i < j){
        char a = s.charAt(i);
        char b = s.charAt(j);

            if(a != b){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}