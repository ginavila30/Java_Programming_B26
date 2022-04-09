
package day21_loops;
public class LoopPracticeAlphabet {
    public static void main(String[] args) {
        // a - z lowercase

        char lowercaseUp = 'a';

        while(lowercaseUp <= 'z'){
            System.out.print(lowercaseUp + " ");
            lowercaseUp++;
        }

        System.out.println();
        // Z - A uppercase

        char uppercaseBack = 'Z'; // int i = 122

        while(uppercaseBack >= 'A'){  // i >= 97
            System.out.print(uppercaseBack + " "); // (char)i
            uppercaseBack--;
        }
    }}
