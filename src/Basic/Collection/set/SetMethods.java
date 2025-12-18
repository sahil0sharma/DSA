package Basic.Collection.set;

import java.util.*;

public class SetMethods {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // 1. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);        // duplicate → ignored

        // 2. size()
        System.out.println(set.size()); // 3

        // 3. contains()
        System.out.println(set.contains(20)); // true

        // 4. remove()
        set.remove(30);

        // 5. isEmpty()
        System.out.println(set.isEmpty()); // false

        // 6. iterator()
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 7. toArray()
        Object[] arr = set.toArray();

        // 8. clear()
        set.clear();

        // 9. addAll()  (union)
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5));
        a.addAll(b);    // a = [1,2,3,4,5]

        // 10. retainAll() (intersection)
        Set<Integer> c = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> d = new HashSet<>(Arrays.asList(3, 4, 5));
        c.retainAll(d); // c = [3]

        // 11. removeAll() (difference)
        Set<Integer> e = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> f = new HashSet<>(Arrays.asList(3));
        e.removeAll(f); // e = [1,2]
    }
}
