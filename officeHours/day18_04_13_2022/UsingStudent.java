package day18_04_13_2022;

import day18_04_13_2022.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Gina");
        Student student2 = new Student("Ulugbek", 27);
        Student student3 = new Student("Simi", 27, 26);
        Student student4 = new Student("Elena", 30, 26);
        Student student5 = new Student("Majid", 27);

        Student[] arr = new Student[5];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
        arr[3] = student4;
        arr[4] = student5;

        String result = "";

        for (Student each : arr) {

            if (each.batchNum == 26) {
                result += "* " + each.name + " ";
            }
        }
        System.out.println(result);

        ArrayList<Student>list=new ArrayList<>();
        list.addAll(Arrays.asList(student1,student2,student3,student4,student5));

        list.removeIf(student -> student.age>27);
        System.out.println(list);



    }
}

