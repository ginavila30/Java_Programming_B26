package day47_encapsulation;

public class Login {
   private String userName;
    private String password;
    //Creating a setter method below:

    public void setUserName (String userName){
        this.userName=userName;
    }
    public void setPassword (String password){
      if(password.length()>8){
        this.password=password;
    }
    }
    public String getPassword(){
        return password;
    }
    public String getUserName(){
        return userName;
    }

}
