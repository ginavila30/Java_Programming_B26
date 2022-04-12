package testing_or_explanations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayWithoutSort {
    public static void main(String[] args) {
//        int[]arr={9,4,23,6,78,4};
//        for (int i = 0; i < arr.length ; i++) {
////9
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] >arr[i]) {
//                    int temp=arr[i];
//                    arr[i]= arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
        // Second Approach
//        int[]arr3={9,4,23,6,78,4};
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int each:arr3){
//            list.add(each);
//        }
//        System.out.println(list);
//        ArrayList<Integer>newList=new ArrayList<>();
//
//        while(list.size()!=0){
//            Integer smallest= list.get(0);
//
//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i)<smallest){smallest=list.get(i);}
//            }
//            newList.add(smallest);
//            list.remove(smallest);
//
//        }
//        System.out.println("check "+newList);

//Third Approach

        int[] arr2 = {9, 4, 23, 6, 78, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr2) {
            list.add(each);
        }
        System.out.println(list);
        ArrayList<Integer> newList = new ArrayList<>();
        int count = 0;
        while (list.size() != 0) {

            arr2[count++] = Collections.min(list);
            list.remove(Collections.min(list));
        }
        System.out.println(Arrays.toString(arr2));

    }}
