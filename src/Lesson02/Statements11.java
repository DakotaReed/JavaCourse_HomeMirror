package Lesson02;

public class Statements11 {

    public static void main(String[] args) {

        int[] arr0 = {15,2,36,20,7};
        if (arr0[0]>arr0[1]) {
            if (arr0[0]>arr0[2])
                System.out.println(arr0[0]);
            else
                System.out.println(arr0[2]);
        }

        else {
            if (arr0[1]>arr0[2])
                System.out.println(arr0[1]);
            else System.out.println(arr0[2]);
        }


//------------------------------------------------------------------------------------


        int[] arr = {15,2,36,20,7};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);

//------------------------------------------------------------------------------------

        int[] arr1 = {15,2,36,20,7};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);

    }
}
