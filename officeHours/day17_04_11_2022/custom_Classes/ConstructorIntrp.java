package day17_04_11_2022.custom_Classes;

public class ConstructorIntrp {
      /*

    What is Constr ?

    - It is a special method to init all instance Variables  for CURRENT OBJECT
    - Constructor name MUST be SAME with CLASSNAME
    - DOES NOT HAVE RETURN TYPE



    When it works ?

    - it works when you call it.

     ConstructorIntro c =  new ConstructorIntro();



     - Structure

            AccessModifier ClassName(){

            }

            public Car(){
               // No ARG Constr

            }


    Types of Constr


    No ARG Constr

         - if we dont create any CONSTR , Compiler will create DEFAULT Constr (with no param)

         - if you create CONSTR either with param OR not , compiler will not create it for you


     Parameterized Constr

        - if you want to init your instances , you need to pass your values as arg


         public class Rectangle {

            int length ;

            int width ;

            public Rectanlge(int length,int width){

            this.length=length;
            this.width=width ;

            }

            // Java prioritizes local variables
            // that s why we need to specify current Object instance cariable with this

         }


        Constructor Chaining

          WILL CONTINUE

     */
}
