package Lesson04.Exercise07;

public class ThroughLod extends Points{

    String Passing(String startingPoint, String finalDestination, String wayPoint) {
        if (startingPoint == "Bursa, Ramat Gan" && finalDestination == "Eilat" && (wayPoint == "Lod" || wayPoint == null)) {
            System.out.println("The way from: " + startingPoint + " ... To: " + finalDestination);
            result = "highway 20, highway 1, highway 6, highway 1, highway 90";
        }
        else
            System.out.println("Wrong Way");

        return result;

    }
}
