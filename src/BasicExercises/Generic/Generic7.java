package BasicExercises.Generic;

import java.util.HashMap;
import java.util.Map;

public class Generic7 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания универсального метода, который берет карту любого типа и печатает
        каждую пару ключ-значение.
         */

        //Мой вариант

//        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
//        hash_map.put(1, "Red");
//        hash_map.put(2, "Green");
//        hash_map.put(3, "Black");
//        hash_map.put(4, "White");
//        hash_map.put(5, "Blue");
//
//        mergeLists(hash_map);

        //Вариант 2

//        Map < String, Integer > colorMap = new HashMap < > ();
//        colorMap.put("Red", 1);
//        colorMap.put("Green", 2);
//        colorMap.put("Blue", 3);
//
//        System.out.println("Color Map:");
//        printMap(colorMap);
//
//        Map < String, String > capitalMap = new HashMap < > ();
//        capitalMap.put("Germany ", "Berlin");
//        capitalMap.put("USA", "Washington, D.C.");
//        capitalMap.put("UK", "London");
//        capitalMap.put("France", "Paris");
//
//        System.out.println("\nCapital Map:");
//        printMap(capitalMap);
    }

    //Мой вариант
//    public static <K, V> void mergeLists(Map<K, V> map) {
//
//        for(Map.Entry x:map.entrySet()) {
//            System.out.println(x.getKey()+" "+x.getValue());
//        }
//    }

    //Вариант 2
//    public static < K, V > void printMap(Map < K, V > map) {
//        for (Map.Entry < K, V > entry: map.entrySet()) {
//            K key = entry.getKey();
//            V value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//    }
}
