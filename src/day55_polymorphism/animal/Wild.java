package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        //all possible objcets for lizard
        //Reference is itself
        Lizard lizard1=new Lizard();
        lizard1.eat();
        lizard1.name="Lizard";
        lizard1.numOfClaws=3;
        lizard1.skinColor="Green";
        lizard1.walk();
        //reference is the direct super class
        Reptile lizard2=new Lizard();
        lizard2.eat();
        lizard2.name="Lizard";
        lizard2.numOfClaws=3;
        lizard2.walk();
        //lizard2.skinColor="Green"; This does not work because Reptile reference does not have access to skinColor vx.
        //reference is indirect super class
        Animal lizard3=new Lizard();
        lizard3.eat();
        lizard3.name="Lizard";
        //lizard3.walk();
//        lizard3.numOfClaws=3;
//        lizard3.skinColor="Green";
        //These do not work because Animal reference does not have access to skinColor, numOfClaws vx & walk().


    }
}
