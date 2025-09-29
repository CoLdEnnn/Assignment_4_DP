package laptop;

import os.OperatingSystem;

public class GamingLaptop extends Laptop {
    public GamingLaptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.println("Starting Gaming Laptop with " + os.getOS());
    }
}
