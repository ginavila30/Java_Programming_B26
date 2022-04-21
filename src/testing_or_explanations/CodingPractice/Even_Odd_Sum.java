package testing_or_explanations.CodingPractice;

public class Even_Odd_Sum {
    public static void main(String[] args) {
        int[]arr={5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int oddSum=0;
        int evenSum=0;

        for (int each:arr) {
            if(each%2==0){evenSum+=each;}else {oddSum+=each;}
        }

        if(oddSum>evenSum){
            System.out.println("Odd is the largest "+ "The difference is "+(oddSum-evenSum));
        }else {System.out.println("Even is the largest "+ "The difference is "+(evenSum-oddSum));}
    }
}
