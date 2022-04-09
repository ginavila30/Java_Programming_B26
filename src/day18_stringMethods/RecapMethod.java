package day18_stringMethods;

public class RecapMethod {
    public static void main(String[] args) {

        String s="pen"; // s is string literal, so it is in the string pool.
        String s2=new String("pen");// s2 is object in the heap because we used new keyword.
        System.out.println("compare with =="+ (s==s2));// false because they are in different spots in the memory. == checks and compares the location of the object not the value.
        System.out.println("compare with .equals()"+(s.equals(s2))); // true because they have same characters.
        System.out.println("Compare with .equals() "+s.equals("Pen"));// false s is lower case and "Pen" first is capital.
        System.out.println("Compare with .equalsIgnoreCase() "+s.equalsIgnoreCase("Pen"));// true, this method disregards case sensitivity.
        int len=s.length();//3 characters in word pen
        System.out.println(len);//3
        if(s.length()>4){//3>4 false
            System.out.println("long word");
        }else{
            System.out.println("short word");// this will be printed.
        }

    }
}
