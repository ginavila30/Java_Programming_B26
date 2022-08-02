package day64_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*Use Predicate Functional interface to:
		1.1 Create a function that can verify if a number contains duplicate digits
*/
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

        System.out.println(verifyDuplicateDigits.test(123));
        //1.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
        //		        Password must be at least have 8 characters long, and should not contain space
        //		        Password should at least contain one upper case letter
        //		        Password should at least contain one lower case letter
        //		        Password should at least contain one special characters
        //		        Password should at least contain a digit

        Predicate<String>verifyStrongPassword= password->{
            boolean upperCase=false;
            boolean lowerCase=false;
            boolean specialChar=false;
            boolean digit=false;


            if(password.length()>=8&&!password.contains(" ")){
                for (int i = 0; i < password.length() ; i++) {
                    if(Character.isUpperCase(password.charAt(i))){
                        upperCase=true;
                    }
                    if(Character.isLowerCase(password.charAt(i))){
                        lowerCase=true;
                    }
                    if(!Character.isAlphabetic(password.charAt(i))){
                        specialChar=true;
                    }
                    if(Character.isDigit(password.charAt(i))){
                        digit=true;
                    }
                }
                return upperCase&&lowerCase&&specialChar&&digit;
            }
            return false;
        };
        System.out.println(verifyStrongPassword.test("Ilovem@jid123!"));
    }
}
