package day27_nested_loops;
/*Repeated Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : afc


*/
import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your input");
        String input = scan.nextLine().toLowerCase().trim();
        String result ="";

        for (int i=0; i<input.length();i++){
           if(!result.contains(""+input.charAt(i))){ // I check if it is contained  first to avoid running the inner loop when not needed.
            char toCheck=input.charAt(i);
            int count = 0;

            for (int j=0; j<input.length();j++){
                char letter= input.charAt(j);
                if (toCheck== letter){
                    count++;

                }

            }
            if (count>1){result+=toCheck;}
        }}
        System.out.println("Repeated characters: "+result);

    }
}

