package day21_04_25_2022.employee;

/*Task  1 : EmployeeTask

         Create an Employee Class:

    			private variables:
    				name, gender, age, salary

    			Encapsulate all the private fields

    				1. Name can not be empty
    				2. gender can not anything other than female or male
    				3. age can not be less than 18
    				4. salary can not be zero or negative

*/
public class UsingEmployee {
    public static void main(String[] args) {
        Employee obj1=new Employee("Gina",'F',27,120);
        obj1.setAge(17);
        obj1.setAge(32);
        System.out.println(obj1.getAge());
        obj1.setGender('s');
        obj1.setSalary(-20);
        obj1.setName("  ");
        System.out.println(obj1);

    }
}
