package p10_aggregation;

// aggregation 
public class Main {
    public static void main(String[] args) {
        HardDrive hd = new HardDrive("SSD", "Seagate", "500GB");
        Computer pc = new Computer("Intel i5", "12 GB", hd);

        pc.getCompSpecs();
    }
}
