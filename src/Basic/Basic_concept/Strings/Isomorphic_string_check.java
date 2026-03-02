package Basic.Basic_concept.Strings;

import java.util.*;

public class Isomorphic_string_check {

    public boolean isomorphic_check(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> string1 = new HashMap<>();
        Map<Character, Character> string2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (string1.containsKey(c1)) {
                if (string1.get(c1) != c2) {
                    return false;
                }
            } else {
                string1.put(c1, c2);
            }

            if (string2.containsKey(c2)) {
                if (string2.get(c2) != c1) {
                    return false;
                }
            } else {
                string2.put(c2, c1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Isomorphic_string_check s = new Isomorphic_string_check();

        String s1 = "egg";
        String s2 = "add";
        System.out.println(s.isomorphic_check(s1,s2));

    }
}
