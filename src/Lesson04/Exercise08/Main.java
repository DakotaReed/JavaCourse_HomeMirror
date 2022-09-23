package Lesson04.Exercise08;

public class Main {
    public static void main(String[] args) {

//        Client client = new Client();
//        client.timeStamp = "24/09/22 00:04:28";

        Chrome chrome = new Chrome();
        chrome.version = 105.0;
        chrome.callPrint();
        System.out.println();

        IE ie = new IE();
        ie.version = 78.0;
        ie.callPrint();
        System.out.println();

        Desktop desktop = new Desktop();
        desktop.Details();
        System.out.println();

        Android android = new Android();
        android.osVersion = 17.0;
        android.price = 3000;
        android.callPrint();
        System.out.println();

        iOS ios = new iOS();
        ios.osVersion = 15.0;
        ios.price = 3500;
        ios.callPrint();

    }

}
