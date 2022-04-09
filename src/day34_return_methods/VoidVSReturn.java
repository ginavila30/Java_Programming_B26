package day34_return_methods;

public class VoidVSReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String bye(){
        return "bye";
    }

    public static void main(String[] args) {
        sayHello();// I don't need to use println in this case because there is no return. It is void. Te method code prints, but I can not reuse that info.
        //String msg=sayHello();This does not work because there is no return value. It is a void method.
        System.out.println(bye());// method by itself won't show anything in the console but printing it, will print the return value of my method.
        String message=bye();// I also can assign my return value to a vx.
        System.out.println(message);
    }
}
