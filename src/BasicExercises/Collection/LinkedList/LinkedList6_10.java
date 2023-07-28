package BasicExercises.Collection.LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedList6_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу Java для вставки элементов в связанный список в первую и последнюю позиции.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("Linked list before adding an items:\n" + list);
//
//        list.addFirst("Pink");
//        list.addLast("Grey");
//        System.out.println("Linked list after adding an items:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        System.out.println("Original linked list:" + l_list);
//        // Add an element at the beginning
//        l_list.addFirst("White");
//
//        // Add an element at the end of list
//        l_list.addLast("Pink");
//        System.out.println("Final linked list:" + l_list);

        System.out.println("Exercise 7");

        /*
        Напишите программу Java для вставки указанного элемента в начало связанного списка.
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
//        list.offerFirst("Pink");
//        System.out.println("Linked list after adding an item:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        System.out.println("Original linked list:" + l_list);
//        // Add an element to front of LinkedList
//        l_list.offerFirst("Pink");
//        System.out.println("Final linked list:" + l_list);

        System.out.println("Exercise 8");

        /*
        Напишите программу Java для вставки указанного элемента в конец связанного списка.
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
//        list.offerLast("Pink");
//        System.out.println("Linked list after adding an item:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList<String> l_list = new LinkedList<String>();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        System.out.println("Original linked list:" + l_list);
//        // Add an element at the end of a linked list
//        l_list.offerLast("Pink");
//        System.out.println("Final linked list:" + l_list);

        System.out.println("Exercise 9");

        /*
        Напишите программу Java для вставки некоторых элементов в указанной позиции в связанный список.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("Linked list before adding an items:\n" + list);
//
//        Collection<String> collect = new ArrayList<String>();
//        collect.add("Pink");
//        collect.add("Grey");
//
//        list.addAll(1, collect);
//        System.out.println("Linked list after adding an items:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> l_list = new LinkedList <String> ();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//
//        // print original list
//        System.out.println("Original linked list:" + l_list);
//
//        // create a new collection and add some elements
//
//        LinkedList <String> new_l_list = new LinkedList <String> ();
//        new_l_list.add("White");
//        new_l_list.add("Pink");
//
//        // Add the collection in the second position of the existing linked list
//        l_list.addAll(1, new_l_list);
//
//        // print the new list
//        System.out.println("LinkedList:" + l_list);

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
         */

        //Мой вариант

//        LinkedList<String> list = new LinkedList <String>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Orange");
//        list.add("White");
//        list.add("Black");
//
//        System.out.println("Linked list:\n" + list);
//        System.out.println("The first element:\n" + list.getFirst());
//        System.out.println("The last element:\n" + list.getLast());

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
//        // Find first element of the List
//        Object first_element = l_list.getFirst();
//        System.out.println("First Element is: "+first_element);
//
//        // Find last element of the List
//        Object last_element = l_list.getLast();
//        System.out.println("Last Element is: "+last_element);
    }
}
