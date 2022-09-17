package Lesson01;

import java.util.Arrays;

public class DataTypesNotPrimitives04 {

    public static void main(String[] args) {

//        String[][] table = new String[2][3];
//
//        table[0][0] = "Moshe";
//        table[0][1] = "22";
//        table[0][2] = "Jerusalem";
//        table[1][0] = "Joseph";
//        table[1][1] = "45";
//        table[1][2] = "London";

        String[][] table = {{"Moshe", "22", "Jerusalem"},
                            {"Joseph", "45", "London"}};

        //System.out.println(Arrays.deepToString(table).replace("], ", "]\n"));

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");}

            System.out.println();
        }

        System.out.println(table[0][2]);
    }
}
