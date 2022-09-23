package Lesson04;

public class MainProgram extends MobileDevice {
    public static void main(String[] args) {

        MobileDevice dev1 = new MobileDevice();
        dev1.model = "Pixel";
        dev1.os = 'A';
        dev1.version = 6.0; //not sure
        dev1.hasFlash = true;
        dev1.price = 2500;
        dev1.calculateArea(2,3);

        dev1.printParameters();
        dev1.pictureQuality();
        System.out.println();



        MobileDevice dev2 = new MobileDevice();
        dev2.model = "Galaxy";
        dev2.os = 'A';
        dev2.version = 8.0; //not sure
        dev2.hasFlash = false;
        dev2.price = 1500;
        dev2.calculateArea(4,5);

        dev2.printParameters();
        dev2.pictureQuality();

    }


}
