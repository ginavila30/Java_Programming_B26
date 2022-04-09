package ShortVideos;

public class CustomMethodsVoid {
    // Method is a function
    // Public is access modifier-> determines visibility, public means always available and open to the world.
    //Static modifier-> allows us t call method through class name.
    //return type->Determines if the method returns a value. when it is void it does not return.
    //method name-> should be descriptive and follows vx naming rules.
    // parenthesis -> follows method name and that is how we know it is a method, it can accept arguments inside it.
    public static void main(String[] args) {// main method needs to be separated from the method I created.
        displayMessage();// This will run the statements I created in my method displayMessage.
    }

        public static void displayMessage(){
            System.out.println("Hello World");
            System.out.println("I love Java");



        }

    }

