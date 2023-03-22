package p06_inheritance2.sub_package2;

class MainTwo {
    public static void main(String[] args) {
        Truck myTruck = new Truck("Jumbo", "XL3", "3 wheels drive", 2012, "Snow");

        System.out.println(myTruck.truckType);

        // We can easily access the public property "province":
        myTruck.province = "BC";
        // testing:
        // myTruck:
        // myTruck.isPreOwned;
        // Error: The field Vehicle.isPreOwned is not visible

        /*
         * if (myTruck.isPreOwned) {
         * System.out.println("It's a used car");
         * } else {
         * System.out.println("It's a new car");
         * }
         */

    }
}