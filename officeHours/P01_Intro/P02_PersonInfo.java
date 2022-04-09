package P01_Intro;

public class P02_PersonInfo {
    public static void main(String[] args) {
        /*
         Task02:   Variables(Primitives - Non Primitives ),Concatenation and Escape Sequences

                      Create class named "PersonInfo" and make a main method

                            Create variables and give value related to you:

                                - String name
                                - byte age
                                - char gender
                                - boolean student
                                - short number of siblings
                                - long favorite number
                                - int number of seasons in your area
                                - double birth date: (month.day)
                                - int year
                                - String full birthday date with year
                                - String favorite quote
                                - Print the person information with using concat/escape characters

         */


String name="Gina", fullBirthdayDate="08.30.1994", favoriteQuote="You got this";
byte age=27;
char gender='F';
boolean isStudent=true;
short numberOfSiblings=2;
long favoriteNumber=75826;
int numberOfSeasons=4;
double birthDate=8.30;
int year=1994;
String fullBirthDate=""+birthDate+"."+year;
        System.out.println(fullBirthDate);
        System.out.println(name);
        System.out.println("age = " + age);
        System.out.println("favoriteQuote = " + favoriteQuote);

        System.out.println("========================Escape Sequence=========================");

        //DRY-> don't repeat yourself.
        // keep it simple.
        


    }
}
