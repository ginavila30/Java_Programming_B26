package day05_05_09_2022.animal;

public class Dog extends Animal {

    String breed;
    int humanYears;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed=breed;
        humanYears=getAgeInHumanYears();
    }
    @Override
    public String toString(){
        return "Name: "+getName()+" Breed: "+breed+" Age in calendar years: "+getAge()+" Age in human years: "+humanYears;
    }


    @Override
    public int getAgeInHumanYears() {
       if(getAge()<=2){
           return getAge()*11;
       }else{
           return 22+((getAge()-2)*5);
       }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public boolean equals(Dog obj) {
       boolean result = false;
        if(getName().equals(obj.getName())){
            if(getAge()==obj.getAge()){
                if(breed.equals(obj.breed)){
                    result= true;
                }
            }
        }
        return result;
    }

}
