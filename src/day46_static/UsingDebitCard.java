package day46_static;

public class UsingDebitCard {
    public static void main(String[] args) {
        DebitCard card1=new DebitCard(1234567891011254L,"Gina S",12000);
        DebitCard card2=new DebitCard(1234567891011L,"Gina S",12000,"Visa",1234);

        System.out.println(card1);
        System.out.println(card2);

    }
}
