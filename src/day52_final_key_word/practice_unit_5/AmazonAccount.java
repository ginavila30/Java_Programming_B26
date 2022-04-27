package day52_final_key_word.practice_unit_5;

public class AmazonAccount {
   private String name;
   private String email;
   private boolean hasPrime;

    public AmazonAccount(String name, String email, boolean hasPrime){
        this.name=name;
        this.email=email;
        this.hasPrime=hasPrime;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setHasPrime(boolean hasPrime){
        this.hasPrime=hasPrime;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public String toString(){
        return "Name-> "+name+" Email-> "+email+" Is prime-> "+(isHasPrime()?"Yes":"No");
    }
}
