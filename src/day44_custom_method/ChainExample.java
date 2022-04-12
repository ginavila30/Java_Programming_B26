package day44_custom_method;

public class ChainExample {
    public ChainExample(){
        System.out.println("First");
        //this(4)-> invalid because the chaining contains themselves. line8 line
    }
    public ChainExample(int i){
        this();
        System.out.println("Second");
    }
    public ChainExample(String s){
        this();
        System.out.println("Third");
    }
    public ChainExample(double d){
        this(0);
        System.out.println("Fourth");
    }
}
