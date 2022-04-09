package day04_02_23_2022;

public class BMI {
    public static void main(String[] args) {

        double mas= 82.4;
        double height=1.82;
        double BMI= mas/(height*mas);
        String message="";

        if (BMI<18.5){message="underweight";}else if (BMI>=18.5&&BMI<25){
            message="normal weight";}else if (BMI>=25&& BMI<30){message="over weight";}else{message="obese";}

        System.out.println("Your BMI index refer: "+message);

        // BMI WITH TERNARY BELOW:

        String result=BMI<18.5?"underweight":BMI>=18.5&&BMI<25?"Normal Weight":BMI>=25&& BMI<30?"overweight":"obese"; // Ternary version
        System.out.println(result);
    }
}
