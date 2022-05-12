package testing_or_explanations.dardanTasks;
/*Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"*/
public class EvenOrOdd {

    public static String evenOrOdd(int num){
        if(num%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(15));
        System.out.println(evenOrOdd(2));
    }
}
