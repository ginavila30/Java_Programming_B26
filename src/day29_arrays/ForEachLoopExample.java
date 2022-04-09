package day29_arrays;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] nums={30,12,159,12};
        // Traditional loop going element by element.
        for (int i=0; i< nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println();
        // for each loop going through each element.
        for (int element:nums){
            System.out.println(element);
        }
        System.out.println();

        // String example

        String [] classes={"java","soft skills","selenium","api"};
        // Traditional for loop
        for (int i=0; i< classes.length; i++){
            System.out.println(classes[i]);
        }
        System.out.println();
        // for each loop
        for (String eachCourse:classes){
            System.out.println(eachCourse);
        }
        System.out.println();
        //Double example 
        
        Double [] prices= {10.4,40.2,410.2};

        for (Double eachPrice : prices) {
            System.out.println("$ "+ eachPrice);
        }
    }
}
