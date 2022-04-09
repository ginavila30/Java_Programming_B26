package day13_03_28_2022;

public class CalcFeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double cm = 0;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            cm = ((feet * 12)+inches) * 2.54;
            return cm;

        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {
            double feet=(int)inches/12;
            double remainder=inches%12;
           return calcFeetAndInchesToCentimeters(feet,remainder);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
       System.out.println( calcFeetAndInchesToCentimeters(1,3));
       System.out.println( calcFeetAndInchesToCentimeters(15));

    }
}


