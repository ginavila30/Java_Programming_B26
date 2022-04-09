package day32arraysclassnandmulti;

public class Car {
    public static  void unlockCar(){
        System.out.println("Unlocking Car");
    }
    public  static  void openDoors(){
        System.out.println("Opening Doors");
    }
    public static  void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing door");
    }
    public static void getReadyToGo(){
        System.out.println("Seatbelt on");
        System.out.println("Checking mirrors");
        System.out.println("Putting music on");
        System.out.println("Setting Navigation");
    }
    public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Putting car in to drive");
        System.out.println("Going forward");
    }
    public static void goInHurry(){
        unlockCar();
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {
        unlockCar();
        openDoors();
        sitInCar();
        getReadyToGo();
        startCar();
        driveAndGo();
       //   Below a method of other methods regrouped.
        goInHurry();// example of a method that is made of a group of other methods.
        System.out.println("Hears police siren");
        getReadyToGo();

    }
}
