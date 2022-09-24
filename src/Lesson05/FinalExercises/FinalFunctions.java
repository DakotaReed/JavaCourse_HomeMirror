package Lesson05.FinalExercises;

import java.util.*;

public class FinalFunctions {
//------------------------------------------01------------------------------------------

    String allChars = "";

    void reverseFullNumber(int x) {
        System.out.println("--------------01--------------");

        String num = Integer.toString(x);
        char[] arrayNum = num.toCharArray();
        for (int i = arrayNum.length - 1; i >= 0; i--) {
            allChars += Character.toString(arrayNum[i]);
        }
        System.out.println(allChars);
    }

    //result = Integer.parseInt(allChars);
    //return result;
//------------------------------------------02------------------------------------------

    void reverseFullNumberDouble(double y) {
        System.out.println();
        System.out.println("--------------02--------------");

        String[] arr = String.valueOf(y).split("\\.");
        int[] arrayAfterPoint = new int[2];
        arrayAfterPoint[0] = Integer.parseInt(arr[0]); // 1
        arrayAfterPoint[1] = Integer.parseInt(arr[1]); // 9
        System.out.println(arrayAfterPoint[1] + "." + arrayAfterPoint[0]);
    }

//
//        String afterPoint = y + "";
//        System.out.println(afterPoint);
//        String[] arrayAfterPoint = afterPoint.split("\\.");
//        System.out.println(arrayAfterPoint[1] + "." + arrayAfterPoint[0]);
//------------------------------------------03------------------------------------------

        void betweenOneAndTen(int[] a) {
            System.out.println();
            System.out.println("--------------03--------------");

            for (int i = 0; i < a.length; i++)
                if (a[i] >= 1 && a[i] <= 10)
                    System.out.print(a[i] * a[i] + " ");
            System.out.println();
    }
//------------------------------------------04------------------------------------------

    double ave = 0;
    double sum = 0;

    void average(int[] b) {
        System.out.println();
        System.out.println("--------------04--------------");

        for (int i = 0; i < b.length; i++)
            sum += b[i];
        System.out.println(ave = sum/b.length);
    }
//------------------------------------------05------------------------------------------

    void calculator(String[] c) {
        System.out.println();
        System.out.println("--------------05--------------");

        double firstNumber = Double.parseDouble(c[0]);
        double secondNumber = Double.parseDouble(c[2]);

        if (c.length > 3) {
            System.out.println("Wrong Input");
        } else {
            if (c[1] == "+")
                System.out.println(firstNumber + secondNumber);
            if (c[1] == "-")
                System.out.println(firstNumber - secondNumber);
            if (c[1] == "*")
                System.out.println(firstNumber * secondNumber);
            if (c[1] == "/")
                System.out.println(firstNumber / secondNumber);
        }
    }
//------------------------------------------06------------------------------------------

        int m;
        void DividesIntoFour(int[] d) {
            System.out.println();
            System.out.println("--------------06--------------");

            List dividesIntoFour = new ArrayList<>();
            for (int i=0; i<d.length; i++) {
                m = d[i]%4;
                if (m==0)
                    dividesIntoFour.add(d[i]);
            }
            String list = Arrays.toString(dividesIntoFour.toArray()).replace("[", "").replace("]", "");
            System.out.println(list);
        }
//------------------------------------------07------------------------------------------

    void medianOfArray(double[] e) {
        System.out.println();
        System.out.println("--------------07--------------");

        double median;
        int len = e.length;

        Arrays.sort(e);

        if(len%2 != 0)
            median = e[len/2];
        else
            median = (e[(len - 1)/2] + e[len/2])/2;
        System.out.println(median);
    }
//------------------------------------------08------------------------------------------

    void wordsOfSongRandom (String words) {
        System.out.println();
        System.out.println("--------------08--------------");

        String[] array = words.split(" ");
        List<String> listOfWords = Arrays.asList(array);
        Collections.shuffle(listOfWords);
        String list = Arrays.toString(listOfWords.toArray()).replace("[", "").replace("]", "");
        System.out.println(list);
    }
//        for (int i=0; i<array.length; i++) {
//            i = new Random().nextInt(array.length);
//            System.out.print(array[i] + " ");}
//------------------------------------------09------------------------------------------

     void longestElement (String[][] array) {
         System.out.println();
         System.out.println("--------------09--------------");

         int elementLength = array[0][0].length();
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 if(array[i][j].length() > elementLength)
                     elementLength = array[i][j].length();
             }
         }
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 if (array[i][j].length() == elementLength)
                     System.out.println(array[i][j]);
             }
         }
         System.out.println();
        }
    int indexI = 0;
    int indexJ = 0;
    void searchingWord (String[][] array, String word) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals(word)) {
                    indexI = i;
                    indexJ = j;
                    System.out.println("Searching Word is here: Array[" + indexI + "][" + indexJ + "]");
                }
            }
        }
    }
//------------------------------------------10------------------------------------------

    void bestStudent (String[][] array) {
        System.out.println();
        System.out.println("--------------10--------------");

        int indexJ = 0;
        int bestGrade = 0;
        for (int j = 0; j < array[0].length; j++) {
            int grade = Integer.parseInt(array[0][j]);
            if (grade > bestGrade) {
                indexJ = j;
                bestGrade = grade;
            }
        }
        System.out.println("Best Grande is: " + bestGrade + ". Best Student is: " + array[1][indexJ]);
    }
//------------------------------------------11------------------------------------------

    void almostTheBiggestNumber (int[] array) {
        System.out.println();
        System.out.println("--------------11--------------");

        int max = array[0];
        int previous = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                previous = max;
                max = array[i];
            }
            else if (array[i] > previous)
                previous = array[i];
        }
        //System.out.println("Biggest: "+ max);
        System.out.println("Second Biggest Number is: "+ previous);
    }
//------------------------------------------12------------------------------------------

    void equalArrays (int[] array, int[] array1) {
        System.out.println();
        System.out.println("--------------12--------------");

        if (Arrays.equals(array, array1)) {

            System.out.println("true");
        }
        else
            System.out.println("false");

    }
//------------------------------------------13------------------------------------------

    void primeNumbers (int[] array) {
        System.out.println();
        System.out.println("--------------13--------------");

        for (int i=0; i<array.length; i++) {
            int x = array[i];
            if (x<0)
                x = -x;

            List<String> list = new ArrayList<>();
            for (int i0=2; i0<x; i0++) {
                if (x % i0 == 0)
                    break;
                else {
                    list.add("one");
                }
                continue;
            }
            int size = list.size();
            if (size == x-2) {
                System.out.println("Prime Number is: " + x);
            }
        }
    }

}






