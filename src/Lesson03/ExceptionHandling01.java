package Lesson03;

public class ExceptionHandling01 {

    public static void main(String[] args) {

        int[] arr = {1,2};
        try {
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Pounds");
        }

    }

}
