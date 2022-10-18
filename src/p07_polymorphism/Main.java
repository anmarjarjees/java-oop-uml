package p07_polymorphism;

// NOTE: we need to import "List" class form the "java.util" package
import java.util.List;

/*
 * Polymorphism
 * ploy = many
 * morph => form
 */
public class Main {
    public static void main(String[] args) {
        Shape anyShape = new Shape();
        Rectangle myRectangle = new Rectangle(5, 7);
        Square mySquare = new Square(10);
        Triangle myTriangle = new Triangle(5, 7, 12);
        /*
         * All the three objects calling the same method from their parent class "Shape"
         * But the same method with the same signiture "calcPerimeter"
         * has been modified inside each one of them.
         * 
         * So each object's method behaves differently,
         * as the return value for using calcPerimeter()
         * is different in each object below:
         */
        System.out.println("The perimeter value of my rectangle is " + myRectangle.calcPerimeter());
        System.out.println("The perimeter value of my square is " + mySquare.calcPerimeter());
        System.out.println("The perimeter value of my triangle is " + myTriangle.calcPerimeter());

        System.out.println("***********");
        // Let's go beyond the simple implementation above by adding a list:
        /*
         * Three classes extend(s) the class shape
         * since all these classes have the same parent classes
         * so they can be treated as they were the same type
         */

        List<Shape> shapes = List.of(myRectangle, mySquare, myTriangle);
        for (Shape shape : shapes) {
            System.out.println("The perimeter value of my " + shape.toString() + " is " + shape.calcPerimeter());
        }

    }
}
