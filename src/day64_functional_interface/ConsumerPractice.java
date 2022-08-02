package day64_functional_interface;

import java.util.function.Consumer;
/*Use Consumer functional interface to:

		1.1	Create a function that prints the first and last element of an array

		1.2 Create a function that prints the middle character/s of a String
*/
public class ConsumerPractice {
    public static void main(String[] args) {
        Consumer<Integer[]> firstAndLastElement = arr->{
            if(arr.length>0){
                System.out.println(arr[0]);
                System.out.println(arr[arr.length-1]);
            }else{
                System.out.println("Not elements in the Array");
            }
        };
        firstAndLastElement.accept(new Integer[]{2,3,7,5,8});

        Consumer<String>middleChar=str->{
            if(str.length()%2==0){
                System.out.println(str.charAt((str.length()/2)-1));
                System.out.println(str.charAt(str.length()/2));
            }else{System.out.println(str.charAt(str.length()/2));}
        };
        middleChar.accept("boat");
    }

}
