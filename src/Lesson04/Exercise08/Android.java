package Lesson04.Exercise08;

public class Android extends Mobile {

    double osVersion;
    int price;
    Android(double _osVersion, int _price) {
        osVersion = _osVersion;
        price = _price;
    }

    void callPrint() {
        System.out.println("osVersion is: " + osVersion);
        System.out.println("Price is: " + price);
        Details();
    }

}
