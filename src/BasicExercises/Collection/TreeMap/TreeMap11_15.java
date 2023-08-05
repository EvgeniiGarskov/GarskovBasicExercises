package BasicExercises.Collection.TreeMap;

import java.util.TreeMap;

public class TreeMap11_15 {

    public static void main(String[] args) {

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java, чтобы получить сопоставление ключ-значение,
        связанное с наибольшим ключом, меньшим или равным заданному ключу.
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
//        System.out.println("The greatest key-value less than 3 is :\n" + tree_map.floorEntry(3));

        //Вариант 2

//        // Create a tree map
//        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
//        // Put elements to the map
//        tree_map1.put(10, "Red");
//        tree_map1.put(20, "Green");
//        tree_map1.put(40, "Black");
//        tree_map1.put(50, "White");
//        tree_map1.put(60, "Pink");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Checking the entry for 10: ");
//        System.out.println("Value is: " + tree_map1.floorEntry(10));
//        System.out.println("Checking the entry for 30: ");
//        System.out.println("Value is: " + tree_map1.floorEntry(30));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Value is: " + tree_map1.floorEntry(70));

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы получить наибольший ключ, меньший или равный заданному ключу.
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
//        System.out.print("Floor Entry of Element 5 is:\n" + tree_map.floorKey(5));

        //Вариант 2

//        // Create a tree map
//        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
//        // Put elements to the map
//        tree_map1.put(10, "Red");
//        tree_map1.put(20, "Green");
//        tree_map1.put(40, "Black");
//        tree_map1.put(50, "White");
//        tree_map1.put(60, "Pink");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Checking the entry for 10: ");
//        System.out.println("Key is: " + tree_map1.floorKey(10));
//        System.out.println("Checking the entry for 30: ");
//        System.out.println("Key is: " + tree_map1.floorKey(30));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Key is: " + tree_map1.floorKey(70));

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java, чтобы получить часть карты, ключи которой строго меньше заданного ключа.
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
//        System.out.println("The headmap is:\n" + tree_map.headMap(3));

        //Вариант 2

//        // Create a tree map
//        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map1.put(10, "Red");
//        tree_map1.put(20, "Green");
//        tree_map1.put(40, "Black");
//        tree_map1.put(50, "White");
//        tree_map1.put(60, "Pink");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Checking the entry for 10: ");
//        System.out.println("Key(s): " + tree_map1.headMap(10));
//        System.out.println("Checking the entry for 30: ");
//        System.out.println("Key(s): " + tree_map1.headMap(30));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Key(s): " + tree_map1.headMap(70));

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java, чтобы получить часть этой карты,
        ключи которой меньше (или равны, если включительно) заданному ключу.
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
//        System.out.println("The headmap is:\n" + tree_map.headMap(3, true));

        //Вариант 2

//        // Create a tree map
//        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map1.put(10, "Red");
//        tree_map1.put(20, "Green");
//        tree_map1.put(40, "Black");
//        tree_map1.put(50, "White");
//        tree_map1.put(60, "Pink");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Checking the entry for 10: ");
//        System.out.println("Key(s): " + tree_map1.headMap(10, true));
//        System.out.println("Checking the entry for 20: ");
//        System.out.println("Key(s): " + tree_map1.headMap(20, true));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Key(s): " + tree_map1.headMap(70, true));

        System.out.println("Exercise 15");

        /*
        Напишите программу на Java, чтобы получить наименьший ключ,
        строго больший заданного ключа. Возвращает null, если такого ключа нет.
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
//        System.out.println("The higherEntry value for 3:\n" + tree_map.higherEntry(3));

        //Вариант 2

//        // Create a tree map
//        TreeMap< Integer, String > tree_map1 = new TreeMap< Integer, String >();
//
//        // Put elements to the map
//        tree_map1.put(10, "Red");
//        tree_map1.put(20, "Green");
//        tree_map1.put(40, "Black");
//        tree_map1.put(50, "White");
//        tree_map1.put(60, "Pink");
//
//        System.out.println("Orginal TreeMap content: "+tree_map1);
//        System.out.println("Checking the entry for 10: ");
//        System.out.println("Key(s): "+tree_map1.higherEntry(10));
//        System.out.println("Checking the entry for 20: ");
//        System.out.println("Key(s): "+tree_map1.higherEntry(20));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Key(s): "+tree_map1.higherEntry(70));
    }
}
