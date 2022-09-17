package Lesson01;

import java.util.Locale;

public class DataTypesNotPrimitives01 {

    public static void main(String[] args) {

        String firstName = "Dakota";
        String lastName = "Reed";
        int myAge = 31;

        String newMyAge = Integer.toString(myAge);
        System.out.println(newMyAge);

        //String lastNameAndFirstName = lastName.concat(firstName);
        String lastNameAndFirstName = lastName + " " + firstName;
        System.out.println(lastNameAndFirstName);

        System.out.println(lastNameAndFirstName.toUpperCase(Locale.ROOT));

        System.out.println(lastNameAndFirstName.length());

        System.out.println(newMyAge.equals(lastNameAndFirstName));

    }
}
