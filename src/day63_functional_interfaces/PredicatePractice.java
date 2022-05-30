package day63_functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/*Use Predicate Functional interface to:
		1.1 Create a function that can verify if a number contains duplicate digits

		1.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        Password must be at least have 8 characters long, and should not contain space
		        Password should at least contain one upper case letter
		        Password should at least contain one lower case letter
		        Password should at least contain one special characters
		        Password should at least contain a digit*/
public class PredicatePractice {
    public static void main(String[] args) {
        Predicate<Integer>verifyDuplicateDigits= (num)->{
            boolean valid =false;
            List<Integer>list=new ArrayList<>();
            while (num>0){
                Integer digit=num%10;
                num=num/10;
                if(!list.contains(digit)){
                    list.add(digit);
                }else{
                    valid= true;
                    break;
                }
            }
            return valid;
        };

        System.out.println(verifyDuplicateDigits.test(15751));
    }
}
