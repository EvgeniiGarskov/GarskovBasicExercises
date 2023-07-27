package BasicExercises.Collection.ArrayList;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ArrayList16_20 {

    public static void main(String[] args) {

        System.out.println("Exercise 16");

        /*
        Напишите программу Java для клонирования списка массивов в другой список массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("ArrayList:\n" + array);
//
//        ArrayList <String> arrayCopy = (ArrayList <String>) array.clone();
//        System.out.println("ArrayList clone:\n" + arrayCopy);

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original array list: " + c1);
//        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
//        System.out.println("Cloned array list: " + newc1);

        System.out.println("Exercise 17");

        /*
        Напишите программу Java для очистки списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("ArrayList before removeAll() operation:\n" + array);
//
//        ArrayList <String> array2 = new ArrayList <String>();
//        array2.addAll(array);
//        System.out.println("Collection Elements to be removed:\n" + array2);
//
//        array.removeAll(array2);
//        System.out.println("ArrayList after removeAll() operation:\n" + array);

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original array list: " + c1);
//        c1.removeAll(c1);
//        System.out.println("Array list after remove all elements "+c1);

        System.out.println("Exercise 18");

        /*
        Напишите программу на Java, чтобы проверить, является ли список массивов пустым или нет.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("ArrayList:\n" + array);
//
//        boolean emp = array.isEmpty();
//
//        if (emp == true) {
//            System.out.println("The ArrayList is empty");
//        } else {
//            System.out.println("The ArrayList is not empty");
//        }

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original array list: " + c1);
//        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
//        c1.removeAll(c1);
//        System.out.println("Array list after remove all elements "+c1);
//        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());

        System.out.println("Exercise 19");

        /*
        Напишите программу Java для обрезки емкости списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("ArrayList:\n" + array);
//
//        array.trimToSize();
//        System.out.println("Array after capacity reduction:\n" + array);

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("Original array list: " + c1);
//        System.out.println("Let trim to size the above array: ");
//        c1.trimToSize();
//        System.out.println(c1);

        System.out.println("Exercise 20");

        /*
        Напишите программу на Java для увеличения размера списка массивов.
         */

        //Мой вариант

//        ArrayList <String> array = new ArrayList <String>();
//        array.add("Red");
//        array.add("Green");
//        array.add("Orange");
//        array.add("White");
//        array.add("Black");
//        System.out.println("ArrayList:\n" + array);
//
//        // using ensureCapacity() method to
//        // increase the capacity of ArrayList
//        // numbersto hold 500 elements.
//        System.out.println("Increasing the capacity of ArrayList numbers to store upto 500 elements.");
//        array.ensureCapacity(500);
//        System.out.println("ArrayList numbers can now store upto 500 elements.");

        //Вариант 2

//        ArrayList<String> c1= new ArrayList<String>(3);
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        System.out.println("Original array list: " + c1);
//        //Increase capacity to 6
//        c1.ensureCapacity(6);
//        c1.add("White");
//        c1.add("Pink");
//        c1.add("Yellow");
//        System.out.println("New array list: " + c1);
    }
}
