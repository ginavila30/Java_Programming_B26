package testing_or_explanations.CodingPractice;

public class SumOfIntegersFoundInStr {
    public static void main(String[] args) {
        String str="jav45ai1000sgre1lat82";
        int sum=0;
        String temp="0";

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){

                temp+=str.charAt(i);

            }else  {
                sum+=Integer.parseInt(temp);
                temp="0";
            }

        }
        System.out.println(sum+=Integer.parseInt(temp));
    }

}
