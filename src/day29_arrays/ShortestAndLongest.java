package day29_arrays;

public class ShortestAndLongest {
    public static void main(String[] args) {

        String[] array1 = {"apple", "java", "computer","water"};

        String longest=array1[0];
        String shortest =array1[0];

        for (int i = 1; i < array1.length; i++) {
            int length = array1[i].length();

            if (length>longest.length()){
                longest=array1[i];
            }
            if (length<shortest.length()){
               shortest=array1[i];
            }

        }
        System.out.println("Longest: "+longest+"\nShortest: "+shortest);

        // for each loop approach

        for (String each:array1){

            if(each.length()>longest.length()){
                longest=each;
            }
            if (each.length()<shortest.length()){
                shortest=each;
            }
        }
        System.out.println("Longest: "+longest+"\nShortest: "+shortest);
    }
}
