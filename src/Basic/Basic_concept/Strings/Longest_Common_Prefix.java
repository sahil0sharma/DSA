package Basic.Basic_concept.Strings;

public class Longest_Common_Prefix {

    public static String longest_prefix(String[] s){

    if(s == null || s.length == 0) {
        return "";
    }

    String first = s[0];

    if(first.isEmpty()){
        return "";
    }

    for(int i = 0; i < first.length(); i++){
        char current_ch = first.charAt(i);

        for(int j = 1; j < s.length; j++){
            if( i >= s[j].length() || s[j].charAt(i) != current_ch){
                return first.substring(0,i);
            }
        }
    }
        return first;
     }

    public static void main(String[] args) {
        String[] ls = {"flower", "floere" , "floahsb"};
        System.out.println(Longest_Common_Prefix.longest_prefix(ls));
    }
}

