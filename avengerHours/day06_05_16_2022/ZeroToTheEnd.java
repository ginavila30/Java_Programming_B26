package day06_05_16_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroToTheEnd {
    public static ArrayList<Integer> ZeroToTheEnd(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (each != 0) {
                result.add(each);
            }
        }

        list.removeIf(each-> each!=0);
        result.addAll(list);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(ZeroToTheEnd(new ArrayList<>(Arrays.asList(1, 0, 7, 5, 0, 3, 0, 5))));
    }
}
