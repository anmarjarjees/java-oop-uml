package p10_aggregation;

public class HardDrive {

    public String type; // HDD or SSD
    public String brand; // Seagate, Western Digital...
    public String size; // in GB or in TB

    public HardDrive(String hdType, String hdBrand, String hdSize) {
        type = hdType;
        brand = hdBrand;
        size = hdSize;
    }
}