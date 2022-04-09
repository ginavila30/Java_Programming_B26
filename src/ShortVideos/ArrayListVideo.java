package ShortVideos;

import java.util.ArrayList;

public class ArrayListVideo {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();// Datatype must match or if I don't specify the second data type it will override the first one
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);// when printing Array list no need to call any method, I can print directly
        System.out.println(list.size());// Tells me size of Array list


    }
}
