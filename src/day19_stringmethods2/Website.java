package day19_stringmethods2;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the URL");
        String url= scan.nextLine();
        int indexNum= url.length()-4;

        System.out.println(url.substring(4,indexNum));
    }
}
