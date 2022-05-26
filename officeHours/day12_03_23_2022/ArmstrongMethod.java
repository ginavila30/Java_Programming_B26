package day12_03_23_2022;

public class ArmstrongMethod {
    public static void armstrongNum(int num) {
        String number = String.valueOf(num); //"153"
        char[] array = number.toCharArray();//{1,5,3}
                                            // 49

        int sum = 0;
        for (char each : array) {
            int temp = each - 48;//3
            int raisedto3 = temp * temp * temp;
            sum+=raisedto3;
        }

        if(sum==num){
            System.out.println(num+" is an armstrong number");
        }else {
            System.out.println(num+" is not an armstrong number");
        }
    }

    public static void main(String[] args) {
        armstrongNum(153);
    }
}

/*Mehmet Approach:

public static void isArmstrong(int number){

         int lastDigit=0;
         int totalDigits=0;
         int originalNumber=number;

         while(number>0){

             lastDigit=number%10;    // to find last digit

             System.out.println("lastDigit "+lastDigit);

             number/=10;
             //number=number/10;

             totalDigits+=lastDigit*lastDigit*lastDigit;

         }

        if(totalDigits==originalNumber){

             System.out.println(originalNumber);

        }

    }*/
