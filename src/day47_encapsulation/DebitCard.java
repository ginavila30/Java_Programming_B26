package day47_encapsulation;

public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    static {accountType="Checking";}

    public DebitCard(long cardNumber,String holderName, double balance){
        if(String.valueOf(cardNumber).length()!=16){
            System.err.println("Invalid card number");
        }else{this.cardNumber=cardNumber;}
        this.holderName=holderName;
        this.balance=balance;
    }

    public DebitCard(long cardNumber, String holderName, double balance, String cardType,int pin){
        this(cardNumber,holderName,balance); // constructor chaining

        if(cardType.equalsIgnoreCase("Master Card")||cardType.equalsIgnoreCase("Visa")){this.cardType=cardType;}else{
            System.err.println("Invalid card type");
        }
        if(String.valueOf(pin).length()==4){this.pin=pin;}else{
            System.err.println("Invalid pin");
        }
    }

    @Override
    public String toString() {
        return accountType +
                "cardNumber=" + (cardNumber==0?"":cardNumber) +
                ", HolderName=" + holderName +", "+
                (cardType==null?"":cardType)+
                ", balance=" + balance;
    }
}

//Q: What is the difference between instance and static members
// instance members belong to the object, each object has a copy of the members while static members belong to the class and a common copy is shared for all the objects created from that class.
//Q: How does the static block work
//Static block accepts only static members and is ideal for initializing static members. It runs first thing and only once when the class is called.
//Q: How does the constructor work
//Constructor is a special method that allows us to create objects. We initialize instance variables there. It can be no arguments (default) or parameterized (overloaded).
//Q: What are the possible static members
//Variables, methods, block, class
