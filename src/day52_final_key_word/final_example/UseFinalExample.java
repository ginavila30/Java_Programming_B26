package day52_final_key_word.final_example;

import day52_final_key_word.final_example.FinalExample;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
      //  FinalExample.PLANET="Mars"; I cant change a final variable
        FinalExample obj=new FinalExample(20);
        System.out.println(obj.a);// instance final vx
        System.out.println(obj.b);// instance final vx

        FinalExample obj2=new FinalExample(100);
        System.out.println(obj2.b);//instance final vx
        //obj and obj2 have different values for b because wven though it is final the vx is instance vx so each copy has a copy. But obj2 can't change the value 100 because once assigned it is a final. Same for obj.
    }
}
