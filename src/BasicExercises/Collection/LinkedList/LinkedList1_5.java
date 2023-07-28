package BasicExercises.Collection.LinkedList;

import java.util.*;
import java.util.LinkedList;

public class LinkedList1_5 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу Java для добавления указанного элемента в конец связанного списка.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("The linked list: " + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("White");
//        l_list.add("Pink");
//        l_list.add("Yellow");
//
//        // print the list
//        System.out.println("The linked list: " + l_list);

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для перебора всех элементов связанного списка.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//
////        for (String str : list) {
////            System.out.print(str + " ");
////        }

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("White");
//        l_list.add("Pink");
//        // Print the linked list
//        for (String element : l_list) {
//            System.out.println(element);
//        }

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java для перебора всех элементов в связанном списке, начиная с указанной позиции.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        Iterator <String> iter = list.listIterator(2);
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("White");
//        l_list.add("Pink");
//        // set Iterator at specified index
//        Iterator p = l_list.listIterator(1);
//
//        // print list from second position
//        while (p.hasNext()) {
//            System.out.println(p.next());
//        }

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для итерации связанного списка в обратном порядке.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        Iterator <String> iter = list.descendingIterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
//
//        System.out.println();
//
//        ListIterator <String> iter2 = list.listIterator(list.size());
//        while (iter2.hasPrevious()) {
//            System.out.print(iter2.previous() + " ");
//        }

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("Pink");
//        l_list.add("orange");
//
//        // print original list
//        System.out.println("Original linked list:" + l_list);
//
//        Iterator it = l_list.descendingIterator();
//
//        // Print list elements in reverse order
//        System.out.println("Elements in Reverse Order:");
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        System.out.println("Exercise 5");

        /*
        Напишите программу Java для вставки указанного элемента в указанную позицию в связанном списке.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("Linked list before adding an item:\n" + list);
//
//        list.add(1, "Pink");
//        System.out.println("Linked list after adding an item:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> l_list = new LinkedList <String> ();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("White");
//        l_list.add("Pink");
//        System.out.println("Original linked list: ");
//        System.out.println("Let add the Yellow color after the Red Color: " + l_list);
//        l_list.add(1, "Yellow");
//        // print the list
//        System.out.println("The linked list:" + l_list);
    }
}
