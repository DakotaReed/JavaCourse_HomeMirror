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
    void endOutPut () {
        String endOutPut = ".......¸.ʕ•̫͡•ॽु\uD83E\uDDE0\uD83C\uDF81\uD83C\uDF80.*✲ﾟ｡⋆º°`°๑⁂*⁎\uD83C\uDD83\uD83C\uDD77\uD83C\uDD70\uD83C\uDD7D\uD83C\uDD7A \uD83C\uDD88\uD83C\uDD7E\uD83C\uDD84 \uD83C\uDD82\uD83C\uDD7E \uD83C\uDD7C\uD83C\uDD84\uD83C\uDD72\uD83C\uDD77⁎*⁂๑°`°º⋆｡ﾟ✲*.\uD83C\uDF80\uD83C\uDF81\uD83E\uDDE0ʕ•̫͡•ॽु";
        System.out.println(endOutPut);
        System.out.println(".....*ﾟ:*:✼✿ ♡ ✿✼:*ﾟ:.｡..｡.:*･ﾟ\n" +
                "...•.¸.•.¸.•´\n" +
                "....¸.•´\n" +
                "..¸. \n" +
                "☻/\n" +
                "/▌\n" +
                "/ \\ \n");
    }

}
