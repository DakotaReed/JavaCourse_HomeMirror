package Lesson04.Exercise08;

public class iOS extends Mobile {

    double osVersion;
    int price;

    iOS(double _osVersion, int _price) {
        osVersion = _osVersion;
        price = _price;
    }
    void callPrint() {
        System.out.println("osVersion is: " + osVersion);
        System.out.println("Price is: " + price);
        Details();
    }

}
