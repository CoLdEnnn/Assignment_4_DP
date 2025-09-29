import laptop.GamingLaptop;
import laptop.Laptop;
import laptop.OfficeLaptop;
import os.LinuxOS;
import os.WindowsOS;

public class Main {
    public static void main(String[] args) {
        Laptop gamingLaptop = new GamingLaptop(new WindowsOS());
        Laptop officeLaptop = new OfficeLaptop(new LinuxOS());

        gamingLaptop.start();
        officeLaptop.start();
    }
}
