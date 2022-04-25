package day04_04_25_2022;

public class FinalExam extends GradeActivity {
    /*- Create a class FinalExam (subclass of GradeActivity)
                     - Instance variables: -int numQuestion (total question number in the exam)
                                       -double pointsEach  (points per each question)
                                       -int numMissed   (number of wrong answers)*/
    public int numQuestion;
    public double pointEach;
    public int numMissed;
   public double numericScore;
    //- Constructor; parameters -> numQuestions, numMissed assign these parameters

    public FinalExam(int numQuestion, int numMissed) {
        this.numQuestion = numQuestion;
        this.numMissed = numMissed;
    }
    // - Instance method ; calcNumericScore()
    //                         first calculate the pointsEach  (based on 100 pts)
    //                         then declare a numericScore variable and calculate => formula;  (100-(numMissed*pointsEach))
    //                         then call setScore() method with numericScore variable


    public void calcNumericScore(){
       pointEach=100/numQuestion;
       numericScore=100-(numMissed*pointEach);
       setScore(numericScore);

    }

}
