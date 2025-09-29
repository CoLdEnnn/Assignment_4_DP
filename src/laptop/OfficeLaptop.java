package laptop;

import os.OperatingSystem;

public class OfficeLaptop extends Laptop {
    public OfficeLaptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.println("\nStarting Office Laptop with " + os.getOS());
    }
}
