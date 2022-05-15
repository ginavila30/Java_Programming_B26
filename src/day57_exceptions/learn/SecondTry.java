package day57_exceptions.learn;

public class SecondTry {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());//null.length()
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Array Index Out Of Bounds");
        }
    }
}
