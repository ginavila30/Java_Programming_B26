package day52_final_key_word.practice_unit_5;

public class File {
    String name;
    double size;

    public File(String name,double size){
        this.name=name;
        this.size=size;
    }

    public String toString(){
        return "Name->"+name+" Size->"+size;
    }
    public void openFile(){
        System.out.println("Opening "+name);
    }

}
