package day01_04_04_2022;

public class CheckSix {
    public static boolean checkSix(int[]nums){

        return nums[0]==6||nums[nums.length-1]==6;
    }

    public static void main(String[] args) {
        System.out.println(checkSix(new int[]{2,6,6,6,6,1}));
    }
}
