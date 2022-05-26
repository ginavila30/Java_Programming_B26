package day07_05_23_2022;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp app1=new WhatsApp();
        app1.launch();
        app1.allOSCompatible=true;
        app1.isFree=true;
        app1.name="whats app";
        app1.setCount(20);
        app1.call("mehmet");
        app1.accept();// this is a default method from an interface, which can be only called from the object since it is not possibly overriden.
        VoiceCallable.decline(); //interface static method. It can't be inherited.

    }
}
