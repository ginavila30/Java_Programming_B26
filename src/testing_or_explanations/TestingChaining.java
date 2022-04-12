package testing_or_explanations;

import day44_custom_class.ChainExample;

public class TestingChaining {
    public static void main(String[] args) {
        new ChainExample(10); // no reference declare, only the object itself. We can not reuse that object.
        new ChainExample("Hello");
        new ChainExample(4.2);
    }
}
