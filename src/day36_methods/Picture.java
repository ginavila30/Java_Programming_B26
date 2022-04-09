package day36_methods;

public class Picture {
    // OVERLOADING METHOD: one same method with same name, declare multiple times and change the parameter. When method has option of different parameters then it is an overloading method.
    public static void draw(){ // no parameter
        System.out.println("trying to draw");
    }
    public static void draw(String color){// one string parameter
        System.out.println("drawing with "+color);
    }
    public static void draw(String color, String color2){//two string parameter
        System.out.println("drawing with color"+color+" and "+"drawing with color "+color2);
    }
    public static void draw(int size){//one int parameter
        System.out.println("drawing with size "+size);
    }
    public static void draw(String color,int size){//one String parameter and one int parameter
        System.out.println("drawing with color & size "+color+" "+size);
    }
    public static void draw(int size ,String color){//compared with line 17, this is a different parameter because order of parameters matters.
        System.out.println("drawing with color & size "+color+" "+size);
    }


    // Above all parameters are completely different

//   Below code is not valid because the parameter is still and int, but I am just changing the name so java does not accept that.
//    public static void draw(int length){//one int parameter
//        System.out.println("drawing with size "+length);
//    }


}
