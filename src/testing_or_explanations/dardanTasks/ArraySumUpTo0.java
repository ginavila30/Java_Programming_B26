package testing_or_explanations.dardanTasks;

import java.util.Arrays;

/*Array -- N unique integers that sum up to 0
Write a function: that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
*/
public class ArraySumUpTo0 {
public static int[] arraySumUpTo0(int n){
    int[]result= new int[n];

    for (int i = 0, j=n-1; i <result.length/2 ; i++,j--) {
        result[i] = n;
        result[j] = n-- * -1;
    }
    if(result.length%2!=0){
        result[result.length/2]=0;
    }
    return result;
  }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumUpTo0(7)));
    }

}

