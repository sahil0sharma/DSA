class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int[] need = new int[128];
        int[] window = new int[128];

        for(int c : p.toCharArray()){
            need[c]++;
        }
        
        int j = 0;
        int count = 0;


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            window[c]++;

            while((i-j+1) > p.length()){
                window[s.charAt(j)]--;
                j++;
            }

            if((i - j + 1) == p.length()){

                boolean flag = true;

                for(int x = 0; x < 128; x++){
                    if(window[x] != need[x]){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    list.add(j);
                }
            }


           
        }
        return list;
    }
}