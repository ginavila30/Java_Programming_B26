package interviewNadir;

public class April_TwentyFirst {

    // testing password method accepts string password longer than 3, less than 16 and password should start with num
    // and end with letter.

    public static void checkPassword(String password){
        if(password.length()>3&&password.length()<16){
            if(Character.isDigit(password.charAt(0))){
                if(Character.isLowerCase(password.charAt(password.length()-1))||Character.isUpperCase(password.charAt(password.length()-1))){
                    System.out.println("Valid password");
                }
            }else{
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid password");
        }
    }

    public static void main(String[] args) {
        checkPassword("1elsej*k2");
    }
}
