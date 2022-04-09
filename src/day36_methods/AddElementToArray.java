package day36_methods;

import java.util.Arrays;

public class AddElementToArray {
    // below version of using fori loop
    public static int[] addElementToArray(int[] original,int elementToAdd){
        int[]newArray=new int[original.length+1];
        for (int i = 0; i <original.length ; i++) {
            newArray[i]=original[i];
        }
        newArray[newArray.length-1]=elementToAdd;
        return newArray;
    }
    // below version of using Arrays.copyOf:
    public static int[] addElementToArray2(int[] original,int elementToAdd){

      int[] newArray= Arrays.copyOf(original,original.length+1);
      newArray[newArray.length-1]=elementToAdd;
      return newArray;
    }
// Add element String
    public static String [] addElementToArray(String [] original, String elementToAdd){
        String[]newArray=new String[original.length+1];
        for (int i = 0; i <original.length ; i++) {
            newArray[i]=original[i];
        }
        newArray[newArray.length-1]=elementToAdd;
        return newArray;
    }
//     Add array to an array
//    public static int [] addElementToArray2(int [] original, int[] elementToAdd){
//        int[]newArray=new int[original.length+ elementToAdd.length];
//
//        for (int i = 0; i <original.length ; i++) {
//            newArray[i]=original[i];
//        }
//        for (int i = original.length, j=0; i < newArray.length ; i++,j++) {
//            newArray[i]=elementToAdd[j];
//        }
//          return newArray;
//        }

   //Approach 2 to add array to an array using only 1 loop
    public static int [] addElementToArray(int [] original, int[] elementToAdd){
        int[]newArray=new int[original.length+ elementToAdd.length];
        for (int i = 0, j=0; i < newArray.length ; i++) {
            if(i< original.length){
                newArray[i]=original[i];
            }else{newArray[i]=elementToAdd[j++];
            }
        }
        return newArray;
    }

// Testing methods in main
    public static void main(String[] args) {
        String[]arr={"a","b","c"};
        System.out.println(Arrays.toString(addElementToArray(arr,"d")));
        int[]a={1,2,3};
        int[]b={4,5,6};

        System.out.println(Arrays.toString(addElementToArray(a,b)));
    }
    }

