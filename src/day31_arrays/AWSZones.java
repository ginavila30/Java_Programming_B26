package day31_arrays;

public class AWSZones {
    public static void main(String[] args) {
        String zones="us-east-1,us-west-1,us-west-2,us-west-3";
        String app =" etsy";

        String[]zonesArr=zones.split(",");

        for (String each :zonesArr) {
            System.out.println("Deploying "+app+" to "+each);

        }
    }
}
