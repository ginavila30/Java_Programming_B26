package day04_04_25_2022.packageA;

public class First {
    public int a;
    protected int b;
    int c;
    private int d;
    public  static int e;
    public void met(){
        a=5;
        b=6;
        c=7;
        d=8;
        e=9;
    }

    public static void main(String[] args) {

        First obj1=new First();
        obj1.met();
        //within same class I can access all variables, including private.
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);
        System.out.println(obj1.d);
        System.out.println(e);// the static vx I can call it directly without class name since I am in same class.
    }
}
