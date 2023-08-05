package BasicExercises.Collection.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1_5 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу Java, чтобы связать указанное значение с указанным ключом в карте дерева.
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

        //Вариант 2

//        // Create a tree map
//        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
//        // Put elements to the map
//        tree_map.put(1, "Red");
//        tree_map.put(2, "Green");
//        tree_map.put(3, "Black");
//        tree_map.put(4, "White");
//        tree_map.put(5, "Blue");
//
//        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
//        {
//            System.out.println(entry.getKey() + "=>" + entry.getValue());
//        }

        System.out.println("Exercise 2");

        /*
        Напишите программу Java для копирования содержимого карты дерева в другую карту дерева.
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
//        TreeMap <Integer, String> tree_map2 = new TreeMap <Integer, String>();
//
//        tree_map2.put(6, "Grey");
//        tree_map2.put(7, "Brown");
//        tree_map2.put(8, "Blue");
//
//        System.out.println("TreeMap 2:\n" + tree_map2);
//
//        tree_map.putAll(tree_map2);
//        System.out.println("Updated HashMap:\n" + tree_map);

        //Вариант 2

//        // Create a tree map
//        TreeMap<String,String> tree_map1=new TreeMap<String,String>();
//
//        // Put elements to the map
//        tree_map1.put("C1", "Red");
//        tree_map1.put("C2", "Green");
//        tree_map1.put("C3", "Black");
//        tree_map1.put("C4", "White");
//        tree_map1.put("C5", "Blue");
//        System.out.println("Tree Map 1: "+tree_map1);
//        TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
//        tree_map2.put("A1", "Orange");
//        tree_map2.put("A2", "Pink");
//        System.out.println("Tree Map 2: "+tree_map2);
//        tree_map1.putAll(tree_map2);
//        System.out.println("After coping map2 to map1: "+tree_map1);

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java для поиска ключа в древовидной карте.
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
//        System.out.println("Is the key '20' present? " + tree_map.containsKey(20));

        //Вариант 2

//        // Create a tree map
//        TreeMap<String,String> tree_map1=new TreeMap<String,String>();
//
//        // Put elements to the map
//        tree_map1.put("C1", "Red");
//        tree_map1.put("C2", "Green");
//        tree_map1.put("C3", "Black");
//        tree_map1.put("C4", "White");
//
//        System.out.println(tree_map1);
//        if(tree_map1.containsKey("C1")){
//            System.out.println("The Tree Map contains key C1");
//        } else {
//            System.out.println("The Tree Map does not contain key C1");
//        }
//        if(tree_map1.containsKey("C5")){
//            System.out.println("The Tree Map contains key C5");
//        } else {
//            System.out.println("The TreeMap does not contain key C5");
//        }

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для поиска значения в древовидной карте.
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
//        System.out.println("Is the value 'White' present? " + tree_map.containsValue("White"));

        //Вариант 2

//        // Create a tree map
//        TreeMap<String,String> tree_map1=new TreeMap<String,String>();
//
//        // Put elements to the map
//        tree_map1.put("C1", "Red");
//        tree_map1.put("C2", "Green");
//        tree_map1.put("C3", "Black");
//        tree_map1.put("C4", "White");
//
//        if(tree_map1.containsValue("Green")){
//            System.out.println("The TreeMap contains value Green");
//        } else {
//            System.out.println("The TreeMap does not contain value Green");
//        }
//        if(tree_map1.containsValue("Pink")){
//            System.out.println("The TreeMap contains value Pink");
//        } else {
//            System.out.println("The TreeMap does not contain value Pink");
//        }

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы получить все ключи из карты дерева.
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
//        System.out.println("The set is: " + tree_map.keySet());

        //Вариант 2

//        // Create a tree map
//        TreeMap<String,String> tree_map1=new TreeMap<String,String>();
//        // Put elements to the map
//        tree_map1.put("C1", "Red");
//        tree_map1.put("C2", "Green");
//        tree_map1.put("C3", "Black");
//        tree_map1.put("C4", "White");
//
//        Set<String> keys = tree_map1.keySet();
//        for(String key: keys){
//            System.out.println(key);
//        }
    }
}
