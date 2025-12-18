package Basic.Collection.Queue;

import java.util.*;

public class Arraydequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);

        System.out.println(ad.peekFirst()); // 10
        System.out.println(ad.pollFirst()); // 10
        System.out.println(ad.pollLast());  // 30
        System.out.println(ad);             // [20]



    }
}
