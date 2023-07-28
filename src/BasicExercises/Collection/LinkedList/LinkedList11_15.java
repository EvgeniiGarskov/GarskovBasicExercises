package BasicExercises.Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList11_15 {

    public static void main(String[] args) {

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java для отображения элементов и их позиций в связанном списке.
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
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Index: " + i + " Element: " + list.get(i));
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
//        for(int p=0; p < l_list.size(); p++)
//        {
//            System.out.println("Element at index "+p+": "+l_list.get(p));
//        }

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java для удаления указанного элемента из связанного списка.
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
//
//        list.remove(1);
//        System.out.println("After deleting an item:\n" + list);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> l_list = new LinkedList <String> ();
//        // use add() method to add values in the linked list
//        l_list.add("Red");
//        l_list.add("Green");
//        l_list.add("Black");
//        l_list.add("Pink");
//        l_list.add("orange");
//
//        // print the list
//        System.out.println("The Original linked list: " + l_list);
//
//        // Remove the element in third position from the said linked list
//        l_list.remove(2);
//        System.out.println("The New linked list: " + l_list);

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java для удаления первого и последнего элементов из связанного списка.
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
//
//        System.out.println("Element removed:\n" + list.removeFirst());
//        System.out.println("Element removed:\n" + list.removeLast());
//        System.out.println("After deleting an item:\n" + list);

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
//        // print the list
//        System.out.println("The Original linked list: " + l_list);
//
//        // Remove the first element
//        Object firstElement = l_list.removeFirst();
//        System.out.println("Element removed: "+ firstElement);
//
//        // Remove the last element
//        Object lastElement = l_list.removeLast();
//        System.out.println("Element removed: "+ lastElement);
//        System.out.println("The New linked list: " + l_list);

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java для удаления всех элементов из связанного списка.
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
//
//        list.clear();
//        System.out.println("List after clearing all elements:\n" + list);

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
//        // print the list
//        System.out.println("The Original linked list: " + l_list);
//
//        // Removing all the elements from the linked list
//        l_list.clear();
//
//        System.out.println("The New linked list: " + l_list);

        System.out.println("Exercise 15");

        /*
        Напишите программу Java, которая меняет местами два элемента в связанном списке.
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
//
//        Collections.swap(list, 0, 1);
//        System.out.println("List after Swapping:\n" + list);

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
//        System.out.println("The Original linked list: " + l_list);
//
//        //Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
//        Collections.swap(l_list, 0, 2);
//        System.out.println("The New linked list after swap: " + l_list);
    }
}
