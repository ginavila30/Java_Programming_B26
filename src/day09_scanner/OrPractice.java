package day09_scanner;

public class OrPractice {
    public static void main(String[] args) {

    int apples=5;
    int oranges=10;

        System.out.println(apples>6||oranges<1); // false or false --> result false
        System.out.println(apples>10 || oranges>=10); // false or true --> result true
        System.out.println(apples>10 && oranges>=10); // false AND true --> result false. Because && requires both to have the rule.

        // Discount if it's friday, teacher, police, firefighter

        boolean isFriday= true;
        boolean isTeacher= false;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean ocupation= isPolice || isTeacher|| isFirefighter;

        boolean receivesDiscount= isFriday && ocupation ; // or  boolean receivesDiscount= isFriday && (isPolice || isTeacher|| isFirefighter);
        System.out.println("Gina gets discount: "+receivesDiscount);

    }}
