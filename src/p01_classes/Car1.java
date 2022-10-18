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
public class Car1 {
    /*
     * Classes/(Objects) can have to members:
     * 
     * Varaibles (Class Fields): data that are associated with the class
     * 
     * Methods: The behaviour or the functionality of the class/object
     * 
     * Encapsulation:
     * To keep all/some members hidden from the outside the object.
     * Which means this member cannot be accessed outside the class itself
     * we can do it using the keyword "private"
     * 
     * NOTE:
     * Any class member (fields and method)
     * are defaulted to be "public"
     * if we don't specify the access modifier
     */

    // Member Variables: data
    // NOTE: All these fields will be initialized to "null"
    private String brandName;
    private int year;
    private String type;
    private String model;

    // Methods: functionality
    void moveForward() {

    }

    void moveBackward() {

    }

    void turnRight() {

    }

    void turnLeft() {

    }

    void stop() {

    }
}
