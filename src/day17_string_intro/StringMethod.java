package day17_string_intro;

public class StringMethod {
    public static void main(String[] args) {
        String name= "james";

        String name2= new String("james");
        // How to compare String values: Note-> never do == to compare Strings.
        System.out.println(name.equals("james"));// true

        System.out.println("cat".equals("dog"));// false
        System.out.println(name.equals(name2));// true. because equals is not checking where the variable and value is being stored. Instead, it is checking that the characters are same.
        System.out.println(name.equals("James"));// false, they are different because of  case sensitivity; upper case and lower case.
        // note-> .equals gives me boolean result

        String a= new String("hello");
        String b= new String("hello");

        System.out.println(a.equals(b));// true, because sequence of characters are the same.

        // example on how to compare Strings and ignore case sensitivity

        System.out.println(name.equalsIgnoreCase("James"));// true because it is ignoring case sensitivity.

        // example how to count how many characters are in a String. note that space is count as a character.

        System.out.println(name.length());

        String last="Today was fun";
        System.out.println(last.length());







    }
}
