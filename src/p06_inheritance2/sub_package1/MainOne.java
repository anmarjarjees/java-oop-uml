package p06_inheritance2.sub_package1;

public class MainOne {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Sedan", "2 wheels drive", 2010, "Gas", 2014);
        myCar.getCarSpecs();
        myCar.getRecord();

        // Just for testing the default constructor:
        // Vehicle testVehicle = new Vehicle();

        /*
         * any class member with "protected" access modifier
         * can be accessed inside:
         * - same class
         * - same package
         * - subclass
         * NOT => World (Outside their package)
         * - (except the subclass) in the same package
         */
        if (myCar.isPreOwned) {
            System.out.println("It's a used car");
        } else {
            System.out.println("It's a new car");
        }

        Car myCar3 = new Car("Nissan", "Sedan", "2 wheels drive", 2008, "Gas", 2012);

        myCar3.isPreOwned = false;

        if (myCar3.isPreOwned) {
            System.out.println("It's a used car");
        } else {
            System.out.println("It's a new car");
        }

        /*
         * any class member with default access modifier
         * can be accessed by any class (except the subclass) in the same package
         */
    }
}
