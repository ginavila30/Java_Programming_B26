package day28_arraysIntro;

public class MaxMin {
    public static void main(String[] args) {

        int [] num ={500,120,-80,90,250};

        int min= num[0];
        int max = num[0];

        for (int i = 1; i < num.length ; i++) { // I started from 1 because index of 0 wa already being checked and used ad the value of min and max

            if(num[i]<min){
                min=num[i];
            }
            if (num[i]>max){
                max=num[i];
            }


        }
        System.out.println("Minimum Number "+min+ "\nMax Number "+max);
    }
}
