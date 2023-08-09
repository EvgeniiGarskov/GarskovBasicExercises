package BasicExercises.Generic;

import java.util.Arrays;
import java.util.List;

public class Generic2 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания универсального метода, который принимает список чисел и возвращает
        сумму всех четных и нечетных чисел.
         */

        //Мой вариант

//        Integer[] num1 = {1, 2, 3, 4, 5};
//
//        System.out.println("Original arrays:");
//        System.out.println("num1: " + Arrays.toString(num1));
//        evenAndOdd(num1);

        //Вариант 2

//        List< Integer > integers = List.of(1, 2, 3, 4, 5, 6, 7);
//        List < Double > doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
//
//        calculateNumberSum(integers);
//        calculateNumberSum(doubles);
    }

    //Мой вариант
//    public static <T extends Number> void evenAndOdd(T[] arr) {
//
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        for (T num : arr) {
//            if (num.doubleValue()%2 == 0) {
//                sumEven += num.doubleValue();
//            } else {
//                sumOdd += num.doubleValue();
//            }
//        }
//        System.out.println("Sum of even elements: " + sumEven);
//        System.out.println("Sum of odd elements: " + sumOdd);
//    }

    //Вариант 2
//    public static < T extends Number > void calculateNumberSum(List < T > numbers) {
//        double evenSum = 0;
//        double oddSum = 0;
//
//        for (T number: numbers) {
//            if (number.doubleValue() % 2 == 0) {
//                evenSum += number.doubleValue();
//            } else {
//                oddSum += number.doubleValue();
//            }
//        }
//        System.out.println("\nOriginal list of numbers: " + numbers);
//        System.out.println("Sum of even numbers: " + evenSum);
//        System.out.println("Sum of odd numbers: " + oddSum);
//    }
}
