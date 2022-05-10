package day25_05_09_2022.person;

/*   Create the following classes that inherits the Student
          					1. OnlineStudent
          					2. CampusStudent*/
public class OnlineStudent extends Student {
    public OnlineStudent(int batchNum){
        super(batchNum);
    }

    @Override
    public void sleep() {
        System.out.println("Online Student is Sleeping");
    }

    @Override
    public void attendClass() {
        System.out.println("Online Student is Attending Class");
    }

    @Override
    public void code(String language) {
        System.out.println("Online Student knows "+language+" language");
    }
}
