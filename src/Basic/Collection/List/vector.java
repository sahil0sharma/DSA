package Basic.Collection.List;
import java.util.*;
public class vector {
    public static void main(String[] args) {

                Vector<Integer> v = new Vector<>();

                // add elements
                v.add(10);
                v.add(20);
                v.add(30);

                // add at index
                v.add(1, 15);   // [10, 15, 20, 30]

                // access
                System.out.println(v.get(2));   // 20

                // update
                v.set(2, 25);                   // [10, 15, 25, 30]

                // remove
                v.remove(1);                    // removes 15
                v.remove(Integer.valueOf(30));  // removes object 30

                // size & capacity
                System.out.println(v.size());       // number of elements
                System.out.println(v.capacity());   // internal storage size

                // search
                System.out.println(v.contains(25)); // true
                System.out.println(v.indexOf(25));  // index

                // first & last element
                System.out.println(v.firstElement());
                System.out.println(v.lastElement());

                // convert to array
                Integer[] arr = v.toArray(new Integer[0]);

                // clear
                v.clear();

                System.out.println(v); // []
    }
}
