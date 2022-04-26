package day04_04_25_2022.packageA;
//Different class same package
public class Second {
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
       // System.out.println(obj.d); private, it can't be accessed in separate class
        System.out.println(First.e);// since I am in separate class I must call it form the original class.
    }
}
