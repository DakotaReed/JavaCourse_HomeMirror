package Lesson04.Exercise07;

public abstract class Points {

    String result;
//    String startingPoint = "Bursa, Ramat Gan";
    String startPoint;
    String finalDestination;
    String waypoint;

    abstract String Passing(String startingPoint, String finalDestination, String wayPoint);

    void print() {
        System.out.println("The way can be: " + result);
    }

}
