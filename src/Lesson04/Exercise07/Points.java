package Lesson04.Exercise07;

public abstract class Points {

    String result;
    String _startingPoint;
    String _finalDestination;

    abstract String Passing(String startingPoint, String finalDestination, String wayPoint);


    void print() {
        System.out.println("Can be: " + result);
        System.out.println();
    }

}
