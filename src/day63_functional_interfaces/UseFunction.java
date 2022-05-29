package day63_functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
        Function<int[], List<Integer>> convertArrayToList = (numArr)->{

            List<Integer> list = new ArrayList<>();
            for(int each : numArr){
                list.add(each);
            }
            return list;
        };

        int [] a = {32, 5, 12, 5};
        List<Integer> list = convertArrayToList.apply(a);
        System.out.println(list);


    }}
