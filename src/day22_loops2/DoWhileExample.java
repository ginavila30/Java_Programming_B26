package day22_loops2;

public class DoWhileExample {
    public static void main(String[] args) {
        int a=0;
        do{
            System.out.println(a);
            a++;

        }while(a<10);

        System.out.println("---------------------------");

        int a2=0;
        do{
            System.out.println(a2);
            a2++;

        }while(a==10);

        System.out.println("-------------As while loop----------");

        int a3=0;
        while(a3==10){
            System.out.println(a);
            a++;}
    }
}
