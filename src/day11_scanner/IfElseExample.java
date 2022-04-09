package day11_scanner;

public class IfElseExample {
    public static void main(String[] args) {
        int score=50;
        if(score>=75){
            System.out.println("passing");
        }else{
            System.out.println("failing");}

        int year=2021;
        boolean lockdown=year==2020||year==2021;
        if(lockdown){
            System.out.println("stay home, wear a mask, practice Java");
        }else{
            System.out.println("Party, travel, practice Java");}

    }
}
