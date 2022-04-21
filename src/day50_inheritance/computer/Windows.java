package day50_inheritance.computer;
// Windows is a Computer
public class Windows extends Computer {
public Windows(int memory){
    super("Windows",memory);// calls the parent constructor which sets the os vx to be "Windows" and sets the memory variable to be the argument from Windows constructor
}

}
