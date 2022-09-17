package Lesson01;

import java.util.Arrays;
import java.util.Locale;

public class DataTypesNotPrimitives03 {

    public static void main(String[] args) {

        String[] array = {"Dakota", "Andrey", "Dana", "Sam", "Koshack", "Masya", "Elis", "Sid"};

        //System.out.println(array[0].toUpperCase() + " " + array[1].toUpperCase() + " " + array[2].toUpperCase() + " " + array[3].toUpperCase() + " " + array[4].toUpperCase() + " " + array[5].toUpperCase() + " " + array[6].toUpperCase() + " " + array[7].toUpperCase());

        for (int i = 0; i < array.length; i++) {

                {System.out.print(array[i].toUpperCase() + " ");}
        }
        System.out.println();

        System.out.println(array[0].length());

        System.out.println(array[2].concat(array[3]));

        System.out.println(array[2] + " " + array[3]);

//        System.out.println(array[0].charAt(0));
//        System.out.println(array[1].charAt(0));
//        System.out.println(array[2].charAt(0));
//        System.out.println(array[3].charAt(0));
//        System.out.println(array[4].charAt(0));
//        System.out.println(array[5].charAt(0));
//        System.out.println(array[6].charAt(0));
//        System.out.println(array[7].charAt(0));

        for (int i = 0; i < array.length; i++) {

            //{System.out.print(array[i].charAt(0) + " \n");}
            {System.out.println(array[i].charAt(0));}
        }

    }

}
