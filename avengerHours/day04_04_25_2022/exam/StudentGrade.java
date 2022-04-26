package day04_04_25_2022.exam;

import day04_04_25_2022.exam.FinalExam;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        /*- Create StudentsGrade runner class
                      -ask user how many question in the exam (Scanner)
                      -ask user how many question is missed (Scanner)
                      -give user the final grade*/

        Scanner scan=new Scanner(System.in);
        System.out.println("How many questions in the exam");
        System.out.println("How many question missed");
        FinalExam obj1=new FinalExam(scan.nextInt(), scan.nextInt());
        System.out.println(obj1.numericScore);
        System.out.println(obj1.getScore());
        System.out.println(obj1.getGrade());


    }
}
