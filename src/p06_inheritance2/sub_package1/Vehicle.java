package p06_inheritance2.sub_package1;

/*
 *
 * Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class). 
 * Different kinds of objects often have a certain amount in common with each other.
 * link: https://www.w3schools.com/java/java_inheritance.asp
 */
public class Vehicle {

    // the Vehicle class has three fields
    // Private Fields CANNOT be accessed by the subclasses
    private String brand; // Toyota, Nissan, ..
    private String type; // Sedan, SUV, Van, ..
    private String wheels; // front-wheels drive, ...
    private int year; // The make year

    public String province = "Ontario";

    /*
     * To make any member (field/method) from the parent class
     * sharable with the child class, this member CANNOT be "private"
     * to solve this issue in OOP, two solution:
     * 1) we can set this field to be public, in such case the extended/sub class
     * can access it. But it will also accessed from outside the class and the
     * package!
     * and it's against the idea of "encapsulation"! so it's not the ideal solution
     * 
     * 2) we can use the keyword "protected",
     * which means (based on JAVA) that this member can be accessed
     * from the child class or within the sub class or within the same package but
     * it cannot be accessed anywhere outside these 3 zones.
     * 
     * Below We set the "isPreOwned" instance field in Vehicle to a "protected"
     * access modifier.
     * If it was set to "private" like the other fields,
     * the subclass "Car" class would not be able to access it.
     * 
     * To read more:
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    protected boolean isPreOwned = false;

    /*
     * IMPORTANT NOTE FOR REVIEWING:
     * *****************************
     * Any class we create is shipped with a default constructor
     * (with no parameters) that implicitly being generated
     * when we create a new object.
     * 
     * Adding (overloading) another/other constructor(s)
     * will remove the default one
     * 
     * so if you extends this class, the subclass CANNOT be without a
     * constructor,
     * it must implement the same constructor from the parent class,
     * OR you can redefine the default one explicitly in the superclass
     * to make it available again,
     * in such case no need to write the constructor in the subclass
     */
    // Default Constructor:
    // public Vehicle() {
    // }

    // the Vehicle class has one custom constructor
    public Vehicle(String brand, String type, String wheels, int year) {
        this.brand = brand;
        this.type = type;
        this.wheels = wheels;
        this.year = year;
    }

    // the Vehicle class has four methods
    public void StartDriving() {
        System.out.println("Start Driving");
    }

    public void stopDriving() {
        System.out.println("Stop Driving");
    }

    public void turn(String direction) {
        System.out.println("Turn " + direction);
    }

    public void getVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("type: " + type);
        System.out.println("wheels: " + wheels);
        System.out.println("year: " + year);
    }

    // we will add this method to get a record/list about the major recent
    // maintenance only
    public void getRecord(String fixPart, double cost) {
        System.out.println("What to fix: " + fixPart);
        System.out.println("Total Cost: " + cost);
    }
} // end class
