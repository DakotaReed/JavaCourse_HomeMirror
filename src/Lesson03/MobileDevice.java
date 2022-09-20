package Lesson03;

public class MobileDevice {

    String  model;
    char os;
    double version;
    boolean hasFlash;
    int price;
    int screenWidth;
    int screenHeight;


    void printParameters() {
        System.out.println("Model is: "+model+". Operation System is: "+os+". Version is: "+version+". If has flash? "+hasFlash+". Price is: "+price);
    }

    double calculateArea() {
        return screenWidth*screenHeight;
    }

    void pictureQuality() {
        if (hasFlash)
            System.out.println("Good Quality");
        else
            System.out.println("Bad Quality");
    }

}
