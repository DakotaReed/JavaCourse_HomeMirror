package Lesson03;

public class Demo {

    void handleNumbers(int[] array) {

        int minValue = array[0];
        int maxValue = array[0];
        int average = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }

            if (array[i] > maxValue) {
                maxValue = array[i];
            }

            average += array[i];
        }

            String n = "Minimal value is: " + minValue + ". Maximal value is: " + maxValue + ". Average is: " + average + ".";
        System.out.println(n);

        }

}

        //int maxValue = array[0];
//        for (int x = 1; x < array.length; x++) {
//        if (array[x] > maxValue) {
//                maxValue = array[x];
//            }
//        }
//        return maxValue;






//    int getMin(int[] ){
//
//        int minValue = inputArray[0];
//        for(int i=1;i<inputArray.length;i++){
//            if(inputArray[i] < minValue){
//                minValue = inputArray[i];
//            }
//        }
//        return minValue;
//
//        int getMax(int[] inputArray){
//            int maxValue = inputArray[0];
//            for(int i=1;i < inputArray.length;i++){
//                if(inputArray[i] > maxValue){
//                    maxValue = inputArray[i];
//                }
//            }
//            return maxValue;
//        }
