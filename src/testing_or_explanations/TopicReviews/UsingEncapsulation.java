package testing_or_explanations.TopicReviews;

import testing_or_explanations.TopicReviews.Encapsulation;

public class UsingEncapsulation {

    public static void main(String[] args) {
//        Encapsulation obj1=new Encapsulation("group");
//        System.out.println(obj1.getD());
//        obj1.setD("team");
//        System.out.println(obj1.getD());

        Encapsulation obj2 =new Encapsulation();
        System.out.println(obj2.getD());
        System.out.println(obj2.a);
        System.out.println(obj2.c);
        obj2.setD("testing");
        System.out.println(obj2.getD());


    }
}
