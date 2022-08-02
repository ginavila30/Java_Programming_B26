package testing_or_explanations;

import java.util.Stack;

public class InterviewPractice {
    public static String reverseWordsInString(String str) { //test12pop0java989pyt
        StringBuilder result = new StringBuilder();
        StringBuilder tempWord = new StringBuilder();
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                tempWord.append(str.charAt(i));
                result.append(num);
                num = "";
            } else if (Character.isDigit(str.charAt(i))) {
                result.append(tempWord.reverse());
                tempWord = new StringBuilder();
                num += str.charAt(i) + "";
            }
        }
        if (num.isEmpty()) {
            result.append(tempWord.reverse());
        } else {
            result.append(num);
        }

        return result.toString();
    }


    public static int addTheNums(String str) {//String check = "There are 500mangiess on 30 tree in 5 gardens5";
        int result = 0;
        String tempNum = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                tempNum += str.charAt(i);
            } else if (!Character.isDigit(str.charAt(i)) && tempNum.length() != 0) {
                result += Integer.parseInt(tempNum);
                tempNum = "";
            }
        }
        if (!tempNum.isEmpty()) {
            result += Integer.parseInt(tempNum);
        }

        return result;
    }

    public static String eachCharFreq(String str) {// aaabbbbcccccddddd
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == letter) {
                    count++;
                }
            }
            if (!result.contains(letter + "")) result += letter + "" + count + ",";
        }

        return result;
    }

    public static String longestCommonPrefix(String[] strs) {
        String shortestWord = strs[0];
        for (String each : strs) {
            if (shortestWord.length() >= each.length()) {
                shortestWord = each;
            }
        }
        String longestPrefix = "";
        for (int i = 0; i < shortestWord.length(); i++) {
            boolean prefix = false;
            for (int j = 0; j < strs.length; j++) {
                if (shortestWord.charAt(i) == strs[j].charAt(i)) {
                    prefix = true;
                } else {
                    prefix = false;
                    break;
                }
            }
            if (prefix) {
                longestPrefix += shortestWord.charAt(i);
            } else {
                break;
            }
        }

        return longestPrefix;

    }

    public static boolean isValid(String s) { //({})
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                stack.add(s.charAt(i));
            }else{
                if(stack.isEmpty()){return false;}else {
                    switch (s.charAt(i)){

                        case '}': if(stack.peek()=='{'){stack.pop(); } else return false;break;
                        case ']': if(stack.peek()=='['){stack.pop();}else return false;break;
                        case ')': if(stack.peek()=='('){stack.pop(); }else return false;break;
                    }

                }
            }
        }

        return stack.isEmpty();
    }
//LeetCode has a class set up for this
//    public  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode temp = new ListNode(-1); // create a listnode to add the elements (smaller to bigger) -> -1 is a default value to start.
//        ListNode head = temp; // set the head same as temp, we will return head at the end
//
//        while(list1!=null &&list2!=null){ // iterate as long as both list are not null
//            if(list1.val<list2.val){ //compare values from list 1 and list 2
//                temp.next=list1;// assign smaller value to temp.next I need to do next so that it moves to the next node and doe snot overwrite what I had
//                list1= list1.next; //move list to next one
//            }else{ // same logic as above but for list 2 being smaller
//                temp.next=list2;
//                list2 = list2.next;
//            }
//            temp = temp.next;// move temp to next to make sure values ar added in next node not the same one
//        }
//        //the if condition below are in case a list is longer than the other so we will just add all extra elements to the listnode
//        if(list1!=null){temp.next = list1;}// check
//        if(list2!=null){temp.next = list2;}
//
//        return head.next; // return head. next to not include the -1 defaault from first line
//        //https://www.youtube.com/watch?v=K63Mjf-H0B0

    //}

    public static void main(String[] args) {
        //System.out.println(reverseWordsInString("15te!@st12pop0java989pyt54"));
        //System.out.println(reverseWordsInString("There are 500mangiess on 30 tree in 5 gardens5"));
        //  System.out.println(addTheNums("There are 500mangiess on 30 tree in 5 gardens5"));
        // System.out.println(eachCharFreq("aaabbbbcccccddddd"));
       // System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(isValid("({})[]"));
    }
}
