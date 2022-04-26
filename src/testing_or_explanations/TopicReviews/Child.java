package testing_or_explanations.TopicReviews;

public class Child extends Parent{// inheritance by using key word extends.

    public Child(String name,int age){
        super(name, age); // when creating child constructor, child class must call parent constructor.
    }
@Override // override happens with inheritance, method is called with same signature but implementation can change.
  public void display(){ System.out.println(name+" lives in planet "+planet+" and is a child class");}

    public static void main(String[] args) {
        Child obj=new Child("Gina",27);
        obj.name="majid";// protected
        //obj.age not accessible because it is private, only accessible with setter or getter methods


    }
}
