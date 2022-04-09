package day37_wrapperclass;

public class UpperCaseEqualLowerCase {
    public static void main(String[] args) {
        String str="JAVA ijava";
        int upperCase=0;
        int lowerCase=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upperCase++;
            }else if(Character.isLowerCase(str.charAt(i))){
                lowerCase++;
            }
        }
        if(upperCase==lowerCase){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
