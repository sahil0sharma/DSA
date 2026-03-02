package Basic.Basic_concept.Strings;

public class Largest_Odd_Number_in_a_String {

    public static String L_odd(String s){

       int end = -1;
       for(int i = s.length() -1; i >= 0; i--){
           char c = s.charAt(i);
           if((c - '0') % 2 == 1){
               end = i;
               break;
           }
       }
       if(end == -1) return "";

       int start = 0;
       while( start <= end && s.charAt(start) == '0'){
           start++;
       }

       return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String str ="00367458928";

        System.out.println(Largest_Odd_Number_in_a_String.L_odd(str));
    }
}
