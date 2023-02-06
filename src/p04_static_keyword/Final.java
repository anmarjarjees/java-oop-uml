package p04_static_keyword;

public class Final {
    /*
     * Calling the main method:
     * since it's the entry point so it has to be static
     * in order to be executed immediately before instantiating any instance
     */
    public static void main(String args[]) {
        /*
         * The code below will generate this error
         * for the same reason as discussed before:
         * Error:
         * Cannot make a static reference to the non-static method barking()
         * from the type Dog
         */
        // Dog.barking();

        /*
         * Two Solutions:
         * 1) Change this method() to be "static" inside its original class as we saw
         * before
         * 
         * 2) If you don't want to make any changes to the original class,
         * Yes we can create an instance variable of the class:
         * Dog dogy = new Dog();
         * then dogy.barking();
         * 
         * OR:
         * Use this way: Chaining the class method through the constructor
         * - Creating an new constructor and chaining to it the barking() method
         * immediately
         */
        new Dog().barking();
    }
}
