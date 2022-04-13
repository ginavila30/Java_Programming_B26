package day44_day45_custom_class;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int PTO;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int PTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.PTO = PTO;
    }


    public String toString() {
        String result = "\n"+company +" Located at " +location;
        if (salary != 0.0) {
            result += "* Salary: " + salary;
        }
        if (isFullTime) {
            result += "* Is full time? " + isFullTime;
        }
        if (PTO != 0) {
            result += "* PTO: " + PTO;
        }
        ;
        return result;
    }
}
