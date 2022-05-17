package testing_or_explanations.CodingPractice;

public class CodingBat {
    public static String starOut(String str) {
        if(str.length()>2){
            while(str.startsWith("*")){
                str=str.substring(2);
            }


            while(str.endsWith("*")){
                str=str.substring(0,str.length()-2);

            }

            String result="";
            if(str.charAt(1)!='*'){ result=""+ str.charAt(0);}

            for(int i=1; i< str.length()-1; i++){
                if(str.charAt(i-1)=='*'||str.charAt(i+1)=='*'||str.charAt(i)=='*'){
                    continue;
                }else{result+=str.charAt(i);}
            }
            if(str.charAt(str.length()-2)!='*'){ result+=str.charAt(str.length()-1);}
            return result;}
        else{
            if(str.contains("*")){
                return "";
            }else{return str;}
        }
    }

    public static void main(String[] args) {
        starOut("a*bc");
    }
}
