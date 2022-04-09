package day34_return_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();
        int score = getCreditScore();// assigning 800 to score
        System.out.println(score);//800
        System.out.println(getCreditScore());//800
        System.out.println(getCreditScore() + 50);//850
        System.out.println(isGoodCreditScore(680));// false
        System.out.println(isGoodCreditScore(720));//true
        System.out.println(isGoodCreditScore(getCreditScore()));
        System.out.println(isGoodCreditScore(500)?"Yes":"No");
    }

    public static int getCreditScore() {
        return 800;
    }
    public static boolean isGoodCreditScore(int creditScore) {
        if (creditScore>=700){
            return true;
        }else {return false;}

        //shorter approach
         /*
    public static boolean isGoodCreditScore(int creditScore){
        return creditScore >= 700;
    }
     */
    }

}
