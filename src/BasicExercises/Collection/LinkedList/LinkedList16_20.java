package BasicExercises.Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList16_20 {

    public static void main(String[] args) {

        System.out.println("Exercise 16");

        /*
        Напишите программу на Java для перемешивания элементов в связанном списке.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("Original List:\n" + list);
//
//        Collections.shuffle(list);
//        System.out.println("Shuffled List:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> l_list = new LinkedList <String> ();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("Pink");
//        l_list.add("orange");
//        // print the list
//        System.out.println("Linked list before shuffling:\n" + l_list);
//        Collections.shuffle(l_list);
//        System.out.println("Linked list after shuffling:\n" + l_list);

        System.out.println("Exercise 17");

        /*
        Напишите программу Java для объединения двух связанных списков.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("LinkedList 1:\n" + list);
//
//        LinkedList<String> list2 = new LinkedList <String>();
//        list2.add("1");
//        list2.add("2");
//        list2.add("3");
//        list2.add("4");
//        list2.add("5");
//
//        System.out.println("LinkedList 2:\n" + list2);
//
//        list.addAll(list2);
//        System.out.println("Joined LinkedList:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> c1 = new LinkedList <String> ();
//
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("List of first linked list: " + c1);
//        LinkedList <String> c2 = new LinkedList <String> ();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//        System.out.println("List of second linked list: " + c2);
//
//        // Let join above two list
//        LinkedList <String> a = new LinkedList <String> ();
//        a.addAll(c1);
//        a.addAll(c2);
//        System.out.println("New linked list: " + a);

        System.out.println("Exercise 18");

        /*
        Напишите программу на Java для копирования связанного списка в другой связанный список.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("LinkedList 1:\n" + list);
//
//        LinkedList sec_list = new LinkedList();
//        sec_list = (LinkedList) list.clone();
//        System.out.println("Second LinkedList is:\n" + sec_list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> c1 = new LinkedList <String> ();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked  list: " + c1);
//        LinkedList <String> newc1 = new LinkedList <String> ();
//        newc1 = (LinkedList)c1.clone();
//        System.out.println("Cloned linked list: " + newc1);

        System.out.println("Exercise 19");

        /*
        Напишите программу на Java для удаления и возврата первого элемента связанного списка.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("LinkedList:\n" + list);
//        System.out.println("Removed element:\n" + list.pop());
//        System.out.println("Linked list after pop operation:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> c1 = new LinkedList <String> ();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked  list: " + c1);
//
//        System.out.println("Removed element: "+c1.pop());
//
//        System.out.println("Linked list after pop operation: "+c1);

        System.out.println("Exercise 20");

        /*
        Напишите программу на Java, которая извлекает, но не удаляет первый элемент связанного списка.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("LinkedList:\n" + list);
//        System.out.println("First element:\n" + list.peekFirst());

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> c1 = new LinkedList <String> ();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked list: " + c1);
//        // Retrieve but does not remove, the first element of a linked list
//        String x = c1.peekFirst();
//        System.out.println("First element in the list: " + x);
//        System.out.println("Original linked list: " + c1);
    }
}
