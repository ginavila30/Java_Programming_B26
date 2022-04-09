package day35_Methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverseString("apple"));
        System.out.println(StringUtil.fixFormat("JAMES"));
        System.out.println(StringUtil.frequencyOfChar("apple",'c'));
        System.out.println(StringUtil.frequencyOfChar("apple",'p'));
        System.out.println(StringUtil.duplicateChars2("apple"));
        System.out.println(StringUtil.uniqueChars2("apple"));
    }
}
