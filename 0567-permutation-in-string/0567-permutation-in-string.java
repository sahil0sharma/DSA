class Solution {
    public boolean checkInclusion(String s1, String s2) {

       int[] one = new int[26];
       int[] two = new int[26];

        for(int i = 0; i < s1.length(); i++){
            one[s1.charAt(i) - 'a']++;
        }

       int j = 0;

       for(int i = 0; i < s2.length(); i++){
        char c = s2.charAt(i);
        two[c - 'a']++;

        if((i-j+1) > s1.length()){
            two[s2.charAt(j) - 'a']--;
            j++;
        }

        if((i - j + 1) == s1.length()){

            boolean flag = true;

            for(int x = 0; x < 26; x++){
                if(one[x] != two[x]){
                    flag = false;
                    break;
                }
            }
             if (flag) {
             return true;     
            }
        }
               
    }
        return false;
    }
}