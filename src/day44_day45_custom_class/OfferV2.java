package day44_day45_custom_class;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int PTO;

    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public OfferV2(String company, String location, double salary) {
        this(company, location);//->Chaining constructor
        this.salary = salary;
    }

    public OfferV2(String location, String company, double salary, boolean isFullTime, int PTO) {
        this(company, location, salary);//->chaining constructor
        this.isFullTime = isFullTime;
        this.PTO = PTO;
    }


    public String toString() {
        String result = company + " Located at" + location;
        if (salary != 0.0) {
            result += "\nSalary: " + salary;
        }
        if (isFullTime) {
            result += "\nIs full time? " + isFullTime;
        }
        if (PTO != 0) {
            result += "\nPTO: " + PTO;
        }
        ;
        return result;
    }
}
