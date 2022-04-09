package day32arraysclassnandmulti;

public class Diagonal {
    public static void main(String[] args) {
        int [][]array={{3,5,1},{1,6,10},{5,21,10}};
        int diagonal1=0;//3+6+10
        int diagonal2=0;

// Diagonal 1 loop
        for (int i = 0; i < array.length ; i++) {
            diagonal1+= array[i][i];

        }
        // diagonal 2 loop
        int reverse= array.length-1;
        for (int i = 0; i <array.length ; i++) {
            diagonal2+=array[i][reverse--];
        }

        if (diagonal1>diagonal2){
            System.out.println("Diagonal 1 is bigger");
        }else {
            System.out.println("Diagonal 2 is bigger");
        }
// second approach without loop.

        if((array[0][0]+array[1][1]+array[2][2])>(array[0][2]+array[1][1]+array[2][0])){
            System.out.println("The biggest diagonal is: "+array[0][0]+"-"+array[1][1]+"-"+array[2][2]);
        }else {
            System.out.println("The biggest diagonal is: "+array[0][2]+"-"+array[1][1]+"-"+array[2][0]);
        }


    }
}
