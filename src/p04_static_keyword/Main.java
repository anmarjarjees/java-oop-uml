package p04_static_keyword;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex Chow", 48);
        User user2 = new User("Martin Smith", 51);

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
    }
}
