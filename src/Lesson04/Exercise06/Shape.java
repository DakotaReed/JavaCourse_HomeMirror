package Lesson04.Exercise06;

public abstract class Shape {

    double area;
    double perimeter;

    abstract double getArea(double x);
    abstract double getPerimeter(double x);

    void print() {
        System.out.println("Area is: " + area + "  Perimeter is: " + perimeter);}


}
