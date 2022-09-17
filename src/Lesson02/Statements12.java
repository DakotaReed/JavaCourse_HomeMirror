package Lesson02;

import java.util.ArrayList;
import java.util.List;

public class Statements12 {

    public static void main(String[] args) {
// 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 ,43, 47 , 53 , 59 , 61, 67 , 71 ,73, 79, 83 , 89 , 97, 101

        int x = -13;
        if (x<0)
            x = -x;

        List<String> list = new ArrayList<>();
        for (int i=2; i<x; i++) {
            if (x%i == 0)
                break;
             else
                list.add("one");
             continue;
        }
        int size = list.size();
        if (size == x-2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}


