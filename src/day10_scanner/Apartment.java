/*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)*/

package day10_scanner;
import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System. in);

        System.out.println("Enter the address: ");
        String address=input.nextLine();

        String information="An apartment located at "+address;

        System.out.println("Enter the name of the owner: ");
        String nameOfOwner=input.nextLine();
        information+=" Owned by "+nameOfOwner;

        System.out.println("Enter the number of units: ");
        int unitNumber=input.nextInt();
        information+="\nThe building has "+unitNumber+" total units";

        System.out.println("How many floors? ");
        int numOfFloors= input.nextInt();

        information+=". And "+numOfFloors+" floors.";

        System.out.println("Enter average size of each unit:");
        int averageSize=input.nextInt();
        information+="The units average size is: "+averageSize+" sqft.";
        System.out.println("How much is the monthly rent? ");
        double rent= input.nextDouble();
        information+="\nThe monthly rent for the apartment is: $"+rent;

        System.out.println("How many wahsers and dries? ");
        int washerAndDryer= input.nextInt();
        information+="\nSome features are: \nHas washer and dryer: "+washerAndDryer;

        System.out.println("Are pets allow? ");
        boolean petsAllowed=input.nextBoolean();
        information+="\nDoes it allow pets? "+petsAllowed;

        System.out.println("Has a pool? ");
        boolean hasAPool=input.nextBoolean();
        information+="\nDoes it have a pool? "+hasAPool;

        System.out.println("What is the lease term? ");
        int leaseTerm= input.nextInt();
        information+="\nThe lease term is: "+leaseTerm+" months";

        System.out.println("What is the total number of residents?");
        int numResidents= input.nextInt();
        information+="\nThe number of residents is: "+numResidents;

        System.out.println("Enter the phone number: ");
        input.nextLine();
        String phoneNumber=input.nextLine();
        information+="\nThe contact number is: "+phoneNumber;

        System.out.println("Is it near to a gas station? ");
        boolean gasStationNear=input.nextBoolean();
        information+="\nThere is a gas station near by: "+gasStationNear;


        System.out.println("Has a basement?");
        boolean basement=input.nextBoolean();
        information+="\nThere is a basement? "+basement;
        System.out.println("Has available units for rent?" );
        boolean unitsForRent= input.nextBoolean();
        information+="\nAre there units available? "+unitsForRent;
        System.out.println("Has air conditioner? ");
        boolean airConditioner=input.nextBoolean();
        information+="\nDoes it have air conditioner? "+airConditioner;

        System.out.println("How many parking spaces? ");
        int parkingSpaces= input.nextInt();
        information+="\nIt has "+parkingSpaces+ " parking spaces.";

        System.out.println("Has wheel chair access?");
        boolean wheelChair=input.nextBoolean();

        information+="\nDoes it have wheel chair access? "+wheelChair;

        System.out.println("How many review stars? ");
        int reviewStars=input.nextInt();
        information+="\nThe reviews rate in google : "+reviewStars;

        double rentAfter3Yrs = rent*0.9;
        information+="\nAfter 3 years the monthly rent will be: "+rentAfter3Yrs;
        double rentAfter6Yrs= rent*0.8;
        information+="\nAfter 6 years the monthly rent will be: "+rentAfter6Yrs;

        int residentsPerUnit= numResidents/unitNumber;
        information+="\nThere are "+residentsPerUnit+" residents per unit";
        int parkingPerUnit=parkingSpaces/unitNumber;
        information+="\nThere are "+parkingPerUnit+" parking spots per unit";
        int unitsPerFloor=unitNumber/numOfFloors;
        information+="\nThere are "+unitsPerFloor+" units per floor";

        System.out.println(information);






    }
}
