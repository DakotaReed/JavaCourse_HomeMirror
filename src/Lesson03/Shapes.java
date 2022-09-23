package Lesson03;

public class Shapes {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.width = 2;
        rec.height = 3;
        rec.area();

        Triangle tri = new Triangle();
        tri.width = 4;
        tri.height = 5;
        tri.area();

        Circle cir = new Circle();
        cir.pi = 3.14;
        cir.radius = 8;
        cir.area();


    }
}
