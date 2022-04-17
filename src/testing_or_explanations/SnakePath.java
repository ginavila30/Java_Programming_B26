package testing_or_explanations;

import java.util.ArrayList;
// accept a rectangle of inputs and find the paths the snake can go through. + means block 0 means pass.
public class SnakePath {
    public static void main(String[] args) {
        char[][]column={{'+','0','0','0','+'},{'+','0','0','0','+'},{'+','0','+','0','+'},{'0','0','0','0','0'},{'+','0','0','+','0'},{'0','0','0','0','0'},{'0','0','0','0','+'}};
        char[][]row={{'+','+','+','0','+','0','0'},{'0','0','0','0','0','0','0'},{'0','0','+','0','+','0','0'},{'0','0','0','0','+','0','0'},{'+','+','+','0','0','0','+'}};

        ArrayList<Integer>validCol=new ArrayList<>();

        for (int i = 0; i < column.length ; i++) {
            char[]each=column[i];
            boolean valid=true;
            for (int j = 0; j < each.length ; j++) {
                if (each[j]!='0'){
                    valid= false;
                    break;
                }
            }
            if(valid){ validCol.add(i);}
        }

        ArrayList<Integer>validRow=new ArrayList<>();

        for (int i = 0; i < row.length ; i++) {
            char[]each=row[i];
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
