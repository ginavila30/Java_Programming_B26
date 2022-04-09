package day33_methods;

public class MyMathClass {
    public static void add(double num1,double num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));

    }
    public static void subtract(double num1,double num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));

    }
    public static void multiply(double num1,double num2){
        System.out.println(num1+" * "+num2+" = "+(num1*num2));

    }
    public static void division(double num1,double num2){
        if(num2!=0){
        System.out.println(num1+" / "+num2+" = "+(num1/num2));}else{
            System.err.println("Can not divide by 0"); // err. makes the print red, so it shows it is an error.
        }

    }


    public static void main(String[] args) {
        add(4.5,8.6);
        add(5,8);// this automatically cas int to double.
        // int a= add(3.4,12.2); We cannot assign anything because our methods are void.
        division(4,0);// This tells me that number cannot be divided by 0. line 19.
    }
}
