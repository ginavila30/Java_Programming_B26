package day11_03_21_2022;

public class P03_Deeper {
    // This is an example to see execution from top to bottom. when I call a method, It goes runs the entire method and goes back to run anything after method was called.
    public static void main(String[] args) {

        System.out.println("Not Deep");
        deep();
        System.out.println("Not Deep");

    }

    public static void deep(){
        System.out.println(" Deep");
        deeper();
        System.out.println(" Deep");
    }

    public static void deeper(){
        System.out.println("  Deeper");
    }

}
