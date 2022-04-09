package day02_print_statements.day09_03_15_2022;

public class IgnoreSixToSevenUsingEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,99,99};

        boolean stopAdding= false;
        int sum=0;

        for (int each:arr) {
             if(each==6){
                 stopAdding=true;
                 continue;

             }else if(each==7){
                 stopAdding=false;
                 continue;
             }else if(!stopAdding){
                 sum+=each;
             }
        }

        System.out.println(sum);
    }

}
