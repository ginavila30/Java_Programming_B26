package day29_05_31_2022;

import java.util.*;

public class P01_ListPractice {
    public static void main(String[] args) {
        Integer[]nums={1,2,3,4,5,4,3,2,1};
        System.out.println("***ARRAY LIST***");
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(nums));
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println("***LINKED LIST***");
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(nums));
        linkedList.addFirst(5);
        linkedList.addLast(100);
        System.out.println(linkedList.peekFirst());
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        System.out.println("linkedList.get(0) = " + linkedList.get(0));
        System.out.println("***VECTOR***");
        Vector<Integer>vector=new Vector<>(Arrays.asList(nums));
        System.out.println(vector);
        System.out.println("vector.get(0) = " + vector.get(0));
        System.out.println("vector.size() = " + vector.size());
        System.out.println("***STACK***");
        //Stack<Integer>listStack=new Stack<>(Arrays.asList(nums)); stack does not accept anything an argument of the constructor.
        List<Integer>listStack=new Stack<>();
        listStack.addAll(Arrays.asList(nums));
       // listStack.pop(); does not work since the reference is List, and it does not contain those methods.
        ((Stack)listStack).pop();// down-casting to be able to access methods from
        Stack castedVersion=(Stack) listStack;
        castedVersion.push(15);
        System.out.println(castedVersion);
        System.out.println("castedVersion.pop() = " + castedVersion.pop());
        Integer num = (Integer) castedVersion.pop();


    }
}
