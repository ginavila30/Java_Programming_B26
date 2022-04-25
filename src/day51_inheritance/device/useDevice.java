package day51_inheritance.device;

public class useDevice {
    /*Create a class UseDevice

	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes
*/

    public static void main(String[] args) {
        TV tv1=new TV("Samsung","Ultra HD",400,false);
        Phone phone1=new Phone("iPhone","13",1000,true);

        System.out.println(tv1);
        tv1.useDevice();
        System.out.println(phone1);
        phone1.useDevice();
    }

}
