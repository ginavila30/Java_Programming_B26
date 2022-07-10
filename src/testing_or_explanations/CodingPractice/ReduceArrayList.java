package testing_or_explanations.CodingPractice;

import java.util.*;

public class ReduceArrayList {

    public static Integer reduceArrayList(List<Integer> num){
        System.out.println(num);
        Integer minimumCost=0;
 Collections.sort(num);
        while( num.size()>1){


                    if(!Objects.equals(num.get(0), num.get(1))){
                        int sum = num.get(0)+num.get(1);
                        num.add(sum);
                        minimumCost+=sum;
                        num.remove(0);
                        num.remove(0);
                    }else{
                        if(num.size()>2){
                            int sum = num.get(0)+num.get(2);
                            num.add(sum);
                            minimumCost+=sum;
                            num.remove(0);
                            num.remove(1);
                        }
                    }




        }
        return minimumCost;

    }

    public static void main(String[] args) {
        System.out.println(reduceArrayList(new ArrayList<Integer>(Arrays.asList( 4,5,7,7,10))));// 33-> 9+17+16+33


    }

}
