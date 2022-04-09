package day32arraysclassnandmulti;

public class LastCharacter {
    public static void main(String[] args) {
        String [][]multiArray={{"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}};

        for (String[] eachArray:multiArray
             ) {
            String lastChars="";
            for (int i = 0; i < eachArray.length ; i++) {
                lastChars+=eachArray[i].charAt(eachArray[i].length()-1);

            }
            System.out.println(lastChars);

        }
//----------------------------------------------------------------------------------
        System.out.println("Saim's Approach");

        String[][] words = { {"James", "is", "back"}, {"he", "was", "never", "gone"}, {"methods", "tomorrow"}};

        for(String [] eachArray : words){

            for(String eachWord : eachArray){
                System.out.print(eachWord.charAt(eachWord.length() - 1)); // words[i][j].charAt(words[i][j].length() -1));
            }
            System.out.println();

        }
    }


}
