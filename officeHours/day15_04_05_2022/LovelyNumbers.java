package day15_04_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 //IQ --> Task 4 :

           /*
               We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').

                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.

               */

public class LovelyNumbers {
    public static void main(String[] args) {
        int number=17765;
        String str=String.valueOf(number);//17765
        String[]arr=str.split("");//{1,7,7,6,5}
        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));//<1,7,7,6,5>
        boolean lovelyNum= true;
        for (String each:list) {
            if(Collections.frequency(list,each)>2){
                lovelyNum=false; break;
            }
        }
        System.out.println(lovelyNum?1:0);

    }
}
