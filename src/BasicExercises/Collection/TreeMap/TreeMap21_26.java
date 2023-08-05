package BasicExercises.Collection.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap21_26 {

    public static void main(String[] args) {

        System.out.println("Exercise 21");

        /*
        Напишите программу на Java, чтобы получить часть карты, ключи которой находятся
        в диапазоне от данного ключа (включительно) до другого ключа (исключая).
         */

        //Мой вариант

//        TreeMap <Integer, String> tree_map = new TreeMap <Integer, String>();
//
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        System.out.println("TreeMap:\n" + tree_map);
//
//        System.out.println("The subMap is:\n" + tree_map.subMap(2, 5));

        //Вариант 2

//        // Declare tree maps
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//        SortedMap< Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(30, "Black");
//        tree_map.put(40, "White");
//        tree_map.put(50, "Pink");
//        System.out.println("Orginal TreeMap content: " + tree_map);
//        sub_tree_map = tree_map.subMap(20, 40);
//        System.out.println("Sub map key-values: " + sub_tree_map);

        System.out.println("Exercise 22");

        /*
        Напишите программу на Java, чтобы получить часть карты, ключи которой находятся
        в диапазоне от заданного ключа до другого ключа.
         */

        //Мой вариант

//        TreeMap <Integer, String> tree_map = new TreeMap <Integer, String>();
//
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        System.out.println("TreeMap:\n" + tree_map);
//
//        System.out.println("The subMap is:\n" + tree_map.subMap(2, true, 5, true));

        //Вариант 2

//        // Declare tree maps
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//        SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(30, "Black");
//        tree_map.put(40, "White");
//        tree_map.put(50, "Pink");
//        System.out.println("Orginal TreeMap content: " + tree_map);
//        sub_tree_map = tree_map.subMap(20, true, 40, true);
//        System.out.println("Sub map key-values: " + sub_tree_map);

        System.out.println("Exercise 23");

        /*
        Напишите программу на Java, чтобы получить часть карты, ключи которой больше или равны заданному ключу.
         */

        //Мой вариант

//        TreeMap <Integer, String> tree_map = new TreeMap <Integer, String>();
//
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        System.out.println("TreeMap:\n" + tree_map);
//
//        System.out.println("The tailMap is:\n" + tree_map.tailMap(3));

        //Вариант 2

//        // Declare tree maps
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(30, "Black");
//        tree_map.put(40, "White");
//        tree_map.put(50, "Pink");
//        System.out.println("Orginal TreeMap content: " + tree_map);
//        System.out.println("Keys are greater than or equal to 20: " + tree_map.tailMap(20));

        System.out.println("Exercise 24");

        /*
        Напишите программу на Java, чтобы получить часть карты, ключи которой больше заданного ключа.
         */

        //Мой вариант

//        TreeMap <Integer, String> tree_map = new TreeMap <Integer, String>();
//
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        System.out.println("TreeMap:\n" + tree_map);
//
//        System.out.println("The tailMap is:\n" + tree_map.tailMap(3, false));

        //Вариант 2

//        // Declare tree maps
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(30, "Black");
//        tree_map.put(40, "White");
//        tree_map.put(50, "Pink");
//        System.out.println("Orginal TreeMap content: " + tree_map);
//        System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));

        System.out.println("Exercise 25");

        /*
        Напишите программу на Java, чтобы получить сопоставление ключ-значение,
        связанное с наименьшим ключом, большим или равным заданному ключу.
        Возвращает null, если такого ключа нет.
         */

        //Мой вариант

//        TreeMap <Integer, String> tree_map = new TreeMap <Integer, String>();
//
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        System.out.println("TreeMap:\n" + tree_map);
//
//        System.out.println("The next greater key-value of 3 is :\n" + tree_map.ceilingEntry(3));

        //Вариант 2

//        // Declare tree maps
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(30, "Black");
//        tree_map.put(40, "White");
//        tree_map.put(50, "Pink");
//        System.out.println("Orginal TreeMap content: " + tree_map);
//        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
//        System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
//        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));

        System.out.println("Exercise 26");

        /*
        Напишите программу на Java, чтобы получить наименьший ключ, больший или равный заданному ключу.
        Возвращает null, если такого ключа нет.
         */

        //Мой вариант

//        TreeMap <Integer, String> tree_map = new TreeMap <Integer, String>();
//
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        System.out.println("TreeMap:\n" + tree_map);
//
//        System.out.println("Ceiling key entry for 3:\n" + tree_map.ceilingKey(3));

        //Вариант 2

//        // Declare tree maps
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(40, "Black");
//        tree_map.put(50, "White");
//        tree_map.put(60, "Pink");
//        System.out.println("Orginal TreeMap content: " + tree_map);
//        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));
//        System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));
//        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
    }
}
