package p01_classes;

/*
 * Working with a class named "Car"
 * An object is any entity that has:
 * - state 
 * - behavior
 * 
 * Example:
 * Car is an object. It has
 * States: sedan, 4-weal, white, etc...
 * Behaviors: driving, braking, turn left, turn right, ... 
 */
public class Car {
    /*
     * Classes/(Objects) can have to members:
     * 
     * Varaibles (Class Fields): data that are associated with the class
     * 
     * Methods: The behaviour or the functionality of the class/object
     * 
     * Encapsulation:
     * To keep all/some members hidden from the outside the class.
     * Which means this member cannot be accessed outside the class itself
     * we can do it using the keyword "private"
     * 
     * NOTE:
     * Any class member (fields and method)
     * are defaulted to be "public"
     * if we don't specify the access modifier
     */

    // Member Variables: data (Instance Variables or Class Variables [static])
    // NOTE: All these fields will be initialized to "null"
    private String brandName;
    private int year;
    private String type;
    private String model;

    /*
     * In OOP, any class has a built-in method named "Constructor":
     * - is being implemented auto when we instantiate an object
     * we can customize
     * - it can be used to initialize the class members based on our need
     * - The constructor name matches the class name
     * - Doesn't have a return type as it doesn't return anything
     * - it's implicitly return a new instance (object) of a class
     */

    // Constructor for setting the values:
    // Constructor Parameters: String branName, int year, String carType, String
    // carModel
    public Car(String branName, int year, String carType, String carModel) {
        // the "this" refer to the instance fields
        this.brandName = branName;
        this.year = year;

        // Notice: below no need to use the keyword "this"
        // However using "this" will give a clear idea about the class
        type = carType;
        model = carModel;
    }

    // Methods: functionality:
    public void getInfo() {
        System.out.println(
                "brandName: " + brandName + ". Year: " + year + " Car Type: " + type + ". Car Model: " + model);

        /*
         * in PHP :-)
         * echo "<p>brandName $brandName</p>";
         * echo "<p>brandName ".$brandName."</p>";
         */
        // System.out.println(Car.carInfo());

    }

    public void moveForward() {

    }

    public void moveBackward() {

    }

    public void turnRight() {

    }

    public void turnLeft() {

    }

    public void stop() {

    }

    // To see a readable info:
    /*
     * We can override the toString() method:
     * 
     * Using @override Annotation:
     * Annotations, a form of metadata, provide data about a program that is not
     * part of the program itself. Annotations have no direct effect on the
     * operation of the code they annotate.
     * 
     * When overriding a method, you might want to use the @Override
     * annotation that instructs the compiler that you intend to override a method
     * in the superclass. If, for some reason, the compiler detects that the method
     * does not exist in one of the superclasses, then it will generate an error.
     * Link: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
	 
	 also notice the annotation "override":
	 - informs the compiler that the element is meant to override an element declared in a superclass. 
	 - While it is not required to use this annotation when overriding a method, it helps to prevent errors. 
	 If a method marked with @Override fails to correctly override a method in one of its superclasses, 
	 the compiler generates an error.
	 - If you don’t use theis annotation, 
	 this  method will be treated as a new method in the subclass (rather than the overriding method).
	 Link: https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html
     */
    @Override
    public String toString() {
        /*
         * We can omit the user of "this" keyword
         */
        // return "Name is: " + this.name + " Fav Food: " + this.favFood;
        return "BranName: " + brandName + ". Year: " + year + " Car Type: " + type + ". Car Model: " + model;
    }
} // end class file

// Java will create a place in memory for this object
// using the new keyword to initialize an object
// new Constructor() will call the constructor method
