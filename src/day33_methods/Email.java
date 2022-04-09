package day33_methods;

public class Email {
    public static  void buildEmail(String fullName,String domain) {

        String email = fullName.substring(0, 1);
        int space = fullName.indexOf(" ");
        email += fullName.substring(space + 1, space + 4);
        email += "@" + domain + ".com";
        System.out.println(email);
    }

    public static void main(String[] args) {
        buildEmail("James Bond","gmail");
        buildEmail("Gina Sodavi","hotmail");
    }
}