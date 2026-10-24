class Solution {
    public int strStr(String haystack, String needle) {
        
        int m = haystack.length();
        int n = needle.length();

        for(int start = 0; start <= m - n; start++){
            int j = 0;

            while(j < n && haystack.charAt(start + j) == needle.charAt(j)){
                j++;
            }

            if(j == n){
                return start;
            }
        }

        return -1;
    }
}