package day18_stringMethods;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {
        String str="sNOw"; // String literal.

        System.out.println(str.toUpperCase());// method directly use in the print statement. returns SNOW.
        System.out.println(str.toLowerCase());// method directly use in the print statement, returns snow.

        System.out.println(str);// up to here the value(object) of my string is still the original one.

        str=str.toUpperCase(Locale.ROOT); // Once I reassign it to the object of the word all lower case now my object is linked to a different value.
        System.out.println(str);// now it prints all the word uppercase.

        String word="HELLO";
        word=word.toLowerCase();
        System.out.println(word);

        word+="WORLD";// this is shortcut for word=word+"next text". So basically it is reassigning value. String object does not change, it is immutable.

        System.out.println(word);
    }
    }


