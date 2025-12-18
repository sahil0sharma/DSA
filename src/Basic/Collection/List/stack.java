package Basic.Collection.List;

import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 1. push() – add element
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After push: " + stack);

        // 2. pop() – remove top element
        int removed = stack.pop();
        System.out.println("Popped element: " + removed);
        System.out.println("After pop: " + stack);

        // 3. peek() – see top element (no removal)
        int top = stack.peek();
        System.out.println("Top element: " + top);

        // 4. isEmpty() – check empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 5. size() – number of elements
        System.out.println("Stack size: " + stack.size());

        // 6. search() – position from top (1-based)
        System.out.println("Position of 10: " + stack.search(10));

        // 7. clear() – remove all elements
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}
