import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue); //선입선출 (FIFO)
        System.out.println("queue.peek() === "+queue.peek());
        System.out.println("queue.poll() === "+queue.poll());
        System.out.println("queue.poll() === "+queue.poll());
        System.out.println("queue.poll() === "+queue.poll());
        System.out.println(queue);
        //youtube.com
        //google.com
        //facebook.com
        //각각 집어넣고 순서대로 꺼내기  stack이용해서
        //facebook.com
        //google.com
        //youtube.com

        Deque<String> deque02 = new ArrayDeque<>();
        deque02.push("youtube.com");
        deque02.push("google.com");
        deque02.push("facebook.com");
        System.out.println(deque02);
        System.out.println(deque02.pop());
        System.out.println(deque02.pop());
        System.out.println(deque02.pop());


    }
}
