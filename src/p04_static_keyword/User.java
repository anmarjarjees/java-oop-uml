package p04_static_keyword;

public class User {
    // Fields (attributes):
    // variables inside a class:
    private String name; // null by default
    private int age; // 0 by default
    // Practicing the keyword "static"
    // this will make appName belongs to the "User" class itself
    // and also make userId belongs to the "User" class itself
    private static String appName; // application name
    private static int userId;
    private static int totalUsers;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        totalUsers++;
    }

    @Override
    public String toString() {
        return "Username: " + name + ", age: " + age + " and I am using " + appName;
    }

    // Methods:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I'm " + age + " years old");
    }

    // Then adding setter for the class field "appName":
    public void setAppName(String appName) {
        /*
         * As you see below, the error for "appName":
         * The static field User.appName should be accessed in a static way
         */
        this.appName = appName;
    }

    // Then adding a static method to return the total of users:
    public static int getUserTotal() {
        /*
         * As you see below, No complaining from Java about using this static field
         * "totalUsers"
         * since it's being used within a static method
         */
        return totalUsers;
    }
}