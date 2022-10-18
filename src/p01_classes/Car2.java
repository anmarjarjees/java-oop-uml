package p01_classes;

public class Car2 {
    // Member Variables: data (Fields or Instance Variables)
    // Member Variables: data
    private String branName;
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
    public Car2(String branName, int year, String carType, String carModel) {
        // the "this" refer to the instance fields
        this.branName = branName;
        this.year = year;

        // Notice: below no need to use the keyword "this"
        // However using "this" will give a clear idea about the class
        type = carType;
        model = carModel;
    }

    // Methods: functionality

    void getInfo() {
        System.out.println("Car2.carInfo()");
    }

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
     */
    @Override
    public String toString() {
        /*
         * We can omit the user of "this" keyword
         */
        // return "Name is: " + this.name + " Fav Food: " + this.favFood;
        return "BranName: " + branName + ". Year: " + year + " Car Type: " + type + ". Car Model: " + model;
    }
}

// Java will create a place in memory for this object
// using the new keyword to initialize an object
// new Constructor() will call the constructor method
