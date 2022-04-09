package day38_arraylist;

public class HTMLGenerator {
    public static void main(String[] args) {
        String str = "div^5";
        String digits="";
        String tag="";
        for (int i = 0; i <str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digits+=str.charAt(i);
            }else if(Character.isUpperCase(str.charAt(i))||Character.isLowerCase(str.charAt(i))) {tag+=str.charAt(i);}
        }
        int times=Integer.parseInt(digits);
        String format="<"+tag+">"+"</"+tag+"> ";
        String result="";
        for (int i =0 ; i <times ; i++) {
            result+=format;
        }

        System.out.println(result);
    }

    public static String htmlGenerate(String str){

        String html = "";
        String [] parts = str.split("\\^"); // ^ needs to be preceded by //  to be read as a char.

        int repeat = Integer.parseInt(parts[1]);

        for(int i = 0; i < repeat; i++){

            html += "<" + parts[0] + "></" + parts[0] + "> ";

        }

        return html;
    }


    }



