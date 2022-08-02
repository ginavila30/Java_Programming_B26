package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class reverseString {
    public static String reverseStr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean palindrome(String str) { //racecar
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void swapVar(int a, int b) {
        //a=15
        //b=10
        a += b; //25
        b = Math.abs(b - a);//15
        a -= b;//10

        System.out.println("a->" + a + "  b->" + b);

    }

    public static String findInitialsName(String name) {
        String[] words = name.trim().split(" ");
        String result = "";
        for (String word : words) {
            result += word.charAt(0) + " ";
        }
        return result;
    }

    public static int missingNumInArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return -1;
    }

    public static int
    findDisappearedNumbers(int[] nums) {
        int n = nums.length;//5
        int sum = ((n + 1) * (n + 2)) / 2;//6*7/2=21
        for (int i = 0; i < n; i++)
            sum -= nums[i];//20,18,14,9,3
        return sum;
    }

    public static int[] merge2Arrays(int []arr1, int []arr2){

        int length = arr1.length + arr2.length;

        int []merged= Arrays.copyOf(arr1,length);

//        for (int i = 0; i < arr1.length; i++) {
//            merged[i]=arr1[i];
//        }

        for (int i = arr1.length, j=0; i < merged.length; i++) {
            merged[i]= arr2[j++];
        }

        return merged;
    }



    public static void main(String[] args) {
        //System.out.println(reverseStr("apple"));
        //swapVar(15, 10);
        // System.out.println(findInitialsName("Jonh Doe"));
        // System.out.println(palindrome("ana"));

        //System.out.println(missingNumInArray(new int[]{1, 2, 4, 5, 6}));

        System.out.println(Arrays.toString(merge2Arrays(new int[]{1,2,3}, new int[]{4,5,6})));

    }

}
