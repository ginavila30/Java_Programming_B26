package day33_methods;

public class OurArrayClass {
    public static void firstElement(int[]nums){
        System.out.println("First Element: "+nums[0]);
    }
    public static void lastElement(int[]nums){
        System.out.println("Last Element: "+nums[nums.length-1]);
    }
    public static void middleElement(int[]nums){
        if(nums.length%2==0){
            System.out.println("Middle Element: "+nums[(nums.length/2)-1]+" and "+nums[nums.length/2]);
        }else{System.out.println("Middle Element: "+nums[nums.length/2]);}

    }
    public static void printArray(int[]nums){
       String result="START|";
        for (int each:nums) {
            result+=each+"~";
        }
        result+=" |END";
        System.out.println(result);
    }

    public static void main(String[] args) {
// Example of middle element with odd amount of elements.
        int[]arr={50,0,10,500,20,40,124};
        firstElement(arr);
        lastElement(arr);
        middleElement(arr);
// Example of middle element with even amount of elements.
        int[]arr2={50,0,10,500,20,40,124,600};
        firstElement(arr);
        lastElement(arr);
        middleElement(arr);
// Example of printing array with the method I created.
        printArray(arr2);

        printArray( new int[]{2,3,5});// In this case I don't need to name for the array.by this way you are not declaring an array , just instantiating. consider it just like putting there a variable name or directly an integer. eg int a = 5; ----> methodName(a) and methodName(5).

    }

}
