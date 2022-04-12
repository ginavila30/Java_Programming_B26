package day44_custom_method;

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
        String result = company +" Located at" +location;
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
