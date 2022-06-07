package testing_or_explanations.dardanTasks;

import java.util.Arrays;

/*Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr);         ==>{ 7, 8, 9, 10};*/
/*Array -- Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};*/
public class ArraySortingAscending {
    public static Integer[] ArraySortingAscending(Integer[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]<arr[j]){
                    Integer temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static Integer[] ArraySortingDescending(Integer[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    Integer temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArraySortingAscending(new Integer[]{5, 8, 1, 3, 7})));
        System.out.println(Arrays.toString(ArraySortingDescending(new Integer[]{5, 8, 1, 3, 7})));
    }
}
