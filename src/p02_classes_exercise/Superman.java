package p02_classes_exercise;

public class Superman {
    private boolean isFlying;

    Superman() {
        System.out.println("Converting to Superman!");
    }

    void move(String heavyItem) {
        System.out.println("moving this large: " + heavyItem);
    }

    void runFast() {
        System.out.println("running faster than an express train...");
    }

    void fly(boolean isFlying) {
        this.isFlying = isFlying;

        if (this.isFlying)
            System.out.println("Superman is flying...");
        else
            System.out.println("Superman is not flying, just walking");
    }

    void getPower() {
        System.out.println("Getting the power from the yellow sun's radiation!");
    }

    public static void main(String[] args) {
        // 1. make a Superman
        // 2. let him fly
        // 3. let him get some power
        // 4. let him run fast
        // 5. let him move a heavy item
    }

}
