package Lesson05.FinalExercises;

import java.util.Arrays;

public class FinalMain extends FinalFunctions {
    public static void main(String[] args) {

        FinalFunctions finalExercise = new FinalFunctions();
        int[] arr = {1,20,3,40,5,60,7,80,9,100};
        String[] arr1 = {"3","/","2"};
        //double[] arr2 = {2,4,6,8,10,1,3,5,7,9};
        double[] arr2 = Arrays.stream(arr).asDoubleStream().toArray();
        String wordsOfSong = "Et Maintenant Nous Sommes Tout Seuls";
        String[][] letters = {{"ABC"},
                              {"AAAAA"},
                              {"BBB"},
                              {"kjhdsfkjo"},
                              {"JDSDFHKJH"},
                              {"FGH"},
                              {"LXCVKJ"},
                              {"XLCKVJL"},
                              {"VCKJLK"},
                              {"VLK;LK"},
                              {"VLKL"}};
        String[][] gradeAndStudent = {{"85","76","45","91","82"},
                                      {"David", "Moshe", "Ilana", "Shlomo", "Hanna"}};
        int[] arr3 = {1,20,3,40,5,60,7,80,9,100,-1,-20,-3,-40,-5,-60,-7,-80,-9,-100};

        finalExercise.reverseFullNumber(1234500);
        finalExercise.reverseFullNumberDouble(1230.458);
        finalExercise.betweenOneAndTen(arr);
        finalExercise.average(arr);
        finalExercise.calculator(arr1);
        finalExercise.DividesIntoFour(arr);
        finalExercise.medianOfArray(arr2);
        finalExercise.wordsOfSongRandom(wordsOfSong);
        finalExercise.longestElement(letters);
        finalExercise.searchingWord(letters, "VCKJLK");
        finalExercise.bestStudent(gradeAndStudent);
        finalExercise.almostTheBiggestNumber(arr3);
        finalExercise.equalArrays(arr,arr3);
        finalExercise.primeNumbers(arr13);

        finalExercise.numberInWords(654);
        System.out.println();
        System.out.println();

        finalExercise.endOutPut();
    }
}