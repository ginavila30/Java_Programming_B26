package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {
        int num=20;
        System.out.println(num>5&&num<10); // true &&(and) false result is false.

        System.out.println(4>3 || false); //true ||(or) false so true is the result
        System.out.println(3>4 || false); // false ||(or) false so false is the result

        System.out.println(!false); // not false means true.
        System.out.println(!true); // npt true means false.

        boolean variable1= 15>=17;
        boolean variable2=18<15;

        System.out.println(variable1 && variable2);

    }
}
