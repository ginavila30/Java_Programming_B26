package day58_exceptions_recap;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bye");
        try {
            System.out.println(list.get(5));
            String s=null;
            s.toLowerCase();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds catch block");
            System.out.println(e.getMessage());

        }catch (NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }

        System.out.println(list);
        System.out.println();

        try{
            Thread.sleep(3000);
        }catch (Exception

                e){
            System.out.println("Wrong number");
            System.out.println(e.getMessage());
        }

    }
}
