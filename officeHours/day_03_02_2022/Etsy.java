package day_03_02_2022;
/*
Task 1 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

		"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    		       (main category)

		According to this result print out main category name

			Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

			Output:
				Main Category name is  toys and games

			Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 				     (main category)

			Output:
				Main Category name is  toys and entertainment
*/
import java.util.Scanner;

public class Etsy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the url");
        String url= scan.nextLine();


        String mainCategory= url.substring(url.indexOf("c/")+2,url.indexOf("?"));
        mainCategory=mainCategory.replace('-',' ');

        if(mainCategory.contains("/")){
            mainCategory=mainCategory.substring(0,mainCategory.indexOf("/"));
            mainCategory=mainCategory.replace('-',' ');
        }
        System.out.println(mainCategory);
    }
}
