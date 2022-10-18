package p07_polymorphism;

public class Rectangle extends Shape {
    // two values for length and height
    // value1 and value2 interchangeably (no difference)
    private double value1;
    private double value2;

    public Rectangle(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // We need to override the calcPerimeter() method to add the formula for
    // Rectangle Perimeter
    /*
     * Rectangle:
     * Perimeter = a + b + c + d
     * OR:
     * Perimeter = 2 × (a + b)
     */
    public double calcPerimeter() {
        return 2 * (this.value1 + this.value2);
    }

    // Override the toString() method from the mother object/class "Object"
    public String toString() {
        return "Rectangle";
    }
}
