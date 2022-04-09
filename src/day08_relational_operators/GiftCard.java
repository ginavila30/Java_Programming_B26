package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        double giftCard=200;

        double item1=50;
        double item2=20;

        giftCard-=item1;// short-hand operator
        giftCard-=item2;// short-hand operator

        System.out.println("Remaining balance $"+ giftCard);
    }
}
