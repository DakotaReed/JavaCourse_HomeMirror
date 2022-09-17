package Lesson02;

public class Statements06 {

    public static void main(String[] args) {

//      String[] arr = {"Teacher", "Bank Teller", "QA", "Average Salary"};
//      for (String str : arr)

        String str = "Teacher";
            switch (str) {

            case "Teacher":
                System.out.println(5000);
                break;

            case "Bank Teller":
                System.out.println("10000");
                break;

            case "QA":
                System.out.println("15000");
                break;

            case "Average Salary":
                System.out.println("9100");
                    break;

//            default:
//                System.out.println("Don't known");
        }
    }
}
