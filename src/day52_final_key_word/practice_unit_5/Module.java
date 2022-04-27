package day52_final_key_word.practice_unit_5;

import java.util.ArrayList;

public class Module {
     ArrayList<File>files;

//Constructor
     public Module(){
      files=new ArrayList<>();
     }

     public Module(ArrayList<File> files){
          this();
          this.files=files;
     }


     //methods
     public String toString(){
          return "Files->"+files;
     }
     public void addFile(File file){
          files.add(file);
     }

     public void removeFile(File file){
          files.remove(file);
     }





}
