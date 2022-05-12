package testing_or_explanations.CodingPractice;

public class SubSets {
    public static void main(String[] args) {
        String str = "FUN";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i ; j < str.length(); j++) {
                result += str.substring(i,j+1)+"\n";
            }
        }
        System.out.println(result);

        //FUN
        //OUTERlOOP 0 F 1 U
        //Inner Loop 0,1 F - 0,2 FU -0,3 FUN- 1,2 U- 1,3 UN -


    }
}
