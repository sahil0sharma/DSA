package Basic.Basic_concept.Strings;

public class subString {

    public static void sub( String s ){    // to print all possible substring without changing order only forward of a string

        int n = s.length();

        for( int i = 0; i < n; i++){
            for( int j = i; j < n; j++){
                System.out.println(s.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {


        String str = "abcd";
        subString.sub(str);

    }
}
