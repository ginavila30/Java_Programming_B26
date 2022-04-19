package testing_or_explanations.CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;

// accept a rectangle of inputs and find the paths the snake can go through. + means block 0 means pass.
public class SnakePath {
    public static void main(String[] args) {
        //char[][]column={{'+','0','0','0','+'},{'+','0','0','0','+'},{'+','0','+','0','+'},{'0','0','0','0','0'},{'+','0','0','+','0'},{'0','0','0','0','0'},{'0','0','0','0','+'}};
        
        char[][]rectangle={{'+','+','+','0','+','0','0'},
                           {'0','0','0','0','0','0','0'},
                           {'0','0','+','0','+','0','0'},
                           {'0','0','0','0','+','0','0'},
                           {'+','+','+','0','0','0','+'}};

        ArrayList<Integer>validCol=new ArrayList<>();


        for (int i = 0; i <rectangle[0].length ; i++) {
            boolean valid= true;
            for (char[] each:rectangle) {
                if(each[i]=='+'){
                    valid = false;
                    break;
                }
            }
            if(valid) {
                validCol.add(i);
            }}

//        for (int i = 0; i < column.length ; i++) {
//            char[]each=column[i];
//            boolean valid=true;
//            for (int j = 0; j < each.length ; j++) {
//                if (each[j]!='0'){
//                    valid= false;
//                    break;
//                }
//            }
//            if(valid){ validCol.add(i);}
//        }

        ArrayList<Integer>validRow=new ArrayList<>();

        for (int i = 0; i < rectangle.length ; i++) {
            char[]each=rectangle[i];
            boolean valid=true;
            for (int j = 0; j < each.length ; j++) {
                if (each[j]!='0'){
                    valid= false;
                    break;
                }
            }
            if(valid){ validRow.add(i);}
        }
        System.out.println(validCol);
        System.out.println(validRow);

    }
}
