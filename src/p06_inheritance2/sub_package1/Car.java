package p06_inheritance2.sub_package1;

/*
 * A class declaration for a MountainBike class that is a subclass of Bicycle:
 * - A subclass inherits all of the "public" and "protected" members of its parent
 * - A subclass does not inherit the "private" members of its parent class
 * - The inherited fields can be used directly, just like any other fields
 * - Subclasses use "extends" keyword in the definition
 * - Subclasses can define new local methods or fields to use 
 * or can use the "super()" method and "super" keyword to call inherited methods or the super constructor. "super" keyword can be used to:
 * - Access parent class fields => super.fieldName
 * - Access parent class method => super.methodName()
 * - Using Constructors => creating a new instance of the parent class
 * from within the child class
 */

public class Car extends Vehicle {
    /*
     * Car inherits all the fields and methods of Vehicle and adds the
     * field fuelType and purchaseYear
     */
    // Besides the three fields from the parent class:
    // the Car subclass adds two fields:
    private String fuelType;
    private int purchaseYear;

    /*
     * You can write a subclass constructor that invokes the constructor of the
     * superclass by using the keyword "super"
     */
    // the MountainBike subclass has one constructor
    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {
        // Since we are changing the original/parent constructor by adding a new field
        // "fuelType"
        // We need to call it again to enter the original fields using super() method
        // then assign the new value:
        /*
         * To invoke the super() method,
         * place super() in the body of the subclass' constructor
         * the () can hold any specific arguments that an instance of the
         * subclass should contain:
         */
        super(brand, type, wheels, year); // calling parent class constructor
        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Printing car specifications
    public void getCarSpecs() {
        /*
         * First, we need to call the method "getVehicleInfo()" from the parent class
         */
        getVehicleInfo();
        // Just adding our extra info:
        System.out.println("Fuel Type: " + fuelType);
    }

    // Creating another method with the same name "getCarRecord"
    // from the original class:
    public void getRecord() {
        // String fixPart, double cost
        super.getRecord("Breaks", 869.73);
        System.out.println("Purchase Year: " + purchaseYear);
    }
    /*
     * NOTE ABOUT "super" keyword:
     * getCarSpecs() is calling the method "getVehicleInfo()" from the parent class
     * just by referencing its name "getVehicleInfo()" [without "super" keyboard]
     * because the subclass "Car" doesn't have its own implementation of
     * "getVehicleInfo()"
     * 
     * getRecord() is calling the method "getRecord()" from the parent class
     * by using the "super" keyword then dot notation.
     * the "super" keyword is needed here because both (super class/subclass)
     * using the same method name "getRecord()"
     * so the program needs to know which version of the method to be used
     */

    // another method for accessing a default property:
    public void showStatus() {
        // System.out.println("Status".);
    }
}
