package BasicExercises.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic5 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания универсального метода, который берет два списка одного типа и
        объединяет их в один список. Этот метод чередует элементы каждого списка.
         */

        //Мой вариант

//        List<Integer> num1 = Arrays.asList (1, 3, 5, 7);
//        List <Integer> num2 = Arrays.asList (2, 4, 8, 10);
//        List <String> str1 = Arrays.asList ("Red", "Green", "Blue");
//        List <String> str2 = Arrays.asList ("White", "Black", "Orange", "Pink");
//        System.out.println("Original list elements:");
//        System.out.println("Nums1: " + num1);
//        System.out.println("Nums2: " + num2);
//        System.out.println("Colors1: " + str1);
//        System.out.println("Colors2: " + str2);
//        System.out.println();
//        System.out.println(mergeLists(num1, num2));
//        System.out.println(mergeLists(str1, str2));

        //Вариант 2

//        List < Integer > nums1 = List.of(1, 3, 5, 7);
//        List < Integer > nums2 = List.of(2, 4, 8, 10);
//        System.out.println("List of numbers:");
//        System.out.println(nums1);
//        System.out.println(nums2);
//        List < String > colors1 = List.of("Red", "Green", "Blue");
//        List < String > colors2 = List.of("White", "Black", "Orange", "Pink");
//        System.out.println("\nList of colors:");
//        System.out.println(colors1);
//        System.out.println(colors2);
//        List < Integer > mergedNumbers = mergeLists(nums1, nums2);
//        // Output:[1, 2, 3, 4, 5, 8, 7, 10]
//        System.out.println("\nMerged Numbers: " + mergedNumbers);
//        // Output:[Red, White, Green, Black, Blue, Orange, Pink]
//        List < String > mergedWords = mergeLists(colors1, colors2);
//        System.out.println("Merged Colors: " + mergedWords);
    }

    //Мой вариант
//    public static <T> List mergeLists(List <T> list1, List <T> list2) {
//
//        List <T> mergedList = new ArrayList<>();
//
//        int maxLength = Math.max(list1.size(), list2.size());
//        for (int i = 0; i < maxLength; i++) {
//            if (i < list1.size()) {
//                mergedList.add(list1.get(i));
//            }
//            if (i < list2.size()) {
//                mergedList.add(list2.get(i));
//            }
//        }
//        return mergedList;
//    }

    //Вариант 2
//    public static < T > List < T > mergeLists(List < T > list1, List < T > list2) {
//        List < T > mergedList = new ArrayList < > ();
//
//        int maxLength = Math.max(list1.size(), list2.size());
//        for (int i = 0; i < maxLength; i++) {
//            if (i < list1.size()) {
//                mergedList.add(list1.get(i));
//            }
//
//            if (i < list2.size()) {
//                mergedList.add(list2.get(i));
//            }
//        }
//
//        return mergedList;
//    }
}
