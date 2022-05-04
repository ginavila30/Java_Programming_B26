package day54_05_03_2022.animal;

import day54_05_03_2022.language.Language;

public final class Parrot extends Bird implements Flyable, Language {



    @Override
    public void eat() {
        System.out.println("Parrot wobble over the ");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("Parrot is saying hi");
    }

    @Override
    public void bye() {
        System.out.println("Parrot is saying bye");
    }


}
