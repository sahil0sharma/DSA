package Basic.Collection.comparator;

import java.util.*;
public class Custom_comparator {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        // Method 1
        Comparator<Integer> list = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - o1 ;
            }
        };
        Collections.sort(al, list);
        System.out.println(al);

//        Method 2
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                if(n1<n2){
                    return 1;
                }
                else if(n1 > n2){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(al);
    }
}
