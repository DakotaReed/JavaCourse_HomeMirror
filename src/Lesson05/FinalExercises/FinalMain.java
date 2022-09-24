package Lesson05.FinalExercises;

import java.util.Arrays;

public class FinalMain extends FinalFunctions {
    public static void main(String[] args) {

        FinalFunctions finalExercise = new FinalFunctions();
        int[] arr = {1,20,3,40,5,60,7,80,9,100};
        String[] arr1 = {"3","/","2"};
        //double[] arr2 = {2,4,6,8,10,1,3,5,7,9};
        double[] arr2 = Arrays.stream(arr).asDoubleStream().toArray();

        finalExercise.reverseFullNumber(1234500);
        finalExercise.reverseFullNumberDouble(1230.458);
        finalExercise.betweenOneAndTen(arr);
        finalExercise.average(arr);
        finalExercise.calculator(arr1);
        finalExercise.DividesIntoFour(arr);
        finalExercise.medianOfArray(arr2);
    }
}
