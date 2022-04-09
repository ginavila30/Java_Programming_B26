package day11_03_21_2022;

public class P02_PasArgs {
    public static void main(String[] args) {
        sum(3,4);
        int a=3;
        int b=4;
        sum(a,b);
        //sum(3.3,4);// error because compiler only does implicit casting automatically
        sum((int).3,4); // we did cast explicitly
    }

    public static void sum(int a, int b) {
        System.out.println(a+b);

    }
}
