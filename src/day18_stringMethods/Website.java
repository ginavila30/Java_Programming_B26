package day18_stringMethods;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a url: ");
        String url=scan.nextLine();
        url=url.toLowerCase();
        boolean validStart=url.startsWith("www.");
        boolean validEnd=(url.endsWith(".com")||(url.endsWith(".edu"))||(url.endsWith(".gov"))||(url.endsWith(".net")));

      if(validStart&&validEnd){
          System.out.println(url+" is a valid url");}else{
          if(!validStart){
              System.out.println("url need to start with www.");
          }
          if(!validEnd){
              System.out.println("URL needs to end with .com or .edu or .net or .gov");
          }
      }
        }

        }





