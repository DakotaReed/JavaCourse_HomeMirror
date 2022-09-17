package Lesson01;

import java.util.Locale;
import java.util.stream.IntStream;

public class DataTypesNotPrimitives06 {

    public static void main(String[] args) {

        String BonJovi = "Shot through the heart and you're to blame darling you give love a bad name;";
        String[] array = BonJovi.split(" ");

        for (String value : array) {
            System.out.print(value);
        }
        System.out.println();

//        IntStream.range(0, array.length).forEach(i -> System.out.print(array[i]));
//        System.out.println();

        System.out.println(array.length);

        int x = array.length - 1;
        System.out.println(array[0].toUpperCase(Locale.ROOT) + " " + array[x].toUpperCase());


    }
}
