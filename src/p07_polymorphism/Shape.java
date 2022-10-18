package p07_polymorphism;

/*
 * Shape is the main superclass for the other subclasses:
 * - Square
 * - Triangle 
 * - Rectangle
 */
public class Shape {
    /*
     * Add calcPerimeter() method to the class,
     * which calculates its perimeter (the length of the shape's outer edge)
     * and logs the result to the console.
     */
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }

    // The other better way is declaring this method as an abstract method:
    // In such case, the class "Shape" has to be declared as an abstract also:
    // otherwise, VS Code throw an error:
    // The abstract method calcArea in type Shape can only be defined by an abstract
    // class
    // public abstract void calcArea();
}
