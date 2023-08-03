package BasicExercises.Collection.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap7_12 {

    public static void main(String[] args) {

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного ключа.
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
//        System.out.println("Is the key '3' present? " + hmap.containsKey(3));

        //Вариант 2

//        HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
//        hash_map.put("Red", 1);
//        hash_map.put("Green", 2);
//        hash_map.put("Black", 3);
//        hash_map.put("White", 4);
//        hash_map.put("Blue", 5);
//        // print the map
//        System.out.println("The Original map: " + hash_map);
//        System.out.println("1. Is key 'Green' exists?");
//        if (hash_map.containsKey("Green")) {
//            //key exists
//            System.out.println("yes! - " + hash_map.get("Green"));
//        } else {
//            //key does not exists
//            System.out.println("no!");
//        }
//
//        System.out.println("\n2. Is key 'orange' exists?");
//        if (hash_map.containsKey("orange")) {
//            System.out.println("yes! - " + hash_map.get("orange"));
//        } else {
//            System.out.println("no!");
//        }

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного значения.
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
//        System.out.println("Is the value 'Green' present? " + hmap.containsValue("Green"));

        //Вариант 2

//        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        // print the map
//        System.out.println("The Original map: " + hash_map);
//        System.out.println("1. Is value \'Green\' exists?");
//        if (hash_map.containsValue("Green")) {
//            //value exists
//            System.out.println("Yes! ");
//        } else {
//            //value does not exists
//            System.out.println("no!");
//        }
//
//        System.out.println("\n2. Is value \'orange\' exists?");
//        if (hash_map.containsValue("orange")) {
//            System.out.println("yes! - " );
//        } else {
//            System.out.println("No!");
//        }

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для создания набора отображений, содержащихся в карте.
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
//        System.out.println("List of all pairs:\n" + hmap.entrySet());

        //Вариант 2

//        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//        // create set view for the map
//        Set set = hash_map.entrySet();
//        // check set values
//        System.out.println("Set values: " + set);

        System.out.println("Exercise 10");

        /*
        Напишите программу Java для получения значения указанного ключа на карте.
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
//        System.out.println("Value for key 3 is:\n" + hmap.get(3));

        //Вариант 2

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//        hash_map.put(1,"Red");
//        hash_map.put(2,"Green");
//        hash_map.put(3,"Black");
//        hash_map.put(4,"White");
//        hash_map.put(5,"Blue");
//        // get value of key 3
//        String val=(String)hash_map.get(3);
//        // check the value
//        System.out.println("Value for key 3 is: " + val);

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java, чтобы получить заданное представление ключей, содержащихся в этой карте.
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
//        System.out.println("Key set values are:\n" + hmap.keySet());

        //Вариант 2

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//
//        hash_map.put(1,"Red");
//        hash_map.put(2,"Green");
//        hash_map.put(3,"Black");
//        hash_map.put(4,"White");
//        hash_map.put(5,"Blue");
//
//        // get keyset value from map
//        Set keyset = hash_map.keySet();
//
//        // check key set values
//        System.out.println("Key set values are: " + keyset);

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы получить набор значений, содержащихся в этой карте.
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
//        System.out.println("The collection is:\n" + hmap.values());

        //Вариант 2

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//        hash_map.put(1,"Red");
//        hash_map.put(2,"Green");
//        hash_map.put(3,"Black");
//        hash_map.put(4,"White");
//        hash_map.put(5,"Blue");
//
//        // checking collection view of the map
//        System.out.println("Collection view is: "+ hash_map.values());
    }
}
