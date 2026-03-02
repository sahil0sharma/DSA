package Basic.Basic_concept.Strings;

public class Rotate_string {                  // TC -> O(N^2) | SC -> O(N)

    boolean rotate1(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String s1 = s + s;  // the idea of this code id to add the original string in original string abcd+abcd this will contain all the rotation and compare this to goal string
        for (int i = 0; i < s.length(); i++) {
            if (s1.substring(i, s.length() + i).equals(goal)) {
                return true;
            }
        }
        return false;
    }

    boolean rotate2(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
        public static void main (String[]args){
            Rotate_string r = new Rotate_string();

            String s = "abcd";
            String goal = "cdab";
            System.out.println(r.rotate1(s, goal));
            System.out.println(r.rotate2(s,goal));
        }

}
