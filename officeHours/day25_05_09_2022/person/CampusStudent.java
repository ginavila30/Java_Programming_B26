package day25_05_09_2022.person;

public class CampusStudent extends Student {
   public  CampusStudent(int batchNum){
       super(batchNum);
   }

    @Override
    public void attendClass() {
        System.out.println("Campus Student Attending Class");
    }

    @Override
    public void sleep() {
        System.out.println("Campus Student Sleeping");
    }

    @Override
    public void code(String language) {
        System.out.println("Campus Student knows "+language+" language");
    }
}
