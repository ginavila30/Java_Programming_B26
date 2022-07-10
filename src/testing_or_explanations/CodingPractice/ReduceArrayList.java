package testing_or_explanations.CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReduceArrayList {

    public static Integer reduceArrayList(List<Integer> num){
 Integer minimumCost=0;
 Collections.sort(num);
        while( num.size()>1){

            int sum = num.get(0)+num.get(1);
            num.add(sum);
            minimumCost+=sum;
            num.remove(0);
            num.remove(0);

        }
        return minimumCost;

    }

    public static void main(String[] args) {
        System.out.println(reduceArrayList(new ArrayList<Integer>(Arrays.asList(7,3,5,4))));//10+9+19
    }

}
