package BasicExercises.Collection.TreeMap;

import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMap6and8_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для удаления всех элементов из древовидной карты.
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
//        tree_map.clear();
//
//        System.out.println("Finally the map looks like:\n" + tree_map);

        //Вариант 2

//        // Create a tree map
//        TreeMap<String,String> tree_map1 = new TreeMap<String,String>();
//        // Put elements to the map
//        tree_map1.put("C1", "Red");
//        tree_map1.put("C2", "Green");
//        tree_map1.put("C3", "Black");
//        tree_map1.put("C4", "White");
//
//        System.out.println("Orginal TreeMap content: "+tree_map1);
//        tree_map1.clear();
//        System.out.println("The New map: "+tree_map1);

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java, чтобы получить сопоставление ключ-значение,
        связанное с наибольшим и наименьшим ключом в карте.
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
//        System.out.println("Lowest entry is: " + tree_map.firstEntry());
//        System.out.println("The last key is " + tree_map.lastEntry());

        //Вариант 2

//        // Create a tree map
//        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();
//
//        // Put elements to the map
//        tree_map1.put("C1", "Red");
//        tree_map1.put("C2", "Green");
//        tree_map1.put("C3", "Black");
//        tree_map1.put("C4", "White");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Greatest key: " + tree_map1.firstEntry());
//        System.out.println("Least key: " + tree_map1.lastEntry());

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java, чтобы получить первый (самый низкий) ключ и последний (самый высокий) ключ в карте.
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
//        System.out.println("Lowest entry is: " + tree_map.firstKey());
//        System.out.println("The last key is " + tree_map.lastKey());

        //Вариант 2

//        // Create a tree map
//        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();
//
//        // Put elements to the map
//        tree_map1.put("C2", "Red");
//        tree_map1.put("C1", "Green");
//        tree_map1.put("C4", "Black");
//        tree_map1.put("C3", "White");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Greatest key: " + tree_map1.firstKey());
//        System.out.println("Least key: " + tree_map1.lastKey());

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java, чтобы получить обратный порядок ключей, содержащихся в данной карте.
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
//        NavigableSet set1 = tree_map.descendingKeySet();
//        System.out.println("Navigable set values are:\n" + set1);

        //Вариант 2

//        // Create a tree map
//        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();
//
//        // Put elements to the map
//        tree_map1.put("C2", "Red");
//        tree_map1.put("C1", "Green");
//        tree_map1.put("C4", "Black");
//        tree_map1.put("C3", "White");
//
//        System.out.println("Orginal TreeMap content: " + tree_map1);
//        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());
    }
}
