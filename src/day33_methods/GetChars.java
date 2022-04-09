package day33_methods;

public class GetChars {

    /*
     *Method A-Z / Method a-z/ Method Z-A/ Method z-a/ Method 0-9
     */
    public static void main(String[] args) {
        alphabetCaps();

        alphabetLow();

        reverseAlphabetLow();

        reverseAlphabetCaps();

        numsUpto9();
    }

    public static void alphabetCaps() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "-");
        }
        System.out.println();// This is to make my code go to another line after I print run the method.
    }

    public static void alphabetLow() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + "-");
        }
        System.out.println();
    }

    public static void reverseAlphabetCaps() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + "-");
        }
        System.out.println();
    }

    public static void reverseAlphabetLow() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + "-");
        }
        System.out.println();
    }

    public static void numsUpto9() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + "-");
        }
        System.out.println();
    }
}
