package day43_custom_class;

public class CarUsing {
    public static void main(String[] args) {
        Car carOne=new Car();

        carOne.model= "Sportage";
        carOne.year=2021;
        carOne.color="Black";
        carOne.fuelLevel=40;

        System.out.println(carOne);
        carOne.drive();
        carOne.fillTank();
        System.out.println(carOne.fuelLevel);
        System.out.println(carOne.isLow());
    }

    public static class Carpet {
        double width;
        double length;
        boolean isPersian;
        double unitPrice;
        double totalPrice;

        public Carpet (double inputWidth,double inputLength,boolean inputIsPersian,double inputUnitPrice){
            width=inputWidth;
            length=inputLength;
            isPersian=inputIsPersian;
            unitPrice=inputUnitPrice;
            calculatePrice();

        }

        public void calculatePrice(){
            totalPrice=width*length*unitPrice;
            if(isPersian){totalPrice+=200;}
        }

        @Override
        public String toString() {
            return "Carpet{" +
                    "The width is=" + width +
                    ",Te length is=" + length +
                    ", Is it Persian type=" + (isPersian?"Yes":"No") +
                    ", The unit price is= $" + unitPrice +
                    ", The total price is= $" + totalPrice +
                    '}';
        }
    }
}
