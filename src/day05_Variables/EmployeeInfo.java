/* Task

    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)

    Print all the variable*/
package day05_Variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName="Gina";
        String lastName="Sodavi";
        char gender='F';
        int age= 27;
        String companyName="Google";
        boolean fullTime= true;
        boolean noFullTime=false;
        String jobTitle="SDET";
        double salary=120_000.99; // I can not put . or, between the numbers. But I can use _.
        int pto= 15;
        boolean married= true;
        boolean notMarried=false;
        char suite='A';

        String fullDetails = "Employment info for: "+ firstName+ lastName+ "\n"+ jobTitle+ " at "+ companyName+ " with a yearly salary of "+ salary; // I entered multiple Vxs in one string for simple use.

        System.out.println(fullDetails);// I am printing the String created by including multiple variables.


        // I can declare multiple variables of the same type at the same time bit I need to assign value separately. Example below:

        int id, vacationsDays, yearsOfExperience;

        id=5104;
        vacationsDays=15;
        yearsOfExperience=3;


    }
}
