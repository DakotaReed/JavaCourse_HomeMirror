package Lesson02;

public class Statements10 {

    public static void main(String[] args) {

        char[] arr = {'o', 'l', 'l', 'e', 'H'};

        for (int i = arr.length - 1; i >= 0 ; i--) {
            do {
                System.out.print(arr[i]);
                i--;
            }
            while (i >=0);


        }
    }
}
