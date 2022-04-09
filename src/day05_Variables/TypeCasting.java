package day05_Variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b;


        int i2 = 100;
        byte b2= (byte)i2; // int is bigger than byte, so we must cast. We cast the int type - i2 to a byte using (byte).

        int i3 =500;
        long l1= i3; // int is smaller than long, so it will automatically cast.

        long l2= 200;
        int i4= (int)l2; //This is how I go from long to int. so I must cast it.

        long l3 = 10000000000000000l;
        int i5 = (int)l3;

        double d = 50; // Trying to go from double type to int type. double is bigger, so I need to cast.
        int i6= (int)d;

        System.out.println(""+d+ " " + i6);

    }
}
