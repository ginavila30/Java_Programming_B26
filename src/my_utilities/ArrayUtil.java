package my_utilities;


import java.util.Arrays;

public class ArrayUtil {
    //Min Number
    public static  int minNumber(int[]array){
       int minNum=array[0];
        for (int each:array) {
            if(each<minNum){
                minNum=each;
            }
        }
        return minNum;
    }
    //Min Number Second approach
    public static  int minNumberSorted(int[]array){
        Arrays.sort(array);
        return array[0];
    }

    //Max Number

    public static  int maxNumber(int[]array){
        int maxNum=array[0];
        for (int each:array) {
            if(each>maxNum){
                maxNum=each;
            }
        }
        return maxNum;
    }

    //Contains
    public static  boolean arrayContains(int[]array,int check){


        for (int each:array) {
            if(each==check){
                return true;
            }
        }
        return false;
    }
    //Add int element to array
    public static int[] addElement(int[]array,int num){
        int[]newArray=new int[array.length+1];
        newArray[newArray.length-1]=num;
        for (int i = 0; i <array.length ; i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }
    // Add element String to an array
    public static String [] addElementToArray(String [] original, String elementToAdd){
        String[]newArray=new String[original.length+1];
        for (int i = 0; i <original.length ; i++) {
            newArray[i]=original[i];
        }
        newArray[newArray.length-1]=elementToAdd;
        return newArray;
    }
    // Add array to an array
    public static int [] addElement(int [] original, int[] elementToAdd){
        int[]newArray=new int[original.length+ elementToAdd.length];
        for (int i = 0, j=0; i < newArray.length ; i++) {
            if(i< original.length){
                newArray[i]=original[i];
            }else{newArray[i]=elementToAdd[j++];
            }
        }
        return newArray;
    }

    // Find array Index of for int and String Arrays
    //the two codes below are example of overloading Method.
    static public int indexOf(int[]nums,int element){
        for (int i=0; i<nums.length;i++) {
            if(nums[i]==element){
                return i;
            }
        }

        return -1;// default value if the element i not found in array
    }
    static public int indexOf(String[]strs,String element){
        for (int i=0; i<strs.length;i++) {
            if(strs[i].equals(element)){
                return i;
            }
        }

        return -1;// default value if the element i not found in array
    }

}
