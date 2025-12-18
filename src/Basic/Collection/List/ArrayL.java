package Basic.Collection.List;

import java.util.*;
public class ArrayL {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10);     // initial capacity
        ArrayList<Integer> list3 = new ArrayList<>(list2);   // copy

        //methods

        //add element
        list.add(1);
        list.add(1,2); // at index
        list.add(3);
        System.out.println(list);  // [1, 2, 3]

        // access element
        list.get(0);            // get element
        list.set(0, 99);        // replace element

        System.out.println(list); // [99, 2, 3]

        // remove element
        list.remove(0);                     // remove by index
        list.remove(Integer.valueOf(2));   // remove by value

        System.out.println(list);  //  [3]

        //size and checks
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(3));

        list.clear(); // clear everything

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        for(int i:list2){
//            list2.add(1,3); Never modify list while using for-each → ConcurrentModificationException.
            System.out.println(i);

        }






    }
}
