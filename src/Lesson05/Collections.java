package Lesson05;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        List<String> countriesON = new ArrayList<String>();
        countriesON.add("Russia");
        countriesON.add("Israel");

        for (String value : countriesON) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println(countriesON.size() + "\n");

        countriesON.set(0, "England");
        for (String value : countriesON) {
            System.out.println(value);
        }
        System.out.println();

        if (countriesON.contains("Germany"))
            System.out.println(countriesON.indexOf("Germany") + "\n");
        else
            System.out.println("NO" + "\n");

        System.out.println(countriesON.get(countriesON.size()-1) + "\n");


        List<String> countriesOFF = new ArrayList<String>();
        countriesOFF.add("England");
        countriesOFF.add("Japan");

        countriesON.addAll(countriesOFF);
        for (String value : countriesON) {
            System.out.println(value);
        }


        //England *2 -> Can't use Set

    }
}
