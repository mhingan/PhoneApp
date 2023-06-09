package org.ssit.gr17.Phone;

public class SamsungGalaxyS6 extends Samsung{
    private final long IMEI = 6744256923524965627L;


    public SamsungGalaxyS6(int batteryLife, String color, String material) {
        super(batteryLife, color, material);
    }


    @Override
    public String toString() {
        return "SamsungGalaxyS6{" +
                "IMEI=" + IMEI +
                '}';
    }
}
