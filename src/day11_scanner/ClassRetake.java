/*create a class Retake

declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade*/
package day11_scanner;

public class ClassRetake {
    public static void main(String[] args) {
        int grade=10;
        int attemptNum=1;

        if (attemptNum==1){
            System.out.println("The final grade is "+(grade*0.9));
        }else if (attemptNum==2){
            System.out.println("The final grade is "+grade*.8);
        }else if (attemptNum==3){
            System.out.println("The final grade is "+grade*0.65);
        }
    }
}
