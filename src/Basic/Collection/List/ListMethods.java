package Basic.Collection.List;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // 1️⃣ Add
        list.add(10);                 // [10]
        list.add(20);                 // [10, 20]
        list.add(1, 15);              // [10, 15, 20]

        // 2️⃣ Add multiple
        list.addAll(Arrays.asList(30, 40));   // [10, 15, 20, 30, 40]

        // 3️⃣ Get / Set
        int x = list.get(2);          // 20
        list.set(2, 25);              // [10, 15, 25, 30, 40]

        // 4️⃣ Remove
        list.remove(1);               // remove index → [10, 25, 30, 40]
        list.remove(Integer.valueOf(30)); // remove object → [10, 25, 40]

        // 5️⃣ Size / Empty
        int size = list.size();       // 3
        boolean empty = list.isEmpty(); // false

        // 6️⃣ Search
        boolean has25 = list.contains(25); // true
        int idx = list.indexOf(25);   // 1
        int last = list.lastIndexOf(25); // 1

        // 7️⃣ Iterate
        for (int i : list) {
            System.out.print(i + " ");
        }

        // 8️⃣ Sort / Reverse
        Collections.sort(list);       // ascending
        Collections.reverse(list);    // descending

        // 9️⃣ SubList (view, not copy)
        List<Integer> sub = list.subList(0, 2);

        // 🔟 Convert
        Object[] arr1 = list.toArray();
        Integer[] arr2 = list.toArray(new Integer[0]);

        // 1️⃣1️⃣ Clear
        list.clear();
    }
}
