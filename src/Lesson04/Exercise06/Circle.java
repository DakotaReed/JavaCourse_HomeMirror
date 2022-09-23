package Lesson04.Exercise06;

public class Circle extends Shape {

    // x=radius
    double getArea(double x) {
        area = 3.14*x*x;
        return area;
    }

    double getPerimeter(double x) {
        perimeter = 3.14*2*x;
        return perimeter;
    }

}
