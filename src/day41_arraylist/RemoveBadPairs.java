package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
//  Approach using a second Array list
//   public static ArrayList<Integer> removeBadPairs(ArrayList<Integer>nums){
//ArrayList<Integer> result=new ArrayList<>();
//       for (int i = 0; i < nums.size() ; i++) {
//           if(nums.get(i)>nums.get(i+1)){
//               i++;
//
//           }else{result.add(nums.get(i));
//                 result.add(nums.get(i+1));
//           i++;
//           }
//       }
//return result;
//   }

   public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> arr) {

        if (arr.size() % 2 == 0) {

            for (int i = 0; i < arr.size(); i++) {

                if (arr.get(i) < arr.get(i + 1)) {
                    i++;

                }else {
                    arr.remove(arr.get(i));
                    arr.remove(arr.get(i));
                    i--;
                }

            }

        } else {
            System.out.println("An Array list has to have a size of even number");
        }
        return arr;}

    public static void main(String[] args) {
       ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(3, 4, 1, 10, 8, 7,3,5,15,8));
        System.out.println(removeBadPairs(nums));
    }
}
