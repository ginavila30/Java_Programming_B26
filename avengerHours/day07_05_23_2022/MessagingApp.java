package day07_05_23_2022;
/* Create an Abstract class "MessagingApp"
        -instance variables : public String name, protected boolean isFree, boolean allOSCompatible, private int count
        -static variable : public static final String APP_TYPE ;
        -no-args constructor
        -abstract method : void sendMessage(String msg)
        -static method : void close()
        -instance method : void launch()
        - encapsulate the private variable (count)*/
public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private  int count;

    public static final String APP_TYPE="";


    //Abstract methods, can't be static final or private
    public static  void close(){
        System.out.println("Messaging app is closing");
    }
    public  void launch(){
        System.out.println("Messaging app is launching");
    }
   public abstract void sendMessage(String msg);

    public int getCount() {
        return count;
    }
    public void setCount(int count){
        this.count=count;
    }

    public MessagingApp(){
        System.out.println("Not args constructor");
    }
    public MessagingApp(String name, int count){
        this.name=name;
        this.count=count;
    }
}
