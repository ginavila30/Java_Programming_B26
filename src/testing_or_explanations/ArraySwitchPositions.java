package testing_or_explanations;

import java.util.Arrays;

public class ArraySwitchPositions {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        int temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;

        System.out.println(Arrays.toString(a));

        int[] sum28 = {2, 3,2,2,4,2,2};
        int count = 0;
        for (int each : sum28) {
            if (each == 2) {
                count++;
            }
        }
        System.out.println(count == 4);
    }
}
