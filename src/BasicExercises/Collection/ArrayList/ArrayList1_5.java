package BasicExercises.Collection.ArrayList;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1_5 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java, чтобы создать список массивов, добавить несколько цветов (строк) и распечатать коллекцию.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println(array);

        //Вариант 2

//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println(list_Strings);

        System.out.println("Exercise 2");

        /*
        Напишите программу Java для перебора всех элементов в списке массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        // System.out.println(array);
//
//        //Вар.1
//        // for (int i = 0; i < array.size(); i++) {
//        //   System.out.print(array.get(i) + "; ");
//        // }
//
//        //Вар.2
//        for (String s : array) {
//            System.out.print(s + "; ");
//        }

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        // Print the list
//        for (String element : list_Strings) {
//            System.out.println(element);
//        }

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы вставить элемент в список массивов в первую позицию.
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
//        array.add(0, "Pink");
//        System.out.println(array);

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
//        // Now insert a color at the first and last position of the list
//        list_Strings.add(0, "Pink");
//        list_Strings.add(5, "Yellow");
//        // Print the list
//        System.out.println(list_Strings);

        System.out.println("Exercise 4");

        /*
        Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println(array);
//        System.out.println("The third element: " + array.get(2));

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
//        // Retrive the first and third element
//        String element = list_Strings.get(0);
//        System.out.println("First element: "+element);
//        element = list_Strings.get(2);
//        System.out.println("Third element: "+element);

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java для обновления элемента массива заданным элементом.
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
//        array.set(2, "Pink");
//        System.out.println(array);

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
//        // Update the third element with "Yellow"
//        list_Strings.set(2, "Yellow");
//        // Print the list again
//        System.out.println(list_Strings);
    }
}
