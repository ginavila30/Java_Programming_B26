package day_02_02_16_2022;

public class CastingPractice {
    public static void main(String[] args) {
        //Implicit Casting smaller to bigger.
        byte b=10;
        short s=b;

        // Explicit Casting

        double a=5.3;
        int i=(int)a;
        System.out.println("i = " + i);// lost data

        // reverting with implicit casting

        a=i;// the data lost is not coming back.

        //long to int
        long l=99999999999l;// no casting here
        int i2=(int)l; // here is casting
        System.out.println("i2 = " + i2);



    }
}
