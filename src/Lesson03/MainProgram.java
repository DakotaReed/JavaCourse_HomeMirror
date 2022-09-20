package Lesson03;

public class MainProgram {
    public static void main(String[] args) {

        MobileDevice dev1 = new MobileDevice();
        dev1.model = "Pixel";
        dev1.os = 'A';
        dev1.version = 6.0; //not sure
        dev1.hasFlash = true;
        dev1.price = 2500;
        dev1.screenWidth = 9;
        dev1.screenHeight = 10;

        dev1.printParameters();
        System.out.println(dev1.calculateArea());
        dev1.pictureQuality();
        System.out.println();



        MobileDevice dev2 = new MobileDevice();
        dev2.model = "Galaxy";
        dev2.os = 'A';
        dev2.version = 8.0; //not sure
        dev2.hasFlash = false;
        dev2.price = 1500;
        dev2.screenWidth = 5;
        dev2.screenHeight = 8;

        dev2.printParameters();
        System.out.println(dev2.calculateArea());
        dev2.pictureQuality();

    }
}
