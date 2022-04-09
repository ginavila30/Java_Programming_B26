package interviewNadir;

import java.util.ArrayList;
/*Method accepts 2 str arrays & return boolean

       true is username has nadir and any password has starting with num
       * */
public class Task1 {
    public static void main(String[] args) {
        String[]arrUsername={"Nadir","Amin"};
        String[]passwords={"125array!","321java*"};
        System.out.println(rightCredentials(arrUsername, passwords));


    }
    public static boolean rightCredentials (String[]arr,String[]arr2){
boolean username=false;
        for (String each :arr) {
            each=each.toLowerCase();
            if(each.contains("nadir")){
                username=true;
            }
        }
        boolean password=false;
        for (String each:arr2) {
            if(Character.isDigit(each.charAt(0))){
                password= true;
            }
        }
        return username&&password;
    }
}
