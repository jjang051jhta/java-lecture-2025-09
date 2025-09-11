import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack); //LIFO
        System.out.println("stack.peek() === "+stack.peek());
        System.out.println("stack.pop() === "+stack.pop());
        System.out.println("stack.pop() === "+stack.pop());
        System.out.println("stack.pop() === "+stack.pop());
        System.out.println(stack);
    }
}
