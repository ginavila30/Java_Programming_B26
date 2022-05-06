package day51_inheritance.access.a;

public class Second {
    //same package different class
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);

       // System.out.println(obj.four); No accessible because it is private. so only accessible in same class.
    }
}
