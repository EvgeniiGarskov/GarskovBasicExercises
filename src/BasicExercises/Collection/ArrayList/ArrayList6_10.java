package BasicExercises.Collection.ArrayList;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ArrayList6_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для удаления третьего элемента из списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println(array);
//
//        array.remove(2);
//        System.out.println("After removal: " + array);

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        // Print the list
//        System.out.println(list_Strings);
//        // Remove the third element from the list.
//        list_Strings.remove(2);
//        // Print the list again
//        System.out.println("After removing third element from the list:\n"+list_Strings);

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java для поиска элемента в списке массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println(array);
//
//        if (array.contains("Orange")) {
//            System.out.println("There is such an element");
//        } else {
//            System.out.println("There is no such element");
//        }

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        // Search the value Red
//        if (list_Strings.contains("Red")) {
//            System.out.println("Found the element");
//        } else {
//            System.out.println("There is no such element");
//        }

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java для сортировки заданного списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("Before sorting list:" + array);
//        Collections.sort(array);
//        System.out.println("After sorting list:" + array);

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("List before sort: "+list_Strings);
//        Collections.sort(list_Strings);
//        System.out.println("List after sort: "+list_Strings);

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для копирования одного списка массивов в другой.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("Array1" + array);
//
//        ArrayList <String> array2 = new ArrayList <String>();
//        array2.add("1");
//        array2.add("2");
//        array2.add("3");
//        array2.add("4");
//        array2.add("5");
//        System.out.println("Array2" + array2);
//
//        Collections.copy(array2, array);
//        System.out.println("After copying:");
//        System.out.println("Array1" + array);
//        System.out.println("Array2" + array2);

        //Вариант 2

//        List<String> List1 = new ArrayList<String>();
//        List1.add("1");
//        List1.add("2");
//        List1.add("3");
//        List1.add("4");
//        System.out.println("List1: " + List1);
//        List<String> List2 = new ArrayList<String>();
//        List2.add("A");
//        List2.add("B");
//        List2.add("C");
//        List2.add("D");
//        System.out.println("List2: " + List2);
//        // Copy List2 to List1
//        Collections.copy(List1, List2);
//        System.out.println("Copy List to List2,\nAfter copy:");
//        System.out.println("List1: " + List1);
//        System.out.println("List2: " + List2);

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java для перемешивания элементов в списке массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("Original List: " + array);
//
//        Collections.shuffle(array);
//        System.out.println("Shuffled List: " + array);

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("List before shuffling:\n" + list_Strings);
//        Collections.shuffle(list_Strings);
//        System.out.println("List after shuffling:\n" + list_Strings);
    }
}
