package day02_print_statements.day09_03_15_2022;

public class PracticingLongestOne {
    public static void main(String[] args) {
        String word="abcdefabcdefabcdefabcdef";
        String temp="";
        String longest="";
        System.out.println(longest.length());

        for (int i = 0; i <word.length()/2 ; i++) {
            temp+=word.charAt(i);
            String[]newArray=word.split(temp);

            if(newArray.length==0&&temp.length()>longest.length()){
                longest=temp;
            }
        }
        System.out.println(longest.length()!=0?longest:"There is not repetitive String");


    }
}
