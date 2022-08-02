package testing_or_explanations.TopicReviews;

public class Parent {
    // Attributes

    private int age;// instance vx-> object
    protected String name;//instance vx-> object
    static String planet;//static vx-> class

    static {
        planet = "Earth";
    }//static block, initializer for static vx.

    public Parent(String name) { // constructor.
        this.name = name;// this keyword indicated instance.
    }

    public Parent(String name, int age) { // constructor overloading, private vx can be initialized by constructor but obj won't be able to access the private vx directly.
        this(name);//constructor chaining by using this().
        this.age = age;
    }

    public void display() {
        System.out.println(name + " lives in planet " + planet + " and is a parent class");
    }

    public static boolean isPalindrome(int x) {
//
//            int copyOfNum=x;
//            int temp =0;
//            do{
//                temp=temp*10+(x%10);
//                x=x/10;
//            } while(x%10!=0);

        String original = "" + x;
        String reversed = new StringBuilder().append(x).reverse().toString();

        return original.equals(reversed);


        // return temp==copyOfNum;


    }


    public static void main(String[] args) {
//        System.out.println(isPalindrome(10));
////find greatest number without
//        int a = 10;
//        int b = 15;
//        System.out.println(a > b ? a : b);
// count upper case and lower case
        String str = "AjhWLhnJ";
        char[]arr = str.toCharArray();
        int upperCase =0;
        int lowerCase=0;
        for (char each:arr) {
            if(Character.isUpperCase(each)){
                upperCase++;
            }else if(Character.isLowerCase(each)){lowerCase++;}
        }

        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);

    }


}
