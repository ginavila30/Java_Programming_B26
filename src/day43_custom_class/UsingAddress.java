package day43_custom_class;



public class UsingAddress {
    public static void main(String[] args) {
        Address address1=new Address("Greensboro","Mclean","VA","22102");
        System.out.println(address1);
        address1.street="8350 Greensboro Dr.";
        System.out.println(address1.street);
        System.out.println(address1);
    }
}
