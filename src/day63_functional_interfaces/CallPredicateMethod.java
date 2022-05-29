package day63_functional_interfaces;

public class CallPredicateMethod {
    public static void main(String[] args) {
        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicate.isPrime.test(5));// class where implementation was given with lambda. reference of the lambda implementation. name of the abstract method of predicate.
    }
}
