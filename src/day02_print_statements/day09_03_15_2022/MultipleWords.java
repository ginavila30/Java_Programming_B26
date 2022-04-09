package day02_print_statements.day09_03_15_2022;

public class MultipleWords { public static void main(String[] args) {
    String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
    String [] wordsArray = words.split(",");

    for(String each:wordsArray){
        each=each.trim();
        if(each.contains(" ")){
            System.out.println(each);
        }
    }

}
}