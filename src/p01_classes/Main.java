package p01_classes;

// Classes
// Our main class
/*
 * NOTE:
 * Since the "User" class inside the same package "design_pattern_opp.p1_classes" 
 * as the current "Main" class
 * So we don't need to import it
 * The syntax is:
 * import package.name.ClassName;   // Import a single class
 * import package.name.*;   // Import the whole package
 * 
 * We did the same when we wanted to use the Scanner class to get the user input:
 * import java.util.Scanner;
 * - java.util => is the package (nested packages) 
 * - Scanner => is a class
 */
public class Main {
    public static void main(String[] args) {
        // Starting with "User" class:
        // creating an instance of User class:
        // <type> variableName = new <type>();
        User user1 = new User("Alex");

        // using "System" class then "out" PrintStream [a field/object inside System
        // class] that has the method println()
        System.out.println(user1.name);

        // assigning name to the class property "name" can work also
        user1.name = "Chow";
        System.out.println(user1.name);

        user1.greetAll();

        /*
         * In OOP, by convention:
         * it's a normal and standard to have the object name exactly as the class name
         * but to be all in small letter for example:
         * "Car" and its instance "car"
         * Car car = new Car()
         * "Person" and its instance "person"
         * Person person = new Person()
         */
        // Then with "Person" class:
        /*
         * Notice that the "Person" class has it's own main method,
         * but Java can run only one main method as the entry point
         * which is the one that inside the class file that you are running
         */
        Person person = new Person("Alex Chow", 48);
        person.getInfo();
        /*
         * Name is Alex Chow
         * Age is 48
         */

        // Then "Car2" class:
        Car2 myCar = new Car2("Dodge", 2010, "SUV", "CXT");
        Car2 johnCar = new Car2("Nissan", 2012, "Sedan", "Vista");

        myCar.getInfo();
        myCar.moveBackward();
        johnCar.moveBackward();

        System.out.println(myCar); // Before toString() override => classes.Duck2@4617c264
        // ...............

        System.out.println(johnCar); // Before toString() override => classes.Duck2@36baf30c
        // ...................
    } // end main()
} // end Main
