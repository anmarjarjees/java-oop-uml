package p10_aggregation;

public class Computer {
    private String cpu;
    private String ram;

    // It's better to create a new class for the HardDrive only:
    /*
     * private String hardDriveType; // HDD or SSD
     * private String hardDriveBrand; // Seagate, Western Digital...
     * private String hardDriveSize; // in GB or in TB
     */

    // Using "has a" relationship with HardDrive class
    // using this:
    private HardDrive hardDrive;

    public Computer(String processor, String memory, HardDrive hardDisk) {
        cpu = processor;
        ram = memory;
        hardDrive = hardDisk;
        System.out.println("Testing Hard Drive: " + hardDrive);
    }

    public void getCompSpecs() {
        System.out.println("Specifications");
        System.out.println("CPU: " + cpu + "\nRAM: " + ram);
        System.out.println("Hard Drive: " + " " + hardDrive.brand + " " + hardDrive.type + " " + " " + hardDrive.size);
    }
}
