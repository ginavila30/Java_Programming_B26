package day07_05_23_2022;
/*Create a "CallApp" class that inherits the VoiceCallable and MessagingApp
        -implement the required methods*/
public class CallApp extends MessagingApp implements VoiceCallable{


    public void call(String contact){
        System.out.println("calling "+contact);
    }
    public void decline(){
        System.out.println("declining call");
    }
    public void accept(){
        System.out.println("accepting call");
    }

    public static void close(){
        System.out.println("closing Call App");
    }
    public  void launch(){
        System.out.println("Launching Call App");
    }

    @Override
    public void sendMessage(String msg) {

    }

}
