package day53_abstraction.exercise;

public class Running extends Exercise {// concrete class, I must implement all abstract methods inherited.

    public Running(){
        super("Running");
    }

    @Override
    public void performExercise() {
        System.out.println("Running for fun");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*5;
    }
}
