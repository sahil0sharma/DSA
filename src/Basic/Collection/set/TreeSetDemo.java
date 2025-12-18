package Basic.Collection.set;

//TreeSet is a Set implementation that:
//
//Stores unique elements
//
//Keeps elements sorted
//
//Uses a Red-Black Tree internally
//
//Operations are O(log n)
//
//Does NOT allow null

import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        // add()
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);   // duplicate → ignored

        // sorted output
        System.out.println(set); // [10, 20, 30]

        // size()
        System.out.println(set.size()); // 3

        // contains()
        System.out.println(set.contains(20)); // true

        // remove()
        set.remove(30);

        // iteration (always sorted)
        for (var x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        // clear()
        set.clear();

        // isEmpty()
        System.out.println(set.isEmpty()); // true
    }
}
