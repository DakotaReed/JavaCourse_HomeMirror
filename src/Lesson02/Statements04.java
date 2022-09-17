package Lesson02;

public class Statements04 {

    public static void main(String[] args) {

     String[] arr = {"Austria", "Germany", "Canada", "Peru", "Israel"};
     for (String value : arr)
         System.out.print(value + " ");
     System.out.println();


     for (String value1 : arr)
         if (value1.equals("Israel"))
             System.out.println(value1);


     if (arr[2].equals("China"))
         System.out.println("Yes, it is there");
     else
         System.out.println("No, sorry...");


     System.out.println(arr[0].length());

    }
}
