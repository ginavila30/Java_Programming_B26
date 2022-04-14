package day17_04_11_2022.custom_Classes;

public class CustomClassIntro {
     /*

    What is CLASS ?

    - Blueprint / Template for OBJECT
    - We can create CLass without OBJECT

          Arrays.toString();   // toString is static method

     What is OBJECT ?


     - Instance of the CLASS
     - Objects consumes  memories in heap
     - We can t create an OBJECT without CLASS

     Car                 c                          =        new                           Car();

     Class              Reference Var / Object Name      keyword to create new OBJECT      Constructor






     */

    String instanceVariable;   //  null

    /*
    What is instanceVar ?

    - BELONGS TO OBJECTS ( Each Object has their own copy )
    - it needs to be created outside of any methods (should be in class )
    - Attributes / datas / field
    - Init is not mandatory (Default values like null,0,0.0,false etc )

    How can we access them ?

    - We need to create one OBJECT to access them ( variable / methods )

      Car c =new Car();
      c.instanceVariable="BMW";   // change- assign value
      sout(c);   -- it will print whole object information
      sout(c.instanceVariable) -- to print only instance

     */

    public CustomClassIntro(){
        System.out.println("Constr is running");
        instanceVariable="Hello from Constr";
    }

    public void instanceMethod(){


        /*
        What is instanceMethod ?

        - Instance Methods can access instance Variable and Methods


           Car c =new Car();
           c.instanceMethod();   // to call instance method from OBJECT

         */

        System.out.println("Instance Method is Running");
        instanceVariable="Instance Variable from InstanceMethod";
        System.out.println(instanceVariable);

        String localVariable="Local Variable from InstanceMethod";
        System.out.println(localVariable);


        /*

        What is LocalVariable ?

        - Belongs METHOD |SCOPE
        - Exist only inside SCOPE or METHOD

         */

        if(true){

            String localVariableFromIf="IF Statement";
        }

        // localVariableFromIf="Only valid in related SCOPE ";
        // There is no access for this local variable in there


    }



    public String toString() {
        return "CustomClassIntro{" +
                "instanceVariable='" + instanceVariable + '\'' +
                '}';
    }

}
