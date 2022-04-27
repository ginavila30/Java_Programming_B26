package day52_final_key_word.practice_unit_5;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingModule {
    public static void main(String[] args) {
        File file1 = new File("java", 20);
        File file2 = new File("html", 15);
        File file3 = new File("txt", 25);
        File file4 = new File("java", 30);
        File file5 = new File("html", 50);
        File file6 = new File("txt", 5);

        ArrayList<File> list = new ArrayList<>(Arrays.asList(file1, file2, file3));

        Module obj1 = new Module();// Empty array list -> data type is File
        obj1.addFile(file4);
        obj1.addFile(file5);
        obj1.addFile(file6);
        obj1.removeFile(file6);
        System.out.println("object1-> "+obj1);

        Module obj2 = new Module(list);
        System.out.println("object2-> "+obj2);
    }
}
