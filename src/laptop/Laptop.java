package laptop;

import os.OperatingSystem;

public abstract class Laptop {
    protected OperatingSystem os;

    public Laptop(OperatingSystem os) {
        this.os = os;
    }

    public abstract void start();
}
