package day11_03_21_2022;

/*-1 ../  Move to parent folder of current folder
   0 ./   Remain in the same folder
  +1 x/   Move to the child folder named x
*/

public class StepsMainDirectory {
    public static void stepsToMainDirectory (String []arr){
        int stepsCount=0;
        for (String each:arr) {
            if(each.equals("../")){
                stepsCount--;
            }else if(each.equals("./")){
                continue;
            }else{
                stepsCount++;
            }
        }
        System.out.println(stepsCount<=0?"0":stepsCount);

    }

    public static void main(String[] args) {
        stepsToMainDirectory(new String[]{"x/","y/","../","z/","./"});
    }
}
