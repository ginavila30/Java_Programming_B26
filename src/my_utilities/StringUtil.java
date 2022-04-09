package my_utilities;

public class StringUtil {
    // main method should be deleted once I worked on all the methods. Because this class is just to store the methods, not to run them.
    // Reverse: create a method that accepts String and returns the returned version.
    // Reverse
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


    //Currency Converter

    public static double currencyConvertor(String currency, double amount) {
        switch (currency) {
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }
    }

    //Fix Format

    public static String fixFormat(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    //Camel Case

    public static String camelCase(String str) {
        str = str.toLowerCase().trim();
        String camelCase = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                camelCase += ("" + str.charAt(i + 1)).toUpperCase();
                i++;
            } else {
                camelCase += str.charAt(i);
            }

        }
        return camelCase;
    }

    //Frequency of Character

    public static int frequencyOfChar(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    // Unique Chars

    public static String uniqueChars(String str) {

        String uniqueChars = "";
        String checked =""; //  created this vx so that if I already checked one char and that one is repeated, my loop wont have to run all the code, but instead it will continue to next iteration.
        for (int i = 0; i < str.length(); i++) {
         if(checked.contains(""+str.charAt(i))){continue;}
          int count=  frequencyOfChar(str,str.charAt(i));
         checked+=str.charAt(i);
            if (count == 1) {
                uniqueChars += str.charAt(i);
            }
            }

        if (uniqueChars.isEmpty()) {
            return "No unique chars";
        }
        return uniqueChars;
    }

    // Unique Chars 2 approach

    public static String uniqueChars2(String str) {

        String uniqueChars = "";
        String checked =""; //  created this vx so that if I already checked one char and that one is repeated, my loop wont have to run all the code, but instead it will continue to next iteration.
        for (int i = 0; i < str.length(); i++) {
            if(!checked.contains(""+str.charAt(i))){
            int count=  frequencyOfChar(str,str.charAt(i));
            checked+=str.charAt(i);
            if (count == 1) {
                uniqueChars += str.charAt(i);
            }}
        }

        if (uniqueChars.isEmpty()) {
            return "No unique chars";
        }
        return uniqueChars;
    }


    // Duplicate Chars

    public static String duplicateChars(String word) {
        word = word.toLowerCase();
        String duplicateChars = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && !duplicateChars.contains("" + word.charAt(i))) {
                duplicateChars += word.charAt(i);
            }
        }
        if (duplicateChars.isEmpty()) {
            return "No duplicate chars";
        }
        return duplicateChars;
    }

    // Duplicate Chars second approach

    public static String duplicateChars2(String str) {

        String duplicateChars = "";
        for (int i = 0; i < str.length(); i++) {
            int count = frequencyOfChar(str,str.charAt(i));
            if (count > 1 && !duplicateChars.contains("" + str.charAt(i))) {
                duplicateChars += str.charAt(i);
            }
            }
        if (duplicateChars.isEmpty()) {
            return "No duplicate chars";
        }
        return duplicateChars;
    }
}





