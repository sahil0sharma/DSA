package Basic.Basic_concept.Strings;

public class Anagram_string_check {

    public static boolean anagram(String s, String t){

        if(s.length() != t.length()) {
            return false;
        }

        int[] found = new int[26];

        for(int i = 0; i < s.length(); i++){
            found[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            found[t.charAt(i) - 'a']--;
        }
        for(int i: found){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "eat";
        String t = "tea";

        System.out.println(Anagram_string_check.anagram(s,t));;
    }
}
