package day58_exceptions_recap.ink;

public class Runner {
    public static void main(String[] args) {//throws InvalidColorException  if I add this to main method I will allow compiling of the checked exception, but I am not handling it.
        Pen pen1=new Pen();
        try{
            pen1.write();
        }catch(OutOfInkException e){
            System.out.println(e.getMessage());
        }

        try{
            pen1.changeColor("Pink");
        }catch(InvalidColorException e){
            System.out.println(e.getMessage());
        }

    }
}
