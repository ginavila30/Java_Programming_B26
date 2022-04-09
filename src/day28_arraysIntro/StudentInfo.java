package day28_arraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Version when I know the values in advanced.
        String[] studentInformation = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentInformation));

        // Hardcoded version assigning values after initializing(declaring) the array .

        String[] studentInfoHardcoded = new String[4];
        studentInfoHardcoded[0] = "010";
        studentInfoHardcoded[1] = "Jamie";
        studentInfoHardcoded[2] = "Smith";
        studentInfoHardcoded[3] = "26";
        System.out.println(Arrays.toString(studentInfoHardcoded));

        // Scanner Version

        String[] studentInfoWithScan = new String[4];
        System.out.println("Enter the ID");
        studentInfoWithScan[0] = scan.nextLine();
        System.out.println("Enter Name");
        studentInfoWithScan[1] = scan.nextLine();
        System.out.println("Enter Last Name");
        studentInfoWithScan[2] = scan.nextLine();
        System.out.println("Enter Batch #");
        studentInfoWithScan[3] = scan.nextLine();

        System.out.println(Arrays.toString(studentInfoWithScan));

        // loop version
        String[] studentInfoWithLoop = new String[4];
        String[] questions = {"Enter your Id", "Enter First Name", "Enter Last Name", "Enter Batch #"};
        for (int i = 0; i < studentInfoWithLoop.length; i++) {
            System.out.println(questions[i]); // reading each element from questions array
            studentInfoWithLoop[i] = scan.nextLine(); // assignig value to each element in student info with loop

        }
        System.out.println(Arrays.toString(studentInfoWithLoop));


    }
}
