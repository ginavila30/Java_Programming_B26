package day02_04_11_2022;

public class Contains2or3 {
    public static  boolean contain2Or3(int[] arr){
       boolean contains = false;
        for (int each:arr) {
            if(each==2||each==3){
              contains= true;
                break;
            }
        }
        return contains;

    }

    public static void main(String[] args) {
        System.out.println(contain2Or3(new int[]{5, 4, 6, 8, 9}));
    }
}
