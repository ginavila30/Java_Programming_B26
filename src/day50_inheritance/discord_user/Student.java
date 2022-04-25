package day50_inheritance.discord_user;

public class Student extends DiscordUser {
    /*Create a class Student

    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat*/
    public Student(String name, String id) {
        super("Student", name, id);
    }

    public void sendMessage() {
        System.out.println("Sending message to class chat");
    }

}
