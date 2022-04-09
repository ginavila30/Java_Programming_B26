package day05_Variables;
// Char requires single ''quote, and I can only include 1 character. String is "" double quote, and I can add more than one character.
public class CharExamples {
    public static void main(String[] args) {
        //Below I assigned characters to the char data type.
        char letterOne='a';
        char letterTwo='Z';
        char numberOne='9';
        char specialOne='$';
        System.out.println(letterOne+letterTwo+numberOne+specialOne);// characters ASCII number is being added.
        System.out.println(letterOne+ "\n"+letterTwo+"\n"+numberOne+"\n"+specialOne); // New line between each other.
        System.out.println("chars:"+letterOne+letterTwo+numberOne+specialOne); // String in the beginning turns everything in to string and dont override the ASCII values of the char.
        // The example below shows how I assigned ASCII number corresponding to  character A Instead of assigning 'A'. At the end it printed the letter A because java knows that ASCII 65 is capital A.
        char letterThree=65;
        System.out.println(letterThree);


    }
}
