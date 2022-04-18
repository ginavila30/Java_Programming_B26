package testing_or_explanations.TopicReviews;

import java.util.Collections;

public class MethodsToUseWithArrayList {
    public static void main(String[] args) {
        //ArrayList Methods

        // .add();
        // we have 2 ways to use .add():
        // .add(element); // element is being added at the end of the ArrayList
        // .add(index, element) -> this one we define where exactly we want to add the element
        //syntax: ArrayListName.add(element);
        // .add(); it will return "true" if you try to print it

        // .get(index);
        // it gets element base on index we have given in the arg() and return the element

        // .size();
        // we use this method to get the size/length of the ArrayList, no need to give anything in the arg()
        //return: int

        //.indexOf(element);
        //.lastIndexOf(element);
        // if the element given in the arg() is in the ArrayList then this will return indexNumber of the element
        // if the element given in the arg() is NOT in the ArrayList then this will return -1

        //.remove()
        // .remove(index)-> this will remove the element at the index given.(Returns the element removed)
        //.remove(element)-> this will remove the element give.(Returns boolean)

        // .contains()-> checks if the array list contains a given element.
        //Returns boolean

        //.clear()
        //clears the array list elements. Void method.

        //.isEmpty() checks if the array list is empty
        // returns boolean

        //.set()-> works like replace
        //.set(index,element)-> replaces the element at the give index with the new element given

        //Bulk Methods
        //.addAll()
        //.removeAll () -> deletes
        //containsAll()
        //retainAll-> keeps

        //Collections methods -> methods that can be used with any collection type. (ArrayList is a collection type)

        //Collections.sort(ArrayListName) ->Void method
        //Collections.reverse -> Void method
        //CollectionsMin or CollectionsMax -> returns int or String
        //Collections.replaceAll(ArrayListName,oldvalue,newvalue)
        //Collections.frequency(collectionType,object)
        //Collections.swap(index1, index2)
        // //remove if(predicate) ==> sintax removeif(variable -> booleanCondition)

        String str="solar";
        System.out.println(str.charAt(str.length()/2));

    }
}
