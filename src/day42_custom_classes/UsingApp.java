package day42_custom_classes;

public class UsingApp {
    public static void main(String[] args) {
        App cydeo=new App(); //Instantiate the object.

        cydeo.name="Cydeo";
        cydeo.version=5.5;
        cydeo.isFree=true;

        cydeo.run();
        cydeo.update();
        System.out.println(cydeo.name);
        System.out.println(cydeo.version);

        new App().run();//created an object but no reference and calls the run method, so I can not use it again.



    }
}
