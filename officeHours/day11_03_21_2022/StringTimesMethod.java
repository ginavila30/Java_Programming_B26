package day11_03_21_2022;

public abstract class StringTimesMethod {
    public static void stringTimes(String str,int times){
        for (int i = 0; i <times ; i++) {
            System.out.print(str);
        }

    }


    public static void main(String[] args) {
        stringTimes("Hi",5);
    }
}
