package day07_05_23_2022;
/*-Create an Interface "VoiceCallable"
        -instance variable : public static final boolean CAN_CALL=true;
        -abstract method : void call(String contact)
        -static method : void decline()
        -default method void accept()
*/

public interface VoiceCallable {
    boolean canCall= true; // by default public static final, value must be given right away.

    void call(String contact);
    static void decline(){
        System.out.println("Declining");
    };
    default void accept(){ //this method is to be called fromm the object that implements interface
        System.out.println(" Mike finally accepted voice call");
    }


}
