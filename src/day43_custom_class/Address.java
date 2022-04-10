package day43_custom_class;

public class Address {
String street;
String city;
String state;
String zipcode;

//public Address(String inputStreet, String inputCity, String inputState, String inputZipcode){
//
//    street=inputStreet;
//    city=inputCity;
//    state=inputState;
//    zipcode=inputZipcode;
//}
public Address(String street, String city, String state, String zipcode){
    this.street=street;// Assigning value of local vx to instance vx using keyword this
    this.city=city;
    this.state=state;
    this.zipcode=zipcode;
}

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
