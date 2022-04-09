/*declare and assign an age variable

use these ranges to determine which age group you belong to

	if the given age value is less than 0 or more than 120:
		print: Invalid age

	otherwise uses these to determine the age group

		Baby (2 years and below)
		Toddler (3 - 5)
		Kid (6 - 9
		Pre-Teen (10 - 12)
		Teenager (13 - 17)
		Young Adult (18 - 20)
		Adult (21 - 35)
		Middle-Aged Adult (36 - 55)
		Senior Citizen (55+)
*/
package day14_nested_if_statements;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age= scan.nextInt();
        String ageGroup;

        if (age>0&&age<120){
            if(age==2){ageGroup="Baby";}
            else if(age>=3&&age<=5){ageGroup="Toddler";}
            else if(age>=6&&age<=9){ageGroup="Kid";}
            else if(age>=10&&age<=12){ageGroup="Pre-Teen";}
            else if(age>=13&&age<=17){ageGroup="Teenager";}
            else if(age>=18&&age<=20){ageGroup="Young Adult";}
            else if(age>=21&&age<=35){ageGroup="Adult";}
            else if(age>=36&&age<=55){ageGroup="Middle-Aged Adult";}
            else{ageGroup="Senior Citizen";}
        }else {ageGroup="Invalid Age";
        }
        System.out.println(ageGroup);

    }
}
