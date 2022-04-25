package day51_inheritance.season;

public class CheckSeason {
    public static void main(String[] args) {
        /*Create a class CheckSeason
create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class
List the is a relations of all the classes
*/
        Winter obj1= new Winter(35,20);
        obj1.activity();
        System.out.println(obj1);
        Summer obj2=new Summer(80,70);
        obj2.activity();
        System.out.println(obj2);
        Fall obj3=new Fall(50,60);
        obj3.activity();
        System.out.println(obj3);
        Spring obj4=new Spring(40,30);
        obj4.activity();
        System.out.println(obj4);
    }
}
