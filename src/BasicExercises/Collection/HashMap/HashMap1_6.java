package BasicExercises.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1_6 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу Java, чтобы связать указанное значение с указанным ключом в HashMap.
         */

        //Мой вариант

//        HashMap <Integer, String> hmap = new HashMap <Integer, String>();
//
//        hmap.put(1, "Red");
//        hmap.put(2, "Green");
//        hmap.put(3, "Black");
//        hmap.put(4, "White");
//        hmap.put(5, "Pink");
//
//        System.out.println(hmap);

        //Вариант 2

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        for(Map.Entry x:hash_map.entrySet()){
//            System.out.println(x.getKey()+" "+x.getValue());
//        }

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для подсчета количества сопоставлений ключ-значение (размер) на карте.
         */

        //Мой вариант

//        HashMap <Integer, String> hmap = new HashMap <Integer, String>();
//
//        hmap.put(1, "Red");
//        hmap.put(2, "Green");
//        hmap.put(3, "Black");
//        hmap.put(4, "White");
//        hmap.put(5, "Pink");
//
//        System.out.println("HashMap:\n" + hmap);
//        System.out.println("Size of map is:- " + hmap.size());

        //Вариант 2

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        System.out.println("Size of the hash map: "+hash_map.size());

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java для копирования всех отображений с указанной карты на другую карту.
         */

        //Мой вариант

//        HashMap <Integer, String> hmap = new HashMap <Integer, String>();
//
//        hmap.put(1, "Red");
//        hmap.put(2, "Green");
//        hmap.put(3, "Black");
//        hmap.put(4, "White");
//        hmap.put(5, "Pink");
//
//        System.out.println("HashMap:\n" + hmap);
//
//        HashMap <Integer, String> hmap2 = new HashMap <Integer, String>();
//
//        hmap2.put(6, "Grey");
//        hmap2.put(7, "Brown");
//        hmap2.put(8, "Blue");
//
//        System.out.println("HashMap:\n" + hmap2);
//
//        hmap.putAll(hmap2);
//        System.out.println("Updated HashMap:\n" + hmap);

        //Вариант 2

//        // create two hash maps
//        HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
//        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
//        // populate hash maps
//        hash_map1.put(1, "Red");
//        hash_map1.put(2, "Green");
//        hash_map1.put(3, "Black");
//        System.out.println("\nValues in first map: " + hash_map1);
//        hash_map2.put(4, "White");
//        hash_map2.put(5, "Blue");
//        hash_map2.put(6, "Orange");
//        System.out.println("\nValues in second map: " + hash_map2);
//
//        // put all values in secondmap
//        hash_map2.putAll(hash_map1);
//        System.out.println("\nNow values in second map: " + hash_map2);

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для удаления всех отображений с карты.
         */

        //Мой вариант

//        HashMap <Integer, String> hmap = new HashMap <Integer, String>();
//
//        hmap.put(1, "Red");
//        hmap.put(2, "Green");
//        hmap.put(3, "Black");
//        hmap.put(4, "White");
//        hmap.put(5, "Pink");
//
//        System.out.println("HashMap:\n" + hmap);
//
//        hmap.clear();
//        System.out.println("Finally the maps look like this:\n" + hmap);

        //Вариант 2

//        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        // print the map
//        System.out.println("The Original linked map: " + hash_map);
//        // Removing all the elements from the linked map
//        hash_map.clear();
//        System.out.println("The New map: " + hash_map);

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы проверить, содержит ли карта сопоставления ключ-значение (пустое) или нет.
         */

        //Мой вариант

//        HashMap <Integer, String> hmap = new HashMap <Integer, String>();
//
//        hmap.put(1, "Red");
//        hmap.put(2, "Green");
//        hmap.put(3, "Black");
//        hmap.put(4, "White");
//        hmap.put(5, "Pink");
//
//        System.out.println("HashMap:\n" + hmap);
//
//        System.out.println("Is the map empty? " + hmap.isEmpty());

        //Вариант 2

//        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        // check if map is empty
//        boolean result = hash_map.isEmpty();
//        // check the result
//        System.out.println("Is hash map empty: " + result);
//        // Removing all the elements from the linked map
//        hash_map.clear();
//        // check if map is empty
//        result = hash_map.isEmpty();
//        // check the result
//        System.out.println("Is hash map empty: " + result);

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java, чтобы получить поверхностную копию экземпляра HashMap.
         */

        //Мой вариант

//        HashMap <Integer, String> hmap = new HashMap <Integer, String>();
//
//        hmap.put(1, "Red");
//        hmap.put(2, "Green");
//        hmap.put(3, "Black");
//        hmap.put(4, "White");
//        hmap.put(5, "Pink");
//
//        System.out.println("HashMap:\n" + hmap);
//
//        System.out.println("The cloned map look like this:\n" + hmap.clone());

        //Вариант 2

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        // print the map
//        System.out.println("The Original map: " + hash_map);
//        HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
//        new_hash_map = (HashMap)hash_map.clone();
//        System.out.println("Cloned map: " + new_hash_map);
    }
}
