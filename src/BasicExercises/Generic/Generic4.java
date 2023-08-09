package BasicExercises.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generic4 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания универсального метода, который принимает список любого типа и
        возвращает его как новый список с элементами в обратном порядке.
         */

        //Мой вариант

//        List<Integer> num1 = Arrays.asList (1, 2, 3, 4, 5);
//        List <String> str1 = Arrays.asList ("Red", "Green", "Blue", "Orange", "White");
//        System.out.println("Original list elements:");
//        System.out.println("Nums: " + num1);
//        System.out.println("Colors: " + str1);
//        System.out.println();
//        // findIndexOfElement(num1, num);
//        reverseArr(num1);
//        reverseArr(str1);
//        System.out.println("List of numbers in reverse order: " + num1);
//        System.out.println("List of colors in reverse order: " + str1);

        //Вариант 2

//        List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6);
//        List < String > colors = List.of("Red", "Green", "Orange");
//
//        List < Integer > reversedNumbers = reverseList(numbers);
//        System.out.println("Original list of numbers: " + numbers);
//        System.out.println("Reversed numbers: " + reversedNumbers); // Output: [6, 5, 4, 3, 2, 1]
//
//        List < String > reversedWords = reverseList(colors);
//        System.out.println("\nOriginal list of colors: " + colors);
//        System.out.println("Reversed colors: " + reversedWords); // Output: [Orange, Green, Red]
    }

    //Мой вариант
//    public static <T > void reverseArr(List <T> list) {
//
//        Collections.reverse(list);
//    }

    //Вариант 2
//    public static < T > List < T > reverseList(List < T > originalList) {
//        List < T > reversedList = new ArrayList< >();
//
//        for (int i = originalList.size() - 1; i >= 0; i--) {
//            reversedList.add(originalList.get(i));
//        }
//
//        return reversedList;
//    }
}
