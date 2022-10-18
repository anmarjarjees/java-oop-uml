package p02_classes_exercise;

public class CatGame {
    private String name;
    private int strength = 100; // 100%

    CatGame(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println("meow meow meow!");
    }

    public void printName() {
        if (name == null)
            System.out.println("No name!");
        else
            System.out.println("my name is " + name);
    }

    void hit() {
        strength -= 10;
        if (strength > 0)
            System.out.println("Oah! You hit me, but my strength is not finished yet, I still have " + strength + "%");
        else if (strength < 0)
            System.out.println("that's game is over!");
        else
            System.out.println("Goodbye Cat :(");
    }

    public static void main(String[] args) {
        /* Do the following things without changing the Cat class */

        // 1. Make the Cat meow
        CatGame cat1 = new CatGame("Shellow");

        // 2. Get the Cat to print it's name
        cat1.printName();

        // 3. Kill the Cat!
        cat1.hit();
    }
}
