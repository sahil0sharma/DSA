package Basic.Basic_concept.Math.Strings;

public class Anagram_string_check {

    public static boolean anagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        for( int i = 0; i < s.length(); i++){
            if(t.contains(s.substring(i))){

            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "eat";
        String t = "tea";

        System.out.println(Anagram_string_check.anagram(s,t));;
    }
}
