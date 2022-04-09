package day29_arrays;

import java.util.Scanner;

public class Countries { public static void main(String[] args) {
    String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"
    };


    char firstChar;
    char lastChar;
    String listOfCountries="";

    for (String each : countries) {
        firstChar= each.charAt(0);
        lastChar=each.charAt(each.length()-1);
        System.out.println("First Char: "+firstChar+" Last Char: "+lastChar);
    }
    for (String each : countries) {
        lastChar=each.charAt(each.length()-1);
        if(lastChar=='a'){System.out.println(each);
        }
        listOfCountries+=each+" ";
    }

    Scanner scan = new Scanner(System.in);
    System.out.println("What country do you want to check?");
    String check= scan.nextLine();
    System.out.println("Does the array contains the country name: "+listOfCountries.toLowerCase().contains(check));
}
}