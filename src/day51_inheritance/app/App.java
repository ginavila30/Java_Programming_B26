package day51_inheritance.app;

public class App {//App is a object because Object class is  parent class of all classes.
//    Create an App class
//
//    - create variables:
//    name (app name), version
//
//    - create constructor to initialize the variables
//
//    - create method:
//    download()
//    Example output: prints $name is downloading version $version
static String group ="apps group";
    String name;
    double version;
//private int count;

//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        if(count>10){this.count = count;}else{
//            System.out.println("Invalid input");
//        }
//    }

    public App (String name, double version){
        this.name=name;
        this.version=version;

    }

    public void download(){
        System.out.println(name+" is downloading version "+version);
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
