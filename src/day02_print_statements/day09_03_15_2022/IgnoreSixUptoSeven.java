package day02_print_statements.day09_03_15_2022;

public class IgnoreSixUptoSeven {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,99,99,7,3,4};
// Use boolean to know when to add and when not to add.
        int sum=0;
        boolean stopAdding=false;
        for (int i = 0; i < arr.length ; i++) {
           if (arr[i]==6){
               stopAdding=true;
           }else if(arr[i]==7){
               stopAdding=false;
           }else if(!stopAdding) {sum+=arr[i];}

        }
        System.out.println(sum);

    }
}
