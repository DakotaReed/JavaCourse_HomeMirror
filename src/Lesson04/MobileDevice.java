package Lesson04;

public class MobileDevice {
//Features Attributes
    String  model;
    char os;
    double version;
    boolean hasFlash;
    int price;

//Methods Actions
    void printParameters() {
        System.out.println("Model is: "+model+". Operation System is: "+os+". Version is: "+version+". If has flash? "+hasFlash+". Price is: "+price);
    }

    void calculateArea(int screenWidth, int screenHeight) {
        if (screenWidth > 0 && screenHeight > 0)
        System.out.println("Area is: " + screenHeight*screenWidth);
        else
            System.out.println("Wrong inter");

    }

    void pictureQuality() {
        if (hasFlash)
            System.out.println("Good Quality");
        else
            System.out.println("Bad Quality");
    }

}
