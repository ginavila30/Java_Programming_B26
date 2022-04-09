package day06_Arithmetic_Operators;

public class CastingExample {
    public static void main(String[] args) {
        // Widening casting converting from smaller to big. So not manually casting needed, it happens automatically.
        short numOne=40;
        float numTwo= numOne;
        System.out.println(numOne);
        System.out.println(numTwo);

        // Narrowing casting converting from bigger to smaller. Manually casting needed (line13)
        float numberThree=254.63f;// I added f at the end of the value to tell compiler it is a float number. Because compiler by default assumes that all decimals are double.
        short numberFour= (short)numberThree;
        System.out.println(numberThree);
        System.out.println(numberFour);

        float num5=300;// 300 is int by default,and it automatically goes to float.
        byte num6=(byte)num5; // When I casted a float to a byte I lost data that is why this does not return the number 300 but a different number based on internal java calculations.

        int test = 200;
        System.out.println((byte)test);// example of how to cast directly on my print statement. From int to byte.

        System.out.println(num5);
        System.out.println(num6);

        //Casting Char to Int

        char letter = 'A'; // when I cast the  char to int , the value of A based on ASCII will be the result.
        int letter2= letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter); // casting directly on my print statement by putting within parenthesis the data type I am casting in to.
        System.out.println((char)66);

        // Own practice
        char symbol='@';
        int symbol2 =symbol;

        System.out.println(symbol);
        System.out.println(symbol2);
        System.out.println((byte)symbol);
        System.out.println((char)22);
        System.out.println((int)'@');
    }
}
