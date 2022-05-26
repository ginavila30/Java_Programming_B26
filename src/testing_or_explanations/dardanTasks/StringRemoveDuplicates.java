package testing_or_explanations.dardanTasks;
/*String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC*/
public class StringRemoveDuplicates {
    public static String removeDuplicates(String str){

        String uniques="";
        for (int i = 0; i<str.length() ; i++) {
            if(!uniques.contains(""+str.charAt(i))){
                uniques+=str.charAt(i);
            }
        }

        return uniques;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCCFFGHHHIII"));
    }
}
