package day53_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
      //  Exercise obj1=new Exercise();-> not possible because Exercise is a abstract class.

        Running obj2=new Running();
        System.out.println(obj2.name);
        //obj2.name="soccer"; I cant do this because name is a final variable, and value was already assigned from the constructor.
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));

    }
}
