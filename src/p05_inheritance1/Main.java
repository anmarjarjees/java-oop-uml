package p05_inheritance1;

// We need to import this class "Random" from java.util package
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random); // java.util.Random@4617c264
        System.out.println(random.nextInt()); // -1744098229
        System.out.println(random.nextDouble()); // 0.45998934180719087
        System.out.println(random.nextFloat()); // 0.80008423
        System.out.println(random.nextBoolean()); // false
        /*
         * There is no such method to create/generate a random letter in the Random
         * Class,
         * we can use inheritance to inherit the features of Random class
         * then customize it to add a random letter method to it
         */
        // System.out.println(random.letter()); // Error

        // Since our "Rand" class extends "Random"
        Rand rand = new Rand();
        // Then:
        System.out.println(rand); // inheritance_oop.Rand@5ca881b5
        System.out.println(rand.nextInt()); // 1746661256
        System.out.println(rand.nextDouble()); // 0.6629394300285394
        System.out.println(rand.nextFloat()); // 0.42144394
        System.out.println(rand.nextBoolean()); // true

        System.out.println("Random Small Letter: " + rand.nextSmallLetter());
    }
}
