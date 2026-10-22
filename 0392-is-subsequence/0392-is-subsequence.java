class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        int m = s.length();
        int n = t.length();


        
        while(i < m && j < n){
            char a = s.charAt(i);
            char b = t.charAt(j);

            if(a == b){
                i++;
                j++;
            }else {
                j++;
            }
        }
            if(i == m){
                return true;
            }

        return false;
    }
}