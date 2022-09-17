package Lesson02;

public class Statements08 {

    public static void main(String[] args) {

        for (int y=0; y<51; y++)
            if (y%2==0)
                System.out.print(y + " ");
        System.out.println();
        System.out.println();


        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0; i< arr.length; i++)
            if (arr[i]%2==0)
                System.out.print(arr[i]+" ");

    }
}
