package day04_04_25_2022;

public class GradeActivity {
    /*Task 01 ; - Create a class GradeActivity (implement Encapsulation process)
                    - instance variable "double score";
                    - getter and setter methods
                    - getGrade() instance method; (returns the grade based on the score value as below)
                        100>=score>=90 -> return A
                        90>score>=80 -> return B
                        80>score>=70 -> return C
                        70>score>=60 -> return D
                        score<60     -> return F*/

    private double score;
    public void setScore(double score){
        this.score=score;
    }

    public double getScore() {
        return score;
    }

    public char getGrade(){
        char grade;
        if(score<=100&score>=90){grade='A';}else if(score>=80){grade='B';}else if(score>=70){grade='C';}else if(score>=60){grade ='D';}else{grade='F';}

        return grade;
    }
}
