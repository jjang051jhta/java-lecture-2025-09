package test;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test12 {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();
        printQueue.offer("doc01");
        printQueue.offer("doc02");
        printQueue.offer("doc03");
        System.out.println("출력 : "+printQueue.poll());
        System.out.println("출력 : "+printQueue.poll());
        System.out.println("출력 : "+printQueue.poll());
    }
}
