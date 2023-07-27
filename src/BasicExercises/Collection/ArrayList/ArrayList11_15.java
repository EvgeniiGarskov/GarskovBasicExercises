package BasicExercises.Collection.ArrayList;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ArrayList11_15 {

    public static void main(String[] args) {

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java, чтобы поменять местами элементы в списке массивов.
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
//        Collections.reverse(array);
//        System.out.println("Reverse List: " + array);

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("List before reversing :\n" + list_Strings);
//        Collections.reverse(list_Strings);
//        System.out.println("List after reversing :\n" + list_Strings);

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java для извлечения части списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("Original array: " + array);
//
//        List <String> array2 = array.subList(0, 3);
//        System.out.println("Sublist of array: " + array2);

        //Вариант 2

//        // Creae a list and add some colors to the list
//        List<String> list_Strings = new ArrayList<String>();
//        list_Strings.add("Red");
//        list_Strings.add("Green");
//        list_Strings.add("Orange");
//        list_Strings.add("White");
//        list_Strings.add("Black");
//        System.out.println("Original list: " + list_Strings);
//        List<String> sub_List = list_Strings.subList(0, 3);
//        System.out.println("List of first three elements: " + sub_List);

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java для сравнения двух списков массивов.
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
//        array2.add("Red");
//        array2.add("Green");
//        array2.add("Orange");
//        array2.add("White");
//        System.out.println("Array2" + array2);
//
//        // compare ArrayList1 with ArrayList2
//        if (array.equals(array2) == true) {
//            System.out.println("Array List are equal");
//        } else {
//            // else block execute when
//            // ArrayList are not equal
//            System.out.println("Array List are not equal");
//        }

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//        ArrayList<String> c2= new ArrayList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//
//        //Storing the comparison output in ArrayList<String>
//        ArrayList<String> c3 = new ArrayList<String>();
//        for (String e : c1)
//            c3.add(c2.contains(e) ? "Yes" : "No");
//        System.out.println(c3);

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java, которая меняет местами два элемента в списке массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("Before Swap the ArrayList:\n" + array);
//
//        Collections.swap(array, 0, 2);
//        System.out.println("After Swap the ArrayList:\n" + array);

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//        System.out.println("Array list before Swap:");
//        for(String a: c1){
//            System.out.println(a);
//        }
//        //Swapping 1st(index 0) element with the 3rd(index 2) element
//        Collections.swap(c1, 0, 2);
//        System.out.println("Array list after swap:");
//        for(String b: c1){
//            System.out.println(b);
//        }

        System.out.println("Exercise 15");

        /*
        Напишите программу Java для объединения двух списков массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("ArrayList 1:\n" + array);
//
//        ArrayList <String> array2 = new ArrayList <String>();
//        array2.add("1");
//        array2.add("2");
//        array2.add("3");
//        array2.add("4");
//        array2.add("5");
//        System.out.println("ArrayList 2:\n" + array2);
//
//        array.addAll(array2);
//        System.out.println("Joined ArrayLists:\n" + array);

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("List of first array: " + c1);
//        ArrayList<String> c2= new ArrayList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//        System.out.println("List of second array: " + c2);
//
//        // Let join above two list
//        ArrayList<String> a = new ArrayList<String>();
//        a.addAll(c1);
//        a.addAll(c2);
//        System.out.println("New array: " + a);
    }
}
