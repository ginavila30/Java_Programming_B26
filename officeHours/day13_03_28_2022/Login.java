package day13_03_28_2022;

public class Login {
    // Practicing return methods.
    public static boolean login(String username,String password){
        if(username.equalsIgnoreCase("cydeo")&&password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }
    public static boolean login(){
        String username=getUsername();
        String password=getPassword();
        if(username.equalsIgnoreCase("cydeo")&&password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }
    public static String getUsername(){
       // in automation, we will receive this information from external files
        return "cydeo";

    }
    public static String getPassword(){
        // in automation, we will receive this information from external files
        return "cydeo123";

    }

    public static void main(String[] args) {
        // below example of login method overloaded. 1 has two parameters the other has no parameters.

        boolean isLoginSuccessful=login("cydeo","cydeo123");// using login method with 2 parameters
        if(isLoginSuccessful){
            System.out.println("Welcome to CYDEO");
        }else{
            System.out.println("Check your password");
        }
        System.out.println("==========");
        isLoginSuccessful=login();// using login method without parameters
        if(isLoginSuccessful){
            System.out.println("Welcome to CYDEO");
        }else{
            System.out.println("Check your password");
        }

    }
}
