class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int d = 0;
        int j = 0;
        int length = 0;
        int[] hash = new int[128]; 

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            hash[c]++;

            while(hash[c] > 1){
                char c1 = s.charAt(j);
                hash[c1]--;
                j++;
            }

            length = Math.max(length, i - j + 1);

        }

        return length;
    }
}