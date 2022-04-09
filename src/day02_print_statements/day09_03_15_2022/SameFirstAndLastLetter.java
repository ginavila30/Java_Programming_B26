package day02_print_statements.day09_03_15_2022;

public class SameFirstAndLastLetter { public static void main(String[] args) {
    String[]arr={"Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"};
    int same=0;
    String longestWord="";
    for (String each:arr){
        each=each.toLowerCase();
        if(each.charAt(0)==each.charAt(each.length()-1)){
            same++;

            if(each.length()>longestWord.length()){longestWord=each;}
        }
    }
    System.out.println(same+" Names have same first and last letter.\nThe longest word is: "+longestWord.substring(0,1).toUpperCase()+longestWord.substring(1) );
}
}