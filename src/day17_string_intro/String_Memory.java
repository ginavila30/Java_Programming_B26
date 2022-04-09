package day17_string_intro;

public class String_Memory {
    public static void main(String[] args) {
        String first="java";// String literal, in String pool.

        String second=new String("java");// New keyboard, not in String but directly in the heap.

        System.out.println(first== second );// false.
        // == with String types gives you false, the == does not compare the characters, it compares the memory location of the object.

        String third="java";
        System.out.println(first==third);// true
        // first and third are the same object. Their value are same, so they were stores as 1 string object in the string pool.

        String fourth="Java"; // This is Java with capital J so it is a new object in the string pool. sumup, there are 2 objects in the string pool(Java and java)
        System.out.println(first == fourth);// false.

        String fifth = new String("java");// stored directly as a new object in heap. even though Second has repeated value, the fact that it is new String makes it a completely new object.

        System.out.println(second==fifth);// false. Because both are independent objects store in the heap.
    }
}
