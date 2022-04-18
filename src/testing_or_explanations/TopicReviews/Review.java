package testing_or_explanations.TopicReviews;
/*
*/
public class Review {
    public static void main(String[] args) {

        String str= "zopXzop";



        for (int i = 0; i <str.length()-2 ; i++) {
            if (str.substring(i,i+3).toLowerCase().startsWith("z")&&str.substring(i,i+3).toLowerCase().endsWith("p")){
                str=str.replaceFirst(""+str.charAt(i+1),"");
            }
        }
        System.out.println(str);
    }
}
