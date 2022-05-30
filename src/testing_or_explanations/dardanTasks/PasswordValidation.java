package testing_or_explanations.dardanTasks;
/*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
*/
public class PasswordValidation {
    public static boolean verifyPassword(String password){
        boolean validPassword = false;
        if(password.length()>=6){
            for (int i = 0; i < password.length() ; i++) {
                if(password.charAt(i)>='A'&&password.charAt(i)<='Z'){

                }
            }
        }
        return validPassword;
    }
}
