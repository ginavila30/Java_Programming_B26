package day61_maps;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<String>queue1=new PriorityQueue<>();
        queue1.offer("hello");
        queue1.offer("world");
        queue1.offer("java");
        queue1.offer("selenium");
        queue1.offer("apple");
        queue1.offer("zebra");
        System.out.println(queue1);
        System.out.println(queue1.peek());
        queue1.poll();
        System.out.println(queue1);
        System.out.println(queue1.poll());

        queue1.offer("apple");
        System.out.println(queue1);


        ArrayDeque<String>arrayDeque1=new ArrayDeque<>();
        arrayDeque1.offer("hello");
        arrayDeque1.offer("world");
        arrayDeque1.offer("java");
        arrayDeque1.offer("selenium");
        arrayDeque1.offer("apple");
        arrayDeque1.offer("zebra");
        System.out.println(arrayDeque1);
        System.out.println(arrayDeque1.poll());
        System.out.println(arrayDeque1);
        System.out.println(arrayDeque1.peek());

    }
}
