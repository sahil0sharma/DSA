package Basic.Collection.Map;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // add / update
        map.put(1, "A");
        map.put(2, "B");
        map.putIfAbsent(3, "C");

        // access
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(4, "NA"));

        // search
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("A"));

        // replace
        map.replace(1, "X");
        map.replace(2, "B", "Y");

        // remove
        map.remove(3);
        map.remove(2, "Y");

        // compute / merge
        map.computeIfAbsent(4, k -> "D");
        map.computeIfPresent(1, (k, v) -> v + "1");
        map.merge(5, "E", (oldV, newV) -> oldV + newV);

        // views
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // size / state
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        // clear
        map.clear();
        System.out.println(map);
    }
}
