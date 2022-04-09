package day34_return_methods;

public class MethodsWithOthers {
  // example switch in methods
//    public static String daysInWords(int day){
//String strDay="";
//        switch (day){
//
//            case 1: strDay="Monday"; break;
//            case 2: strDay="Tuesday"; break;
//            case 3: strDay="Wednesday"; break;
//            case 4: strDay="Thursday"; break;
//            case 5: strDay="Friday"; break;
//            case 6: strDay="Saturday"; break;
//            case 7: strDay="Sunday"; break;
//            default:"Invalid input"; break; this lats break is optional because it is the last line.
//
//    }   return strDay;
//    }

    // Second approach making more simple

    public static String daysInWords(int day){
        switch (day){

            case 1: return "Monday";
            case 2: return"Tuesday";
            case 3:return"Wednesday";
            case 4: return "Thursday";
            case 5: return"Friday";
            case 6: return"Saturday";
            case 7: return "Sunday";
            default:return"Invalid";

    }
    }
    // Example of method with loop inside
    public static int firstEvenNum(int[]num){
        for (int each:num) {
            if(each%2==0){return each;}
        }
        return 0;// out of the loop because if after checking all the elements I did not find even, just then return 0. if I do it as an else of  the if statement will return as soon as it finds 1 odd, but it does not mean it will check all the elements.Because when return runs the method ends.
    }
}
