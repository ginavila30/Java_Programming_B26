package day58_exceptions_recap;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception  {//throws to allow the code to compile
        if(name==null|| name.isEmpty()){
            throw  new Exception("Name cannot be null or empty");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age<0||age>=120){
           throw new IllegalArgumentException("Age should be more than 0 or les than 120"); //throwing an exception
       }
        this.age = age;
    }
}
