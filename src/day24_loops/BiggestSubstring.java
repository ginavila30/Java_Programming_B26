package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        String s = "aaabbbcccccddddeeeeee";
        String sub = ""; //
        String biggest = ""; // ccccc

        for(int i = 0; i < s.length() - 1; i++){

            sub += s.charAt(i);

            if(s.charAt(i) != s.charAt(i + 1)){  // when the character of i is different from the character next to it (i + 1)

                if(sub.length() > biggest.length()){
                    biggest = sub; // assigns the substring as the n\

                    // ew biggest
                }

                sub = ""; // resets this String for the next substring
            }

        }

        System.out.println(biggest);
    }
}
