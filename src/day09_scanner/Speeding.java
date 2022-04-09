package day09_scanner;

public class Speeding {
    public static void main(String[] args) {
        int currentSpeed=58;
        int speedLimit=50;
        boolean areYouSpeeding=currentSpeed>speedLimit;

        System.out.println("Are you speeding: "+areYouSpeeding);

        int a =1;
        int b = -a-- + a++ / -a-- * --a;
        System.out.println(a);
        System.out.println(b);
    }
}
