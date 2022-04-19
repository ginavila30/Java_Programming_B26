package day48_encapsulation.static_imports;

import java.util.Arrays;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class WithImport {
    public static void main(String[] args) {
        int[]a={4,12,5,25};
        sort(a);// using static import that is why I don't need to call class everytime (Arrays in this case) I want to call a static method.

        abs(5);// using static import that is why I don't need to call class everytime (Math in this case) I want to call a static method.
    }
}
