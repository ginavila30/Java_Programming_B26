package day51_inheritance.lyft;

public class Lyft {
    String driver;

    public  Lyft(String driver){
        this.driver=driver;
    }

    public double calculateRate(int miles){

        return miles*1.50;
    }

    public double calculateRate(double miles){

        return miles*1.50;
    }
}
