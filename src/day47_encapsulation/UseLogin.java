package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {
        Login obj1 = new Login();
        //The variables below are private instance vxs, so I can't access them outside the class directly.
        //obj1.userName="James Bond";
        // obj1.password="1234";

        // Using setter method below to give value to the hidden data without accessing it directly.
        obj1.setUserName("jamesbond");
        obj1.setPassword("1234");

        //Below I can't access those vxs directly because they are private, so I need getter methods.
        // System.out.println(obj1.userName);
        // System.out.println(obj1.password);

        // Using getter method to access the private vxs
        obj1.getPassword();
        obj1.getUserName();

        obj1.setPassword("ginaSodavi123"); // using setter to assign a value to password
        System.out.println(obj1.getPassword()); // printing to see changes.

    }
}
