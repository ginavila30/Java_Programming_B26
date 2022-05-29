package day63_functional_interfaces;

import java.util.function.Predicate;

public class UsePredicate {
    public static Predicate<String> isPalindrome = str ->{
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse); // the return type is defined by the functional interface predicate
    };

    public static Predicate<Integer> isPrime =n->{

        for (int i = 2; i < n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    };
}
