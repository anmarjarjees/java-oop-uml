package p07_polymorphism;

public class Triangle extends Shape {
    // three values for side1, side2, and base (no difference)
    private double value1;
    private double value2;
    private double value3;

    public Triangle(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    // We need to override the calcPerimeter() method to add the formula for
    // Triangle Perimeter
    /*
     * Triangle:
     * Perimeter = a + b + c
     */
    public double calcPerimeter() {
        return this.value1 + this.value2 + this.value3;
    }

    // Override the toString() method from the mother object/class "Object"
    public String toString() {
        return "Triangle";
    }
}
