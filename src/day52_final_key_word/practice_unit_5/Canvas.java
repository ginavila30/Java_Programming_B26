package day52_final_key_word.practice_unit_5;

import java.util.ArrayList;

public class Canvas {
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic){
        this.topic=topic;
        quizzes=new ArrayList<>();
        modules=new ArrayList<>();
    }
    public Canvas(String topic,ArrayList<Quiz> quizzes, ArrayList<Module> modules){
        this(topic);
        this.quizzes=quizzes;
        this.modules=modules;
    }

    @Override
    public String toString() {
        return "Canvas{" +
                "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules=" + modules +
                '}';
    }
}
