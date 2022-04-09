package day27_nested_loops;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the stopping point:");
        int stop=0;
        String result="";
        for (int i = 1; i <=stop ; i++) {

            if(i%3==0&&i%5==0){
                result+="FINRA ";
            }else if(i%3==0){result+="FIN ";}else if (i%5==0){result+="RA ";}else{result+=i+" ";}

        }
        System.out.println(result);

    }
}
