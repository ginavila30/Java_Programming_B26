package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReview2 {
    public static void main(String[] args) {
        //Array Object
       Integer[]arr=new Integer[5];
       Integer[]arr2={1,2,3,4,5};
       String str = "ABCD123$%#@&456EFG!";
       String[]characters=str.split("");//[A,B,C,D,1,2,3,$,%,#,@,&,4,5,6,E,F,G,!]
        String letter="";
        String numbers="";
        String specialChars="";


        for (int i = 0; i < characters.length ; i++) {
            if(characters[i].charAt(0)>='A'&& characters[i].charAt(0)<='Z'){
                letter+=characters[i].charAt(0);
            }else if (characters[i].charAt(0)>='1'&& characters[i].charAt(0)<='9'){numbers+=characters[i].charAt(0);}else{specialChars+=characters[i].charAt(0);}
        }

        System.out.println(letter);
        System.out.println(numbers);
        System.out.println(specialChars);



        //ArrayList
        ArrayList<Integer>listEmpty=new ArrayList<>();
        ArrayList<Integer>listCapacity=new ArrayList<>(6);// capacity example.
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(arr2)); //ArrayList<Integer>list=new ArrayList<>(Arrays.asList(8,9,10,11))
        list.add(1);
        list.add(1,8);

        //More ArrayList Methods (Bulk methods)
        ArrayList<String>words=new ArrayList<>();// Empty Array List
        System.out.println(words);
        //addAll
        words.addAll(Arrays.asList("word","apple","juice","word", "milk","word","class","java"));// We added 3 elements at the same time.
        System.out.println(words);

        //removeAll -> deletes
        System.out.println(words.removeAll(Arrays.asList("word", "juice")));// returns true confirming they were removed
        System.out.println(words.removeAll(Arrays.asList("dog","salad")));// returns false confirming they are not removed
        System.out.println(words);

        //containsAll
        System.out.println(words.containsAll(Arrays.asList("apple", "milk")));// true
        System.out.println(words.containsAll(Arrays.asList("dog", "salad")));// false

        //retainAll-> keeps
        System.out.println(words.retainAll(Arrays.asList("java", "class")));
        System.out.println(words.retainAll(Arrays.asList("water", "day")));// words are not part of my array list elements so method deleted everything.
        System.out.println(words);

        //Collections methods -> methods that can be used with any collection type. (ArrayList is a collection type)

        ArrayList<String>months=new ArrayList<>(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December","January","January"));
        ArrayList<String>sortMonths=new ArrayList<>(months);// created a new array list to practice sort

        //Collections.sort ->Void method
        Collections.sort(sortMonths);
        System.out.println(sortMonths);

        //Collections.reverse -> Void method
        Collections.reverse(months);
        System.out.println(months);

        //CollectionsMin or CollectionsMax -> returns int or String
        System.out.println(Collections.max(months));
        System.out.println(Collections.min(months));

        //Collections Frequency -> return int
        System.out.println(Collections.frequency(months,"January"));

        //Collections Swap-> void
        Collections.swap(months,2,5); // we can not print this line it shows error. It is probably because is a void method.
        System.out.println(months);

        //Collections replaceAll
        Collections.replaceAll(months,"January","First Month");
        System.out.println(months);

        // Another Array List method -> Predicate -Lambda Expression
        //remove if(predicate)  sintax removeif(variable ->condition)

        months.removeIf(each->each.length()==4); // It goes through all the elements and check the condition before performing action.
        System.out.println(months);


    }
}
