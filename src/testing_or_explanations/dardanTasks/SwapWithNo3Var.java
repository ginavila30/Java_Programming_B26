package testing_or_explanations.dardanTasks;

public class SwapWithNo3Var {
    public static void main(String[] args) {
        int a=10;//25
        int b=15;

        a+=b;
        b=Math.abs(b-a);
        a-=b;
        System.out.println("A->"+a);
        System.out.println("B->"+b);
    }
}
