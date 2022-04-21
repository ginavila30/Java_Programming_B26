package day50_inheritance.computer;

public class Mac extends Computer {
 public Mac(int memory){
     super("ios", memory); // hardcoding the os, because it is  fixed value. so no need to take it from argument.
 }

}
