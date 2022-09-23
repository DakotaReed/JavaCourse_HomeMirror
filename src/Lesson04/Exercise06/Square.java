package Lesson04.Exercise06;

public class Square extends Shape {

    double getArea(double x) {
        area = x*x;
        return area;
    }

    double getPerimeter(double x) {
        perimeter = 4*x;
        return perimeter;
    }

}
