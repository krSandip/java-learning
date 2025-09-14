import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class s1inbuiltEx {
    public static void main(String[] args) {
        // 1 - stack
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(3);
//        stack.push(20);
//        stack.push(1);
//        stack.pop();
//        stack.add(2, 40);
//        stack.remove(0);
//        System.out.println(stack);

        // 2 - queue
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(12);
//        queue.add(23);
//        queue.add(1);
//        queue.add(9);
//        queue.remove();
//        queue.remove();
//        queue.add(20);
//        System.out.println(queue);

        // 3 - deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.add(24);
        deque.addFirst(30);
        deque.removeLast();
        deque.add(40);
        System.out.println(deque);
    }
}
