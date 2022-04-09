package day06_Arithmetic_Operators;
/*create a class AverageScore
add a main method
declare and assign these variables:
   four score values

calcualte the average score using the given four score values

Ex:
   90, 80, 100, 95

   Print:
      Average: 91.25*/
public class AverageScore {
    public static void main(String[] args) {
        int score1=90;
        int score2=80;
        int score3=100;
        int score4=95;

        double averageScore=((double)(score1+score2+score3+score4)/4);

        System.out.println(averageScore);
    }
}
