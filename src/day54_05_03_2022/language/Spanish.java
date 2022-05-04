package day54_05_03_2022.language;

public class Spanish implements Language{ //Spanish implements Language
    //Abstract methods from Language interface need to be overridden and implementation must be given.
    @Override
    public void bye() {
        System.out.println("Hola");
    }

    @Override
    public void hi() {
        System.out.println("Adios");
    }

}
