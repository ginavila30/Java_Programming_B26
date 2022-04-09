package day24_loops;


public class CountJava {
    public static void main(String[] args) {
        String str="Java is a java language.java";
        int count = 0;
        for(int i=0;i<str.length()-3;i++){

            String sub= str.substring(i,i+4).toLowerCase();
            System.out.println(sub);
            if(sub.equals("java")){count++;}

        }
    }
}
