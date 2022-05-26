package testing_or_explanations.dardanTasks;
/*Number - Reverse negative number
Write a return method that can reverse negative number and return it as int*/
public class ReverseNegativeNumber {
    public static int reverseNegativeNum(int num) {
        int numPos = Math.abs(num);
        int result =0;


        while (numPos > 0) {
            result = result*10+ (numPos % 10);
            numPos /= 10;
        }

        if(num>0){return result;}else{return result*-1;}



    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(536));
    }

}
