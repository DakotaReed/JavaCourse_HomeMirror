package Lesson04.Exercise07;

public class ThroughBatYam extends Points{

    String Passing(String startingPoint, String finalDestination, String wayPoint) {
        if (startingPoint == "Bursa, Ramat Gan" && finalDestination == "Eilat" && (wayPoint == "Bat Yam" || wayPoint == null))
            result = "highway 20, highway 4, highway, highway 7, highway 40, highway 25, highway 90";
        else
            System.out.println("Wrong Way");

            return result;
    }
}
