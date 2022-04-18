package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class UniqueElements2Arrays {
    /*
 * Given 2 arrays. They are consist of non empty strings. Write a function to find out all elements appear in first array but not in second array.
  Sample input:
    Array A: ["one", "two", "four", "ten"]
    Array B: ["one", "four", "seven", "six"]
  Sample output:
    In A not in B: ["two", "ten"]
    In B not in A: ["seven", "six"]


function (array1, array2) {
  console.log(`Array A: `, array1)
  console.log(`Array B: `, array2)
  let result1 = []
  let result2 = []
  // Implementation
  console.log(`In A not in B: `, result1)
  console.log(`In B not in A: `, result2)
}

*/
    public static void main(String[] args) {
        String[] arrayA = {"one", "two", "four", "ten"},
                arrayB = {"one", "four", "seven", "six"};
        String result1 = "";

        for (String each : arrayA) {
            boolean contains = true;
            for (String each2 : arrayB) {
                if (each == each2) {
                    contains = true;
                    break;
                } else {
                    contains = false;
                }
            }
            if (!contains) {
                result1 += each + " ";
            }
        }
        String[] result1Arr = result1.split(" ");
        System.out.println(Arrays.toString(result1Arr));

        String result2 = "";
        for (String each : arrayB) {
            boolean contains = true;
            for (String each2 : arrayA) {
                if (each == each2) {
                    contains = true;
                    break;
                } else {
                    contains = false;
                }
            }
            if (!contains) {
                result2 += each + " ";
            }
        }
        String[] result2Arr = result2.split(" ");
        System.out.println(Arrays.toString(result2Arr));
    }
}
