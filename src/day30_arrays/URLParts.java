package day30_arrays;

import java.util.Arrays;

public class URLParts {
    public static void main(String[] args) {
        String url = "https://learn.cydeo.com/courses/130";
        String[]arr=url.split("/");
        System.out.println(Arrays.toString(arr));

        for (String each :arr) {
            System.out.println(each);

        }
    }
}
