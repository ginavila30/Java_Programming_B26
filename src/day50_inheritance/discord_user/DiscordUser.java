package day50_inheritance.discord_user;

import day50_inheritance.app.App;

public class DiscordUser {
//    Create an DiscordUser class
//
//    - create variables:
//    role, name, id
//
//    - create constructor to initialize the variables
//
//    - create a toString() method

    String role;
    String name;
    String id;
    App cydeoApp;

    public DiscordUser(String role, String name,String id){
        this.role=role;
        this.name=name;
        this.id=id;
        cydeoApp =new App("Cydeo App",2.5);
    }

    public String toString(){
        return "User: "+"Name->"+name+" Role->"+role+" ID->"+id+" School App "+ cydeoApp;
    }



}
