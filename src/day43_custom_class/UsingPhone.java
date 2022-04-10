package day43_custom_class;

public class UsingPhone {
    public static void main(String[] args) {
        Phone phone1=new Phone("Iphone 13");
        Phone phone2=new Phone("Iphone13","Apple");
        Phone phone3=new Phone("Iphone 13","Apple",128,2.5);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
