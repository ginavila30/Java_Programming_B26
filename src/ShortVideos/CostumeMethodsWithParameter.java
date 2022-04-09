package ShortVideos;

public class CostumeMethodsWithParameter {
    public static void main(String[] args) {

        //I create methods out pf the main method, but I run them once created inside the main method.
        displayValue(10);
        eligibleToVote(21,true);
        oddOrEven(15);

    }
    public static void displayValue(int num){
        System.out.println("Value: "+num);
    }

    public static void eligibleToVote(int age, boolean isCitizen){
        if(age>=18&&isCitizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void oddOrEven(int num){
        if(num%2==0){
            System.out.println(num+" Is even");
        }else{
            System.out.println(num+" Is odd");
        }
    }
}
