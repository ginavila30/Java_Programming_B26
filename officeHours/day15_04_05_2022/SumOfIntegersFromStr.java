package day15_04_05_2022;

public class SumOfIntegersFromStr {
    public static void main(String[] args) {
        String s="jav45ai1000sgre1at82";
int totalSum=0;
String temp="0";

        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i))){

                temp+=s.charAt(i);
            }
            if(!Character.isDigit(s.charAt(i))||i==s.length()-1){
                totalSum+=Integer.parseInt(temp);
                temp="0";

            }
        }
        System.out.println(totalSum);
    }
}


