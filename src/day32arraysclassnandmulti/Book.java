package day32arraysclassnandmulti;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many books are in the book");
        String[][]book=new String[ scan.nextInt()][];
        scan.nextLine();

        for (int i = 0; i < book.length ; i++) {
            System.out.println("Enter chapter: "+(i+1));
            String chapter= scan.nextLine();
            book[i]=chapter.split(". ");
            // String [] sentence= chapter.split(". "); Saim did it separate lines.
            //book[i]=sentence;

        }
        System.out.println(Arrays.deepToString(book));
    }
}
