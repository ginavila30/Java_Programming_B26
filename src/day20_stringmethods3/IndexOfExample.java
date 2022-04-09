package day20_stringmethods3;

public class IndexOfExample {
    public static void main(String[] args) {
        String word="banana";
        //           012345

        int firstIndexA= word.indexOf('a'); //1
        System.out.println(firstIndexA);
        int secondIndexA=word.indexOf('a',firstIndexA+1);
        System.out.println(secondIndexA);
        int thirdIndexA=word.indexOf('a',secondIndexA+1);
        int lastIndexA= word.lastIndexOf('a');//5
        System.out.println(lastIndexA);



    }
}
