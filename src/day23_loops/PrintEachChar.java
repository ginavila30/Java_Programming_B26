package day23_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String s="java";

        for(int i=0;i<s.length();i++){

            System.out.println(s.charAt(i));
        }
        System.out.println("reverse");
        for (int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
    }
}
