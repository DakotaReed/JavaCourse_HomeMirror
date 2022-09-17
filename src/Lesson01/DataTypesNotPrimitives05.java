package Lesson01;

import java.util.Arrays;
import java.util.List;

public class DataTypesNotPrimitives05 {

    public static void main(String[] args) {

        String[] array = {"Java", "is", "a", "general", "purpose", "computer", "programming", "language"};

        //List<Integer> list = Arrays.asList(10, 20, 30, 40);
        //System.out.println(list.get(list.size()-1));

        List<String> list = Arrays.asList(array);
        System.out.println(list.get(list.size()-3));
        System.out.println(list.get(list.size()-2));
        System.out.println(list.get(list.size()-1));

        System.out.println();

//------------------------------------------------------------------------------------

        String str = "Java is a general purpose computer programming language";
        String[] str1 = str.split(" ");

        List<String> list1 = Arrays.asList(str1);
        System.out.println(list1.get(list.size()-3));
        System.out.println(list1.get(list.size()-2));
        System.out.println(list1.get(list.size()-1));


    }

}
