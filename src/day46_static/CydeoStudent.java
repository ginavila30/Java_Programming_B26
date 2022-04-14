package day46_static;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class CydeoStudent {
    //Instance vxs-> belong to object
    String name;
    int groupNum;
    //Static vxs -> belong to class
    static int batchNum;
    static String[] instructors;
    static String schoolName;

    // Using static block
    static {
        batchNum = 26;
        instructors = new String[]{"Saim", "Nadir", "Mehmet", "Austin", "Aysun"};
        schoolName = "Cydeo";
        printInfo();// using a static method in the static block.
    }

    //Constructor
    public CydeoStudent(String name, int groupNum) {
        this.name = name;
        this.groupNum = groupNum;
    }
    public static void printInfo(){
        System.out.println("School Name "+schoolName);
        System.out.println("Batch Number "+batchNum);
        System.out.println("Instructors "+ Arrays.toString(instructors));
    }

    //toString()
    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNum=" + groupNum +
                '}';
    }
}
