package testing_or_explanations.CodingPractice;

public class SortCharactersOfString {
    public static void main(String[] args) {
        String str=" #h tml76";
String letters="";
String numbers="";
String specialChar="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                numbers+=str.charAt(i);
            }else if(Character.isLetter(str.charAt(i))){
                letters+=str.charAt(i);
            }else{
                if(str.charAt(i)!=' '){
                    specialChar+=str.charAt(i);
                }
            }
        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specialChar);
    }
}
