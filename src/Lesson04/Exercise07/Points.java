package Lesson04.Exercise07;

public abstract class Points {

    String result;

    abstract String Passing(String startingPoint, String finalDestination, String wayPoint);


    void print() {
        System.out.println("Can be: " + result);
        System.out.println();
    }

}
