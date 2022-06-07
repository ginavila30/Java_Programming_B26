package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {
        //map()
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> byTwo=list.stream().map(each->each*2).collect(Collectors.toList());
        System.out.println("Original list->"+list);
        System.out.println("New List after"+byTwo);

        List<String>days=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        List<String>abr=days.stream().map(day-> ""+day.charAt(0)+day.charAt(1)).collect(Collectors.toList());
        System.out.println(days);
        System.out.println(abr);
        //Filter()
        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer>evens=list2.stream().filter(each->each%2==0).collect(Collectors.toList());
        List<Integer>odds=list2.stream().filter(each->each%2!=0).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(evens);
        System.out.println(odds);
        System.out.println(list2.stream().filter(each -> each % 2 != 0).count());
        System.out.println(list2.stream().filter(each -> each % 2 != 0).distinct().count());//how many uniques

        List<String> strs = new ArrayList<>(Arrays.asList("java", "javascript", "selenium", "cypress", "jAVa", "hello world", "JAVA"));
        long javaCounter = strs.stream().filter(each -> each.toLowerCase().contains("java")).count();
        System.out.println(javaCounter);
        List<String>wordsContainJava=strs.stream().filter(each -> each.toLowerCase().contains("java")).collect(Collectors.toList());
        System.out.println(wordsContainJava);

        //forEach()
        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,2,4));
        list3.stream().filter(p->p%2==0).forEach(e-> System.out.println(e));
        list3.stream().filter(p->p%2==0).forEach(System.out::println);// this line does exact same as the line before.

        List<Integer>list4=new ArrayList<>(Arrays.asList(5,10,28,25,15));
        System.out.println("Are all divisible by 5 ->"+list4.stream().allMatch(each -> each % 5 == 0));
        System.out.println("Are all even ->"+list4.stream().allMatch(each -> each % 2 == 0));
        System.out.println("Are all more than 30 ->"+list4.stream().allMatch(each -> each >30));
        System.out.println("Are all more than 20 ->"+list4.stream().allMatch(each -> each % 5 == 0));
        System.out.println("None are above 30 ->"+list4.stream().noneMatch(each -> each > 30));

    }
}
