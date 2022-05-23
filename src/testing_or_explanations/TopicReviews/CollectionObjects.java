package testing_or_explanations.TopicReviews;

import java.util.*;

public class CollectionObjects {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>(Arrays.asList("a","b","c","d","e"));
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque.removeLast());//lifo
        System.out.println(deque);
        System.out.println(deque.poll());//fifo
        System.out.println(deque);

        Queue<String> queue=new PriorityQueue<>(Arrays.asList("a","b","c","d","e","b"));
        queue.offer("f");

        Iterator<String>it=queue.iterator();

        while (it.hasNext()){
            if(it.next().equals("b")){
            it.remove();}
        }
        System.out.println(queue);
    }
}
