package BasicExercises.Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Generic6 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания универсального метода, который принимает список любого типа и предикат.
        Он возвращает список массивов, содержащий только те элементы, которые удовлетворяют предикату.
         */

//        List< Integer > numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
//        System.out.println("Original list of numbers: " + numbers);
//        // Filter even numbers
//        List < Integer > evenNumbers = filterList(numbers, n -> n % 2 == 0);
//        System.out.println("Even numbers: " + evenNumbers);
//
//        // Filter odd numbers
//        List < Integer > oddNumbers = filterList(numbers, n -> n % 2 != 0);
//        System.out.println("Odd numbers: " + oddNumbers);
//
//        List < String > colors = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
//        System.out.println("\nOriginal list of Colors: " + colors);
//        // Filter colors starting with 'O'
//        List < String > wordsStartingWithO = filterList(colors, color -> color.startsWith("O"));
//        System.out.println("Colors starting with 'O': " + wordsStartingWithO);
//
//        // Filter colors with length greater than 4
//        List < String > wordsLengthGreaterThan4 = filterList(colors, color -> color.length() > 4);
//        System.out.println("Colors with length greater than 4: " + wordsLengthGreaterThan4);
    }

//    public static < T > List < T > filterList(List < T > originalList, Predicate< T > predicate) {
//        List < T > filteredList = new ArrayList< >();
//
//        for (T element: originalList) {
//            if (predicate.test(element)) {
//                filteredList.add(element);
//            }
//        }
//
//        return filteredList;
//    }
}
