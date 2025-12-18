package Basic.Collection.Queue;

import java.util.*;
// follows FIFO principal -> first come first serve

public class queuedemo {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.peek();     // 10
        System.out.println(q.peek());
        q.poll();     // 10
        System.out.println(q);
        q.isEmpty();  // false
        System.out.println(q.isEmpty());

    }
}
