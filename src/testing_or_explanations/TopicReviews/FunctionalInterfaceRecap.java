package testing_or_explanations.TopicReviews;

import java.util.function.*;

public class FunctionalInterfaceRecap {

   public static Practice<Integer,String> integerToString = (num)->{
        return ""+num;
    };

    public static void main(String[] args) {
        String str =FunctionalInterfaceRecap.integerToString.display(20);

        Predicate<Integer>isOddNum = (num)->{ // accepts 1 parameter any object type and returns boolean
            return  num%2!=0;
        };
        System.out.println("isOddNum.test(20) = " + isOddNum.test(20));
        System.out.println("isOddNum.test(15) = " + isOddNum.test(15));

        Consumer<String>printStr= (s)->{// accepts 1 parameter any object type, and its void method no return type
            System.out.println(s);
        };

        printStr.accept("group 12!");

        Function<String, Integer> lengthOfStr= (word)->{ //accepts 1 parameter any object type, and it returns any object type that I defined
            return word.length();
        };
        System.out.println("lengthOfStr.apply(\"hello\") = " + lengthOfStr.apply("hello"));

        BiPredicate<String, String> stringsAreEqualLength = (s1, s2)->{ // accepts 2 parameters any object type and returns boolean
            return s1.length()==s2.length();
        };
        System.out.println("stringsAreEqualLength.test(\"hello\",\"java\") = " + stringsAreEqualLength.test("hello", "java"));
        System.out.println("stringsAreEqualLength.test(\"hi\",\"no\") = " + stringsAreEqualLength.test("hi", "no"));

        BiConsumer<Integer, Integer> sumOf2Num = (n1,n2)->{ // accepts 2 parameter any object type, and its void method no return type
            System.out.println(n1+n2);
        };
        sumOf2Num.accept(5,8);

        BiFunction<Integer,Integer,Boolean> divisibility= (num1, num2)->{ ////accepts 2 parameters any object type, and it returns any object type that I defined
            return num1%num2==0;
        };
        System.out.println("divisibility.apply(15,3) = " + divisibility.apply(15, 3));
        System.out.println("divisibility.apply(24,7) = " + divisibility.apply(24, 7));

    }

}
