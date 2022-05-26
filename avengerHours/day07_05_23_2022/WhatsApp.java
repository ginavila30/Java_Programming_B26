package day07_05_23_2022;
/*Create a "WhatsApp" class that inherits VoiceCallable,VideoCallable and MessagingApp
        -implement required methods*/
public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable {


//Hiding static method, since I can't override static methods.
    public static void close() {
        System.out.println("closing WhatsApp");
    }

    @Override
    public void launch(){
        System.out.println("Launching WhatsApp");
    }

    @Override
    public void sendMessage(String msg) {

    }

    @Override
    public void videoCall(){
        System.out.println("Video calling via WhatsApp");
    }
    @Override
    public void call(String contact){
        System.out.println("Calling "+contact);
    }


}
