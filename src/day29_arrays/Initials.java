package day29_arrays;

public class Initials {
    public static void main(String[] args) {

        String[] classmates={"James Bond","Eve Rell","Anna Johnson"};
// for loop approach.
        for (int i = 0; i < classmates.length ; i++) {
         char initialName = classmates[i].charAt(0);
         int index = classmates[i].indexOf(" ")+1;
         char initialLast= classmates[i].charAt(index);

         System.out.println(""+initialName+initialLast);

        }
// for each loop approach:

        for (String singleName:classmates){
            char firstInitial = singleName.charAt(0);
            char secondInitial =singleName.charAt(singleName.indexOf(' ')+1);
            System.out.println(""+firstInitial+secondInitial);
        }

    }
}
