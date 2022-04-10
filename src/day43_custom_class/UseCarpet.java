package day43_custom_class;

public class UseCarpet {
    public static void main(String[] args) {
        CarUsing.Carpet carpet1=new CarUsing.Carpet(8.5,12,true,2.5);
        System.out.println(carpet1);
        carpet1.length=14;
        carpet1.calculatePrice();
        System.out.println(carpet1.totalPrice);
    }
}
