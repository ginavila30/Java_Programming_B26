package day48_encapsulation.TicketFlight;

public class UsingFlight {
    public static void main(String[] args) {
       Flight flight1=new Flight("Economy","LA","DC");
        System.out.println(flight1);

        flight1.setType("basic");
        System.out.println(flight1);

        flight1.setArrivalLocation("MIA");
        flight1.setDepartureLocation("NY");

        System.out.println(flight1);
    }
}
