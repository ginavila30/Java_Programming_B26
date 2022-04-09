package day36_methods;

public class SumOfElements {
//    Normal version to declare method below
//    public static int sum(int[]nums){
//        int sum=0;
//        for (int each:nums) {
//            sum+=each;
//        }
//        return sum;
//    }

    // var args -> ... allows me enter element values without creating an array object.\


public static int sum(int...nums){// var args in my parameter.
        int sum=0;
        for (int each:nums) {
            sum+=each;
        }
        return sum;
 }

    public static void main(String[] args) {
        System.out.println(sum(4,6,2,6,12,4)); // Since it was declared as var args, now I can just enter directly the values separated by come.without having to create the original syntax of the array object.
    }
}

