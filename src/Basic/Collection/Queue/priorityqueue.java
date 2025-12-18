package Basic.Collection.Queue;
import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap

        PriorityQueue<Integer> pqReverse = new PriorityQueue<>(Collections.reverseOrder()); // max-heap

//      PriorityQueue uses a binary heap, stored in an array

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.peek()); // 10  (min element)
        System.out.println(pq.poll()); // 10
        System.out.println(pq.peek()); // 20 whenever peek is use it gives smallest value


    }
}
