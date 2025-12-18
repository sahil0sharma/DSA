package Basic.Collection.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);   // duplicate → ignored

        // size()
        System.out.println(set.size()); // 3

        // contains()
        System.out.println(set.contains(20)); // true

        // remove()
        set.remove(30);

        // iteration
        for (var x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        // null allowed (only once)
        set.add(null);
        set.add(null); // ignored

        // toArray()
        Object[] arr = set.toArray();

        // clear()
        set.clear();

        // isEmpty()
        System.out.println(set.isEmpty()); // true
    }
}

