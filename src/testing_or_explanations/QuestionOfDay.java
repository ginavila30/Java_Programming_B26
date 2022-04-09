package testing_or_explanations;

public class QuestionOfDay {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        MethodReview.printSentence();
        MethodReview.printSentence(1);
    }
}
