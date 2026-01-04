package Basic.Basic_concept.Math.Strings;

public class Palindrome_check {

    public boolean plaindrome(String s ){

        int left = 0;
        int right = s.length() - 1;


        while ( left < right){
            if( s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome_check p = new Palindrome_check();

        String str = "racecar";
        System.out.println(p.plaindrome(str));

    }
}
