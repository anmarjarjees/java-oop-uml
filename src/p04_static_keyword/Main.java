package p04_static_keyword;

public class Main {
    // main() the entry point to run our Java application
    // It will be immediately invoked without an object
    public static void main(String[] args) {
        User user1 = new User("Alex Chow", 48);
        User user2 = new User("Martin Smith", 51);

        user1.greetAll();
        user2.greetAll();

        /*
         * Error:
         * The static method hiAll() from the type User should be accessed in a static
         * way
         * 
         * Question: How "Should be accessed in a static way"???
         */
        // user2.hiAll(); // Error
        User.hiAll(); // hiAll() is a static method

        // Example of using pow() static method of Math object:
        double num = 2;
        num = Math.pow(num, 10);

        // Setting a value for the appName for user1:
        user1.setAppName("Zoom");

        // Setting a value for the appName for user2:
        // user2.setAppName("Teams");

        System.out.println(user1);
        // Before overriding toString() static_keyword.User@4617c264
        // After => Username: Alex Chow, age: 48

        System.out.println(user2);
        // Before overriding toString() static_keyword.User@36baf30c
        // After => Username: Martin Smith, age: 51

        // calling our custom method "getFactorial()":
        System.out.println("The factorial of 5 is :" + getFactorial(5));
        System.out.println("The factorial of 3 is :" + getFactorial(3));
        System.out.println("The factorial of 0 is :" + getFactorial(0));

        /*
         * Two Case Scenarios that imply the need of using "static" fields/methods:
         */
        // Case#1
        // After adding the setter for the field appName
        // and set its value to "Zoom" for only user1:
        // Username: Alex Chow, age: 48 and I am using Zoom
        // Username: Martin Smith, age: 51 and I am using Zoom

        // Case#2
        // After adding the setter for the field appName
        // and set its value to "Zoom" for user1:
        // and set its value to "Teams" for user2:
        // Username: Alex Chow, age: 48 and I am using Zoom
        // Username: Martin Smith, age: 51 and I am using Zoom

        /*
         * In Case#1:
         * As you saw both have the value of "Zoom"
         * this is because "appName" field is a static field
         * so it belongs to its class not to the instance
         * that's why once appName get/receive a value
         * this value will be stick to it to be attached to all its instances
         * as it's "static"
         * 
         * In Case#2:
         * As you saw both have the value of "Teams"
         * for the same reason, a static field will take its value and change all its
         * instances
         * based on the recent value assigned to it.
         */

        /*
         * Since Static members can be accessed within the Class itself,
         * we cannot access them through the instance,
         * so we can access their values using this syntax:
         * ClassName.StaticField
         * OR:
         * ClassName.StaticMethod()
         */

        // Static members can be accessed:
        // Remember to run this line we need to make "appName" public
        // Otherwise = Error => The field User.appName is not visible
        // System.out.println("The value of the static field appName is: " +
        // User.appName);

        System.out.println("So far, we have " + User.getUserTotal() + " users."); // So far, we have 2 users.
    } // end of the main() method

    // Reviewing the "static" method:
    // below we can create own custom methods:
    // find/return the factorial:
    // 5! = 5 * 4 * 3 * 2 * 1
    // 3! = 3 * 2 * 1
    // 0! = 1
    private static int getFactorial(int number) {
        /*
         * number = 5
         * 5 * 4 * 3 * 2 * 1 = same
         * 1 * 2 * 3 * 4 * 5 = same
         */
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

}
