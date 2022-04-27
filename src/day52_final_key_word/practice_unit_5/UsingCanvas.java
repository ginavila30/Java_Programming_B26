package day52_final_key_word.practice_unit_5;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingCanvas {
    public static void main(String[] args) {

        Quiz quiz1=new Quiz("Loops",20,100);
        Quiz quiz2=new Quiz("arrays",10,50);

        Canvas obj=new Canvas("Java");

        obj.quizzes.add(quiz1);
        obj.quizzes.add(quiz2);

        obj.modules.add(new Module(new ArrayList<File>(Arrays.asList(new File("Java",25), new File("Python",50)))));

        System.out.println(obj.modules);
        System.out.println(obj.quizzes);

        Canvas obj2=new Canvas("Html",obj.quizzes,obj.modules);
        System.out.println(obj2);
    }
}
