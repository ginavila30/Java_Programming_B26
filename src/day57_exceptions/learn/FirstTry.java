package day57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First Line");


try{
    String word = "Java";
    System.out.println(word.charAt(100));

}catch (Exception e){
    System.out.println("Exception happened in the catch block");

}

        System.out.println("Last Line");
    }


}
