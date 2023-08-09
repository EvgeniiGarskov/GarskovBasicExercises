package BasicExercises.Generic;

import java.util.Arrays;

public class Generic1 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания универсального метода, который берет два массива одного типа и
        проверяет, имеют ли они одинаковые элементы в одном и том же порядке.
         */

        //Мой вариант

//        Integer[] num1 = {1, 2, 3, 4, 5};
//        Integer[] num2 = {1, 2, 3, 4, 5};
//        Integer[] num3 = {1, 2, 3, 4, 4};
//        Integer[] num4 = {1, 2, 3, 4, 5, 6};
//        String[] str1 = {"LG", "Acer", "Panasonic"};
//        String[] str2 = {"LG", "Acer", "Panasonic"};
//        String[] str3 = {"LG", "Acer"};
//
//        System.out.println("Original arrays:");
//        System.out.println("num1: " + Arrays.toString(num1));
//        System.out.println("num2: " + Arrays.toString(num2));
//        System.out.println("num3: " + Arrays.toString(num3));
//        System.out.println("num4: " + Arrays.toString(num4));
//        System.out.println("str1: " + Arrays.toString(str1));
//        System.out.println("str2: " + Arrays.toString(str2));
//        System.out.println("str3: " + Arrays.toString(str3));
//
//        System.out.println("is num1 equals to num2 : " + arrEquals(num1, num2));
//        System.out.println("is num1 equals to num3 : " + arrEquals(num1, num3));
//        System.out.println("is num1 equals to num4 : " + arrEquals(num1, num4));
//        System.out.println("is str1 equals to str2 : " + arrEquals(str1, str2));
//        System.out.println("is str1 equals to str3 : " + arrEquals(str1, str3));

        //Вариант 2

//        Integer[] arr1 = {
//                1,
//                2,
//                3,
//                4
//        };
//        Integer[] arr2 = {
//                1,
//                2,
//                4,
//                4
//        };
//        Integer[] arr3 = {
//                1,
//                2,
//                3,
//                4
//        };
//        String[] arr4 = {
//                "Java",
//                "World"
//        };
//        String[] arr5 = {
//                "JavaScript",
//                "World"
//        };
//        String[] arr6 = {
//                "Java",
//                "World"
//        };
//        System.out.println("Original arrays:");
//        System.out.println("arr1: " + Arrays.toString(arr1));
//        System.out.println("arr2: " + Arrays.toString(arr2));
//        System.out.println("arr3: " + Arrays.toString(arr3));
//        System.out.println("arr4: " + Arrays.toString(arr4));
//        System.out.println("arr5: " + Arrays.toString(arr5));
//        System.out.println("arr6: " + Arrays.toString(arr6));
//        System.out.println("\nCompare arr1 and arr2: " + compare_Arrays(arr1, arr2)); //false
//        System.out.println("Compare arr1 and arr3: " + compare_Arrays(arr1, arr3)); //true
//        System.out.println("Compare arr4 and arr5: " + compare_Arrays(arr4, arr5)); //false
//        System.out.println("Compare arr4 and arr6: " + compare_Arrays(arr4, arr6)); //true
    }

    //Мой вариант
//    public static <T> boolean arrEquals(T[] arr1, T[] arr2) {
//        return Arrays.equals(arr1, arr2);
//    }

    //Вариант 2
//    public static < T > boolean compare_Arrays(T[] array1, T[] array2) {
//        if (array1.length != array2.length) {
//            return false;
//        }
//
//        for (int i = 0; i < array1.length; i++) {
//            if (!array1[i].equals(array2[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
}
