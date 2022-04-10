package day43_custom_class;

public class ThisKeyWord {
    int a=100;
    public ThisKeyWord(int a){
        a=400;//  working with local variable because java prioritizes local level when names are same.
        this.a=600;// this keyword tells compiler that we are working with instance vx instead of local
        System.out.println(a);// prints local variable
        System.out.println(this.a);// prints instance vx

    }
}
