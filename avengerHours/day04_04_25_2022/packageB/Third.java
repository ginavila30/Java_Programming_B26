package day04_04_25_2022.packageB;

import day04_04_25_2022.packageA.First; // importing since I am calling a class from a different package.

public class Third extends First {
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.a);
       // System.out.println(obj.b);protected vx, I can access if there is inheritance relation. However it should be called from child object not parent object. See below.
        Third obj1=new Third();
        System.out.println(obj1.b);
       // System.out.println(obj.c); default only accessible within same package.
       // System.out.println(obj.d); only within same class -> private
        System.out.println(First.e);
    }
}
