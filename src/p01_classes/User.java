package p01_classes;

public class User {

    // Fields (attributes):
    // variables inside a class:
    public String name;

    /*
     * Constructor:
     * A method that are being called and triggered automatically when creating a
     * new instance of a class.
     * A default constructor that has no parameters
     * 
     * We can overload constructors like methods.
     * The constructor overloading can be defined as the concept of having more than
     * one constructor with different parameters
     * so that every constructor can perform a different task.
     */

    public User(String name) {
        // this.ClassField = passingVariable;
        // error below:
        // name = name; // Java will be confused
        this.name = name;
        /*
         * Other solution is passing another variable title
         * for example if the constructor parameter is userName
         * we can simply write:
         * name = userName
         * we can also still using => this.name = userName;
         * 
         * However, using this. has a better meaning that we are referring the class
         * field value
         */
    }

    // Methods:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I will work with you on Java!");
    }
}
