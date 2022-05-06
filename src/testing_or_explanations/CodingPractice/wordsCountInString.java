package testing_or_explanations.CodingPractice;
// check how many times each word is in the String
public class wordsCountInString {
    public static String countWordsInString(String str) {
        if (str.isEmpty() || str.isBlank()) {
            return "invalid input";
        }

        str = str.toLowerCase().trim();
        String[] arr = str.split(" ");// geeks for geeks

        String wordsContained = "";
        for (String each : arr) {
            if (!wordsContained.contains(each)) {
                wordsContained += each + " ";
            }
        }
        String[] arr2 = wordsContained.trim().split(" "); // geeks for
        String result = "";
        for (String each : arr2) {
            int count = 0;
            for (String each2 : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            result += each + " appears " + count + "\n";
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(countWordsInString("geeks for geeks"));
    }
}
