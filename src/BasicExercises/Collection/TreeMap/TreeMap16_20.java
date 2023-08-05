package BasicExercises.Collection.TreeMap;

import java.util.TreeMap;

public class TreeMap16_20 {

    public static void main(String[] args) {

        System.out.println("Exercise 16");

        /*
        Напишите программу на Java,
        чтобы получить сопоставление ключ-значение, связанное с наибольшим ключом, строго меньшим заданного ключа.
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
//        System.out.println("The lowerEntry value for 3:\n" + tree_map.lowerEntry(3));

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
//        System.out.println("Key(s): "+tree_map1.lowerEntry(10));
//        System.out.println("Checking the entry for 20: ");
//        System.out.println("Key(s): "+tree_map1.lowerEntry(20));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Key(s): "+tree_map1.lowerEntry(70));

        System.out.println("Exercise 17");

        /*
        Напишите программу на Java, чтобы получить наибольший ключ,
        строго меньший заданного ключа. Возвращает null, если такого ключа нет.
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
//        System.out.println("The lowerKey value for 3:\n" + tree_map.lowerKey(3));

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
//        System.out.println("Key(s): " + tree_map1.lowerKey(10));
//        System.out.println("Checking the entry for 20: ");
//        System.out.println("Key(s): " + tree_map1.lowerKey(20));
//        System.out.println("Checking the entry for 70: ");
//        System.out.println("Key(s): " + tree_map1.lowerKey(70));

        System.out.println("Exercise 18");

        /*
        Напишите программу на Java, чтобы получить представление NavigableSet ключей на карте.
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
//        System.out.println("Value is: " + tree_map.navigableKeySet());

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
//        System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());

        System.out.println("Exercise 19");

        /*
        Напишите программу Java для удаления и получения сопоставления ключ-значение,
        связанного с наименьшим ключом в сопоставлении.
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
//        System.out.println("The smallest key value pair is :\n" + tree_map.pollFirstEntry());
//        System.out.println("The resultant Map after deletion is :\n" + tree_map);

        //Вариант 2

//        // Create a tree map
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(40, "Black");
//        tree_map.put(50, "White");
//        tree_map.put(60, "Pink");
//
//        // polling first entry
//        System.out.println("Value before poll: " + tree_map);
//        System.out.println("Value returned: " + tree_map.pollFirstEntry());
//        System.out.println("Value after poll: " + tree_map);

        System.out.println("Exercise 20");

        /*
        Напишите программу на Java, чтобы удалить и получить сопоставление ключ-значение,
        связанное с наибольшим ключом в этой карте.
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
//        System.out.println("The largest key value pair is :\n" + tree_map.pollLastEntry());
//        System.out.println("The resultant Map after deletion is :\n" + tree_map);

        //Вариант 2

//        // Create a tree map
//        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
//
//        // Put elements to the map
//        tree_map.put(10, "Red");
//        tree_map.put(20, "Green");
//        tree_map.put(40, "Black");
//        tree_map.put(50, "White");
//        tree_map.put(60, "Pink");
//
//        // polling first entry
//        System.out.println("Value before poll: " + tree_map);
//        System.out.println("Value returned: " + tree_map.pollLastEntry());
//        System.out.println("Value after poll: " + tree_map);
    }
}
