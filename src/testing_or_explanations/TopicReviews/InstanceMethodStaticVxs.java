package testing_or_explanations.TopicReviews;

public class InstanceMethodStaticVxs {
    static int num=5;
    int num2=10;//instance vx
    //instance method
    public void print(){
        System.out.println(num);
        System.out.println(num2);
    }
//static method
    public static void print2(){
        System.out.println(num);
        //System.out.println(num2); not instance allowed in static
    }
}
