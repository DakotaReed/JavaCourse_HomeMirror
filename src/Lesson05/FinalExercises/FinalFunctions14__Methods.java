package Lesson05.FinalExercises;

import Lesson02.Statements11;

public class FinalFunctions14__Methods extends Statements11 {

    String unit = "";
    String tens = "";
    String hundreds = "";
    String h = "Hundred and ";


    String UnitsMethod(char[] array) {

        String[] units = {"Zero ",  "One ", "Two ", "Three ", "Four ", "Fife ", "Six ", "Seven ", "Eight ", "Nine "};
        int genderCode = Character.getNumericValue(array[0]);
        unit = units[genderCode];

        return unit;
    }

    String TensMethod (char[] array) {

        if (array[0] == '1') {
            String[] tensOfOne = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
            int genderCode = Character.getNumericValue(array[1]);
            tens = tensOfOne[genderCode];
        }
        else {
            String[] tensTestString = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            int genderCode = Character.getNumericValue(array[0]);
            tens = tensTestString[genderCode];

            if (array[1] == '0') {}
            else {
                if (array[0] != '1' && array[0] != '0') {
                    tens += "-";}
                else
                    tens += "";
                char x = array[1];
                array[0] = x;
                UnitsMethod(array);}
        }
        return tens;
    }

    String HundredsMethod(char[] array) {

        String[] hundredsStr = {"", "One ", "Two ", "Three ", "Four ", "Fife ", "Six ", "Seven ", "Eight ", "Nine "};
        int genderCode = Character.getNumericValue(array[0]);
        if (array[1] == '0' && array[2] == '0')
            h = "Hundreds";
        else {
            char x = array[1];
            char y = array[2];
            array[0] = x;
            array[1] = y;
            TensMethod(array);
        }

        hundreds = hundredsStr[genderCode] + h;
        return hundreds;
    }

}
