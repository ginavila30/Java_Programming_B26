package day06_Arithmetic_Operators;
/* create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over*/
public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "pepperoni";
        int numberOfSlice= 12;
        int numberOfPeople=5;
        int slicePerPerson=(numberOfSlice/numberOfPeople);
        System.out.println(slicePerPerson);
        int leftOver= numberOfSlice%slicePerPerson;
        System.out.println(leftOver);

        String fullText= "We ordered "+typeOfPizza+" pizza with "+numberOfSlice+" slices, "+numberOfPeople+" people ate "+slicePerPerson+" slices with "+leftOver+" left.";
        System.out.println(fullText);
    }
}
