package p03_encapsulation;

/*
 * Coupling is one the OOP terminologies,
 * Coupling determines how much a class is coupled or dependent on another class
 * Example:
 * The main file "Main.java" depends on the class file "User.java"
 * which means any simple change we add to the "User class"
 * like for example changing the constructor method
 * to accept name and age, the main class "Main.java" will be affected
 * this change will need Java to recompile and redeploy the entire program
 * 
 * Even we change something in our class "User" that doesn't affect our code,
 * still Java needs to recompile all the classes that use "User",
 * so in case we have many classes that depend on "User"!
 */
public class User {
    // Yes, not good idea to identify class fields to be public!
    // It should be private following the encapsulation concept
    public String name;
    public int subNum;

    public User(String name, int subNum) {
        this.name = name;
        this.subNum = subNum;
    }

    // Methods:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I will work with you on Java!");
        System.out.println("I have " + subNum + " subject(s) to work on");
    }

}
