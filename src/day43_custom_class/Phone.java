package day43_custom_class;

/*
       create instance variables

           name, brand, memory, version

       create constructors

       - accept and initialize the name

       - accept and initialize the name and brand

       - accept and initialize the name, brand, memory, and version

       create a toString
    */
public class Phone {
    String model;
    String brand;
    int storage;
    double version;

    public Phone(String model) {
        this.model = model;
    }

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Phone(String model, String brand, int storage, double version) {
        this.model = model;
        this.brand = brand;
        this.storage = storage;
        this.version = version;
    }

    //    @Override
//    public String toString() {
//        return "Phone" +
//                "\nmodel=" + model +
//                "\nbrand=" + brand +
//                "\nstorage=" + storage +
//                "\nversion=" + version;
//    }
    public String toString() {
        String objInfo = model ;
        if (brand != null) {
            objInfo += " | "+ brand;
        }
        if (storage != 0) {
            objInfo +=  " | "+storage ;
        }
        if (version != 0.0) {
            objInfo +=  " | "+version;
        }
        return objInfo;
    }

}
