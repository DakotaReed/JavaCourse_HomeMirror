package Lesson04.Exercise07;

public class ThroughAfula extends Points{

    String Passing(String startingPoint, String finalDestination, String wayPoint) {
        if (startingPoint == "Bursa, Ramat Gan" && finalDestination == "Eilat" && (wayPoint == "Afula" || wayPoint == null)) {
            System.out.println("The way from: " + startingPoint + " ... To: " + finalDestination);
            result = "highway 2, highway 65, highway 75, highway 6, highway 40, highway 25, highway 90";
        }
        else
            System.out.println("Wrong Way");

        return result;

    }
}
