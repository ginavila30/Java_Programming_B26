package day58_exceptions_recap.ink;
/*  create an instance method changeColor(String color)

        check if the given parameter of color is either black, red, or blue

            if it is not any of the specified colors throw the InvalidColorException

            if the color is valid assign it to the inkColor variable
*/
public class Pen {
    int inkLevel =30;
    String inkColor;

    public void write(){
        if(inkLevel<10){
            throw new OutOfInkException("Low ink level");
        }
        System.out.println("Writing with pen, 10 ink used");
        inkLevel-=10;
    }

    public void changeColor(String color) throws InvalidColorException{
        if(!color.equals("black")&&!color.equals("red")&&!color.equals("blue")){
            throw new InvalidColorException("Invalid Color Exception");
        }
        inkColor=color;
    }
}
