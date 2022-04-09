package day39_arraylist;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Practice 1 adding elements
        ArrayList<String>list=new ArrayList<>();
        list.add("Hat");//1
        System.out.println(list);
        list.add("Shoes");//3
        System.out.println(list);
        list.add(1,"Jacket");//2
        System.out.println(list);
        list.add(0,"Towel");//0
        System.out.println(list);
        list.add(1,"Car");
        System.out.println(list);

        //Practice 2 removing elements

        ArrayList<String>superHeroes=new ArrayList<>();
        superHeroes.add("Iron man");
        superHeroes.add("Spider man");
        superHeroes.add("Thor");
        superHeroes.add("Captain America");
        superHeroes.add("Hawkeye");

        superHeroes.remove(superHeroes.indexOf("Thor"));// removing by index number.
        System.out.println(superHeroes);
        superHeroes.remove("Iron man");//removing by element(object).
        System.out.println(superHeroes);
        superHeroes.remove(0);// if printing this line this will print the word that was removed.
        System.out.println(superHeroes);

        //Array list with loop

        ArrayList<Character>alphabetUpperCase=new ArrayList<>();

        for (int i = 'A'; i <='Z' ; i++) {
            alphabetUpperCase.add((char) i);
        }
        System.out.println(alphabetUpperCase);

        ArrayList<Character>alphabetLowerCase=new ArrayList<>();

        for (int i = 'a'; i <='z' ; i++) {
            alphabetLowerCase.add((char) i);
        }
        System.out.println(alphabetLowerCase);
        Character a='a',e='e', i='i',o='o', u='u';
        alphabetLowerCase.remove(a);// removes the element but it if I print this line this will return booleean true if removed, false if not removed.
        alphabetLowerCase.remove(e);
        alphabetLowerCase.remove(i);
        alphabetLowerCase.remove(o);
        alphabetLowerCase.remove(u);
        System.out.println(alphabetLowerCase);


    }
}
