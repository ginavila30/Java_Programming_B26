package day52_final_key_word.practice_unit_5;

public class Quiz {
    String topic;
    int totalNumOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumOfQuestions, double totalPoints){
        this.topic=topic;
        this.totalNumOfQuestions=totalNumOfQuestions;
        this.totalPoints=totalPoints;
    }
    public String toString(){
        return "Topic->"+topic+" Total num of questions->"+totalNumOfQuestions+" Total points->"+totalPoints;
    }
    public void takeQuiz(){
        System.out.println("Taking the "+topic+" quiz.");
    }

}
