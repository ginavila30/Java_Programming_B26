package day16_Review;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred language? English Spanish, Turkish, Russian or French ");
        String language = scan.nextLine();
        String message = "";
        boolean valid = true;

        switch (language) {
            case "English":
                message = "Hello, thank for your call";
                break;
            case "Spanish":
                message = "Hola, gracias por llamar";
                break;
            case "Turkish":
                message = "Erhaba, aradiginiz icin tesekkurler";
                break;
            case "Russian":
                message = "Privet, spasibo za vash zvonok";
                break;
            case "French":
                message = "Merci ,pour votre appel";
                break;
            default:
                System.out.println("Language not available");
                valid = false;

        }
        if (valid) {
            System.out.println(message);
        }


    }
}
