package testing_or_explanations.TopicReviews;

public class UsingClasses {

    public static void main(String[] args) {
        //When calling class the first time on line 7 static block runs only one time and that's it.
        Parent obj1=new Parent("Gina");
        Parent obj2=new Parent("Gina",27);

    }
}
