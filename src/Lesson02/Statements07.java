package Lesson02;

public class Statements07 {

    public static void main(String[] args) {

        String[][] table = {{"Moshe", "22", "Jerusalem"},
                            {"Joseph", "45", "London"}};

        //System.out.println(Arrays.deepToString(table).replace("], ", "]\n"));

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j]);}
        }


    }
}
