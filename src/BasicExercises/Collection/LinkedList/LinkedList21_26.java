package BasicExercises.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList21_26 {

    public static void main(String[] args) {

        System.out.println("Exercise 21");

        /*
        Напишите программу на Java для извлечения, но не удаления последнего элемента связанного списка.
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
//        System.out.println("Last element:\n" + list.peekLast());

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> c1 = new LinkedList <String> ();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked list: " + c1);
//        // Retrieve but does not remove, the last element of a linked list
//        String x = c1.peekLast();
//        System.out.println("Last element in the list: " + x);
//        System.out.println("Original linked list: " + c1);

        System.out.println("Exercise 22");

        /*
        Напишите программу на Java, чтобы проверить, существует ли конкретный элемент в связанном списке.
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
//        System.out.println("Does the List contains 'Green'\n" + list.contains("Green"));

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> c1 = new LinkedList <String> ();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked list: " + c1);
//
//        // Checks whether the color "Green" exists or not.
//        if (c1.contains("Green")) {
//            System.out.println("Color Green is present in the linked list.");
//        } else {
//            System.out.println("Color Green is not present in the linked list.");
//        }
//
//        // Checks whether the color "Orange" exists or not.
//        if (c1.contains("Orange")) {
//            System.out.println("Color Orange is present in the linked list.");
//        } else {
//            System.out.println("Color Orange is not present in the linked list.");
//        }

        System.out.println("Exercise 23");

        /*
        Напишите программу Java для преобразования связанного списка в список массивов.
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
//
//        List<String> arrList = new ArrayList<String>(list);
//        // for (String str : arrList) {
//        //   System.out.println(str);
//        // }
//        System.out.println("ArrayList:\n" + arrList);

        //Вариант 2

//        // create an empty linked list
//        LinkedList <String> linked_list = new LinkedList <String> ();
//        linked_list.add("Red");
//        linked_list.add("Green");
//        linked_list.add("Black");
//        linked_list.add("White");
//        linked_list.add("Pink");
//        System.out.println("Original linked list: " + linked_list);
//
//        //Convert a linked list to array list
//        List<String> list = new ArrayList<String>(linked_list);
//
//        for (String str : list){
//            System.out.println(str);
//        }

        System.out.println("Exercise 24");

        /*
        Напишите программу на Java для сравнения двух связанных списков.
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
//        list2.add("Red");
//        list2.add("Green");
//        list2.add("Orange");
//        list2.add("White");
//        System.out.println("LinkedList 2:\n" + list2);
//
//        // compare ArrayList1 with ArrayList2
//        if (list.equals(list2) == true) {
//            System.out.println("Linked List are equal");
//        } else {
//            // else block execute when
//            // ArrayList are not equal
//            System.out.println();
//            System.out.println("Array List are not equal");
//        }

        //Вариант 2

//        LinkedList<String> c1= new LinkedList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//        LinkedList<String> c2= new LinkedList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Orange");
//
//        //comparison output in linked list
//        LinkedList<String> c3 = new LinkedList<String>();
//        for (String e : c1)
//            c3.add(c2.contains(e) ? "Yes" : "No");
//        System.out.println(c3);

        System.out.println("Exercise 25");

        /*
        Напишите программу на Java, чтобы проверить, является ли связанный список пустым или нет.
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
//        boolean emp = list.isEmpty();
//
//        if (emp == true) {
//            System.out.println("The LinkedList is empty");
//        } else {
//            System.out.println("The LinkedList is not empty");
//        }

        //Вариант 2

//        LinkedList<String> c1= new LinkedList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked list: " + c1);
//        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
//        c1.removeAll(c1);
//        System.out.println("Linked list after remove all elements "+c1);
//        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());

        System.out.println("Exercise 26");

        /*
        Напишите программу на Java для замены элемента в связанном списке.
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
//
//        System.out.println("The Object that is replaced is: " + list.set(3, "Grey"));
//        System.out.println("The new LinkedList is:\n" + list);

        //Вариант 2

//        LinkedList<String> c1= new LinkedList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original linked list: " + c1);
//        // Replacing 2nd element with new value
//        c1.set(1, "Orange");
//        System.out.println("The value of second element changed.");
//        System.out.println("New linked list: " + c1);
    }
}
