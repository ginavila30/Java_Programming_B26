package testing_or_explanations.TopicReviews;

public class MethodReview {
    //void method
    public static void printSentence() {

        System.out.println("Group 13 practice");
    }

    //return type method & overload example
    public static String printSentence(int group) {// overloaded the method by changing parameters and then we were able to change return tpe. We can overload by changing parameters data type, changing the number of parameters or changing the position of parameters.

        return "Group " + group + " practice"; // this string is reusable.
    }

    public static String printSentence(String group) {
        return "Group " + group + " practice"; // this string is reusable.
    }

    public static void main(String[] args) {
        printSentence();// void method, not reusable
        System.out.println(printSentence(13));// returns a String, method argument is int.
        String str=printSentence("13");// this is possible because it is a return type method.
        System.out.println(printSentence(13));// returns a String, method argument is String.

        //Ways to call a method:
        //calling a method in the same class where I created it-> I just need  to call the name -> printSentence();
        //calling a method in a different class  than the one where I created it but same package-> I  need  to call the class where I created it and then the name -> MethodReview.printSentence();
        //calling a method in a different class and different package than the one where I created it-> I  need  to import the package and class (import packagename.ClassName;) then call the class where I created it and then the name -> MethodReview.printSentence();

        //When we create a method information inside the (dataType Name) is called parameter. We can establish as many parameter as we want and the data tpe can be different.
        //When calling method the information inside () is called argument.


    }
}
