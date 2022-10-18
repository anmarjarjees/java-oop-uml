package p07_polymorphism;

public class Square extends Shape {
    // two values for length and height (no difference)
    private double length;

    public Square(double length) {
        this.length = length;
    }

    // We need to override the calcPerimeter() method to add the formula for
    // Square Perimeter
    // Then we can add our customized code:
    /*
     * Perimeter = 4 × a
     * a = length of side
     */
    public double calcPerimeter() {
        return this.length * 4;
    }

    // Override the toString() method from the mother object/class "Object"
    public String toString() {
        return "Square";
    }
}
