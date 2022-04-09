package day12_if_statements;
/*create a class ChooseLanguage

ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French

based on the number they picked print a message:

	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
*/
import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number based on the language yoy want to use. \n" +
                "\t1 - English\n" +
                "\t2 - Spanish\n" +
                "\t3 - Turkish\n" +
                "\t4 - Russian\n" +
                "\t5 - French");
        int language= scan.nextInt();

        if (language==1){
            System.out.println("Hello, thank for your call");
        }else if (language==2){
            System.out.println("Hola, gracias por llamar");
        }else if (language==3){
            System.out.println("Erhaba, aradiginiz icin tesekkurler");
        }else if (language==4){
            System.out.println("Privet, spasibo za vash zvonok");
        }else if (language==5){
            System.out.println("Merci ,pour votre appel");
        }else{
            System.out.println("We will use English by default");
        }

    }
}
