class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] letter = new int[128];
        int j = 0;
        int length = 0;
        

        for(int i = 0; i < s.length(); i++){
           
           char rightchar = s.charAt(i);
           letter[rightchar]++;

           while(letter[rightchar] > 1){
            letter[s.charAt(j)]--;
            j++;
           }

           length = Math.max(length, i - j + 1);
            
        }
        return length;
    }
}