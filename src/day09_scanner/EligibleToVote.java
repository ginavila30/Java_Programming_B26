package day09_scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Gina";
        boolean areTheyCitizen=false;
        boolean criminalBackground=false;
        int age= 27;

        boolean voteEligibility= areTheyCitizen && !criminalBackground && age>=18;// fals && !false-->true && true. Result is True

        System.out.println("Is "+name+" eligible to vote? "+voteEligibility);

        name="Majid";
        areTheyCitizen=true;
        criminalBackground=true;
        age=37;
        voteEligibility=areTheyCitizen && !criminalBackground && age>=18;
        System.out.println("Is "+name+" eligible to vote? "+voteEligibility);

    }
}
