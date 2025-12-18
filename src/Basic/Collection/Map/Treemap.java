package Basic.Collection.Map;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // add / update
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.putIfAbsent(4, "D");

        // access
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(5, "NA"));

        // search
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("A"));

        // remove
        map.remove(4);

        // replace
        map.replace(1, "X");
        map.replace(2, "B", "Y");

        // compute / merge
        map.computeIfAbsent(5, k -> "E");
        map.computeIfPresent(3, (k, v) -> v + "!");
        map.merge(6, "F", (o, n) -> o + n);

        // sorted-map specific (VERY IMPORTANT)
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.lowerKey(3));   // < 3
        System.out.println(map.floorKey(3));   // <= 3
        System.out.println(map.higherKey(3));  // > 3
        System.out.println(map.ceilingKey(3)); // >= 3

        System.out.println(map.headMap(3));        // < 3
        System.out.println(map.tailMap(3));        // >= 3
        System.out.println(map.subMap(2, 5));      // [2,5)

        // iteration (sorted order)
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // state
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        // clear
        map.clear();
        System.out.println(map);
    }
}

