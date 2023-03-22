package p06_inheritance2.sub_package2;

import p06_inheritance2.sub_package1.Vehicle;

public class Truck extends Vehicle {
    private String using;

    // this has the default access modifier
    String truckType = "Heavy Duties SX2";

    public Truck(String brand, String type, String wheels, int year, String using) {
        super(brand, type, wheels, year);
        this.using = using;
    }
} // end class
