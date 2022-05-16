package day58_exceptions_recap;

public class Runner {
    public static void main(String[] args) throws Exception {
        Person person1=new Person();
        try {
            person1.setAge(150); // this will throw an unchecked exception if the age input is not correct. I will need try catch if I want to handle it.
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();}

            person1.setName(null);

            System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }
}
