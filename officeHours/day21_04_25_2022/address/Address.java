package day21_04_25_2022.address;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address(String street, String city, String state, String zipcode, String country){
        setStreet(street);
        setCity(city);
        setState(state);
        setZipcode(zipcode);
        setCountry(country);
    }

    public void setStreet(String street){
       if(!street.isEmpty()){ this.street=street;}

    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZipcode(String zipcode){
        if(zipcode.length()==5){this.zipcode=zipcode;}
    }
    public void setCountry(String country){
        this.country=country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
