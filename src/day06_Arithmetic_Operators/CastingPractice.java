package day06_Arithmetic_Operators;
/*declare and assign a short variable
declare and assign a byte variable with the short value above. Cast if needed

declare and assign a float variable
declare and assign a double variable with the float value above. Cast if needed

declare and assign a double variable
declare and assign a int variable with the double value above. Cast if needed

declare and assign a long variable
declare and assign a int variable with the long value above. Cast if needed*/
public class CastingPractice {
    public static void main(String[] args) {
        short Vx1=500;
        byte Vx2=(byte)Vx1;

        float Vx3=248964512f;
        double Vx4=Vx3;// No need to manual casting because double is bigger that float.

        double Vx5= 5.29;
        int Vx6=(int)Vx5; // manual casting because double is bigger than int.However, there will be data lost.
        System.out.println(""+Vx5+"\n"+Vx6);

        long Vx7=142546524565454l;
        int Vx8=(int)Vx7;// manual casting needed because long is bigger than int. Data lost happens in this case as well.
        System.out.println(Vx7);
        System.out.println(Vx8);
    }
}
