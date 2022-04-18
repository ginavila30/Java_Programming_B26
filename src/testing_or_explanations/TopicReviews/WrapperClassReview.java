package testing_or_explanations.TopicReviews;

public class WrapperClassReview {

    public static void main(String[] args) {
        char a='a';// primitive
        Character aObject=a;// converting a primitive type in to object: autoboxing. Manually
        System.out.println(a);// we can use any methods.
        System.out.println(Character.isDigit(aObject));
        System.out.println(Character.valueOf(a));

        String nums="123";// Object type
        System.out.println(nums+1);
        System.out.println(Integer.parseInt(nums)+1); // from object type to primitive by using wrapper class methods. Now it is int
        System.out.println(Double.parseDouble(nums));



        int num1=1; // primitive data type int
        System.out.println(String.valueOf(num1)+"hello");
        System.out.println(Double.valueOf(num1));
        System.out.println(Integer.valueOf(nums)+4);// now nums1 is an Integer

    }

}
