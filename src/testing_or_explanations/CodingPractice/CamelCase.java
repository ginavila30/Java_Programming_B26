package testing_or_explanations.CodingPractice;

public class CamelCase {
public static String camelCase(String str){
    str=str.trim().toLowerCase();

    for (int i = 0; i < str.length() ; i++) {
       Character ch= str.charAt(i);
       if(!Character.isLowerCase(ch)&&str.charAt(i)!=' '&&!Character.isDigit(ch)){
         str=  str.replaceAll(""+str.charAt(i)," ");
       }
    }
    System.out.println(str);
    String result="";
    for (int i = 0; i <str.length() ; i++) {
        if(str.charAt(i)==' '){
            result+=(""+str.charAt(i+1)).toUpperCase();
            i+=1;
        }else{result+=str.charAt(i);}
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(camelCase("cats And/Dogs-are Awesome"));
     //   System.out.println(camelCase("cats And*Dogs-are Awesome"));I couldnt replace *
    }
}
