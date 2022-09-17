package Lesson01;

public class DataTypesNotPrimitives02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6};
//        int[] array = new int[5];
//        array[0] = 10;
//        array[1] = 9;
//        array[2] = 8;
//        array[3] = 7;
//        array[4] = 6;

        System.out.println(array[0] + " " + array[3]);

        System.out.println(array[0]+array[1]);

        String strNum0 = Integer.toString(array[0]);
        String strNum1 = Integer.toString(array[1]);

        System.out.println(strNum0+strNum1);


    }
}
