package day51_inheritance.access.b;

import day51_inheritance.access.a.First;
// diff class, diff package with inheritance
public class Four extends First { // First is parent Four is child
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
        //System.out.println(obj.two);
        //System.out.println(obj.three);
        //System.out.println(obj.four); No accessible because it is private. so only accessible in same class.

        Four obj2=new Four();
        System.out.println(obj2.one);
        System.out.println(obj2.two);// it is protected variable but since Four is inheriting First, now objects from Four also have access to protected variables from First.
    }
}
