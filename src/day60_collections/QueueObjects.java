package day60_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
       queue.offer(15);
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(3);
        queue.offer(30);// works like adding.
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.poll());// returns what is removed
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.poll());// returns what is removed
        System.out.println(queue);



        //queue.offer(null);// exception because null is not allowed
       // System.out.println(new PriorityQueue<>().remove());//exception because there is no elements
        //System.out.println(new PriorityQueue<>().poll());//poll does same as remove but it does not throw exception
        System.out.println("--------------------------------------------------------------------");
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        deque.offer(15);
        deque.add(2);
        deque.add(10);
        deque.add(8);
        deque.add(1);
        deque.add(3);
        deque.offer(30);// works like adding.
        System.out.println(deque);
        System.out.println(deque.element());
        System.out.println(deque.poll());

    }
}
