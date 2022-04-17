package day_47_encapsulation;

public class AccessModifier {
    public int a;// instance vx, public access modif
    int b;// instance vx, default access modif
    private int c;//instance vx, private modif

    public static int x;// static variable, public access modif
    static int y;// static vx, default access modif
    private static int z;//static vx, private modif

    // In same class
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();
        // I can access all the instance variable (from object) in the same class.
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);

        // I can access all the static variable (from class) in the same class
        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        System.out.println(AccessModifier.z);
    }
}
