class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        int have = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);

                if(window.get(c) <= map.get(c)){
                    have++;
                }
            }

            while(have == t.length()){

                if((right - left + 1) < min){
                    min = right - left + 1;
                    start = left;
                }

                char cleft = s.charAt(left);

                if(map.containsKey(cleft)){
                    window.put(cleft, window.get(cleft) - 1);
                    if(window.get(cleft) < map.get(cleft)){
                        have--;
                    }
                }
                left++;
            }
        }        

        if(min == Integer.MAX_VALUE){
            return "";
        }

       return s.substring(start, start + min); 
    }
}
