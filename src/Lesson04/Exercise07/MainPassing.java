package Lesson04.Exercise07;

public class MainPassing {
    public static void main(String[] args) {

        ThroughBatYam way1 = new ThroughBatYam();
        way1.Passing("Bursa, Ramat Gan", "Eilat", "Bat Yam");
        way1.print();

        ThroughAfula way2 = new ThroughAfula();
        way2.Passing("Bursa, Ramat Gan", "Eilat", "Afula");
        way2.print();

        ThroughLod way3 = new ThroughLod();
        way3.Passing("Bursa, Ramat Gan", "Eilat", null);
        way3.print();

        ThroughLod way4 = new ThroughLod();
        way4.Passing("Bursa, Ramat Gan", "Tel Aviv", "Lod");
        way4.print();
    }
}
