package day63_functional_interfaces;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface<String>printsEachChar= (str)->{
            for (int i = 0; i <str.length() ; i++) {
                System.out.println(str.charAt(i));
            }
        };
        DynamicInterface<Integer>printsNum5Times= (n)->{
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };

        printsEachChar.test("hello world");
        printsNum5Times.test(5);
    }
}
