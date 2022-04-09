package day18_stringMethods;



public class EmptyOrBlank {
    public static void main(String[] args) {
    String str= "Last Example";
        System.out.println(str.isEmpty());// false there are characters in my string.
        str="";
        System.out.println(str.isEmpty());// true it is empty
        str=" ";
        System.out.println(str.isEmpty());// false there is a space and space is a character.
        System.out.println(str.isBlank());//true this method only works with any java 11 or newer.and it checks if your value is only white space, or it actually has some characters that are not space.
    }

}
