package day33_methods;

public class UseGetChars {
    public static void main(String[] args) { // To access the methods I created in a separate class, I call the class.and method(). As ong as I am working on classes in the same package. For different packages I need to import, but we have not learned yet.
        GetChars.alphabetCaps();
        GetChars.alphabetLow();
        GetChars.reverseAlphabetCaps();
        GetChars.reverseAlphabetLow();
        GetChars.numsUpto9();
    }
}
