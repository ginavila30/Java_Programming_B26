package day51_inheritance.access.b;

import day51_inheritance.access.a.First;
// Different class and different package.
public class Third {
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
        //System.out.println(obj.two); No access because it is protected, if there is no inheritance protected has same visibility as default.
        //System.out.println(obj.three); No access because it is default, which is only accessible in same package.
        //System.out.println(obj.four); No access because it is private. so only accessible in same class.
    }
}
