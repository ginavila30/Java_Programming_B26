package day54_05_03_2022.language;

public class Turkish implements Language{
    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye() {
        System.out.println("Gule Gule");
    }
}
