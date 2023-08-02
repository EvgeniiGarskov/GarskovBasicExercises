package BasicExercises.Collection.HashSet;

import java.util.*;
import java.util.HashSet;

public class HashSet7_12 {

    public static void main(String[] args) {

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java для преобразования набора хэшей в массив.
         */

        //Мой вариант

//        HashSet <String> hset = new HashSet <String>();
//
//        hset.add("Red");
//        hset.add("Green");
//        hset.add("Black");
//        hset.add("White");
//        hset.add("Pink");
//
//        System.out.println("The Hash Set: " + hset);
//
//        Object[] arr = hset.toArray();
//        System.out.println("The array is:");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j]);
//        }

        //Вариант 2

//        // Create a empty hash set
//        HashSet<String> h_set = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        h_set.add("Pink");
//        h_set.add("Yellow");
//        System.out.println("Original Hash Set: " + h_set);
//        // Creating an Array
//        String[] new_array = new String[h_set.size()];
//        h_set.toArray(new_array);
//
//        // Displaying Array elements
//        System.out.println("Array elements: ");
//        for(String element : new_array){
//            System.out.println(element);
//        }

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java для преобразования набора хэшей в набор деревьев.
         */

        //Мой вариант

//        HashSet <String> hset = new HashSet <String>();
//
//        hset.add("Red");
//        hset.add("Green");
//        hset.add("Black");
//        hset.add("White");
//        hset.add("Pink");
//
//        System.out.println("The Hash Set: " + hset);
//
//        Set<String> hashSetToTreeSet = new TreeSet<>(hset);
//
//        System.out.println("TreeSet: " + hashSetToTreeSet);

        //Вариант 2

//        // Create a empty hash set
//        HashSet<String> h_set = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        h_set.add("Pink");
//        h_set.add("Yellow");
//        System.out.println("Original Hash Set: " + h_set);
//
//        // Creat a TreeSet of HashSet elements
//        Set<String> tree_set = new TreeSet<String>(h_set);
//
//        // Display TreeSet elements
//        System.out.println("TreeSet elements: ");
//        for(String element : tree_set){
//            System.out.println(element);
//        }

        System.out.println("Exercise 9");

        /*
        Напишите программу Java для преобразования набора хэшей в список/массив.
         */

        //Мой вариант

//        HashSet <String> hset = new HashSet <String>();
//
//        hset.add("Red");
//        hset.add("Green");
//        hset.add("Black");
//        hset.add("White");
//        hset.add("Pink");
//
//        System.out.println("The Hash Set: " + hset);
//
//        List<String> hashSetToArrayList = new ArrayList<>(hset);
//
//        System.out.println("ArrayList: " + hashSetToArrayList);

        //Вариант 2

//        // Create a empty hash set
//        HashSet<String> h_set = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        h_set.add("Pink");
//        h_set.add("Yellow");
//        System.out.println("Original Hash Set: " + h_set);
//
//        // Create a List from HashSet elements
//        List<String> list = new ArrayList<String>(h_set);
//
//        // Display ArrayList elements
//        System.out.println("ArrayList contains: "+ list);

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java для сравнения двух наборов хэшей.
         */

        //Мой вариант

//        HashSet <String> hset = new HashSet <String>();
//
//        hset.add("Red");
//        hset.add("Green");
//        hset.add("Black");
//        hset.add("White");
//        hset.add("Pink");
//
//        System.out.println("The Hash Set:\n" + hset);
//
//        HashSet <String> hset2 = new HashSet <String>();
//        hset2.add("Red");
//        hset2.add("Green");
//        hset2.add("Orange");
//        hset2.add("White");
//        System.out.println("The Hash Set 2:\n" + hset2);
//
//        // compare ArrayList1 with ArrayList2
//        if (hset.equals(hset2) == true) {
//            System.out.println("Linked List are equal");
//        } else {
//            // else block execute when
//            // ArrayList are not equal
//            System.out.println();
//            System.out.println("Array List are not equal");
//        }

        //Вариант 2

//        // Create a empty hash set
//        HashSet<String> h_set = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//
//        HashSet<String>h_set2 = new HashSet<String>();
//        h_set2.add("Red");
//        h_set2.add("Pink");
//        h_set2.add("Black");
//        h_set2.add("Orange");
//        //comparison output in hash set
//        HashSet<String>result_set = new HashSet<String>();
//        for (String element : h_set){
//            System.out.println(h_set2.contains(element) ? "Yes" : "No");
//        }

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java для сравнения двух наборов и сохранения одинаковых элементов.
         */

//        // Create a empty hash set
//        HashSet<String> h_set1 = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set1.add("Red");
//        h_set1.add("Green");
//        h_set1.add("Black");
//        h_set1.add("White");
//        System.out.println("Frist HashSet content: "+h_set1);
//        HashSet<String>h_set2 = new HashSet<String>();
//        h_set2.add("Red");
//        h_set2.add("Pink");
//        h_set2.add("Black");
//        h_set2.add("Orange");
//        System.out.println("Second HashSet content: "+h_set2);
//        h_set1.retainAll(h_set2);
//        System.out.println("HashSet content:");
//        System.out.println(h_set1);

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java для удаления всех элементов из набора хэшей.
         */

        //Мой вариант

//        HashSet <String> hset = new HashSet <String>();
//
//        hset.add("Red");
//        hset.add("Green");
//        hset.add("Black");
//        hset.add("White");
//        hset.add("Pink");
//
//        System.out.println("The Hash Set:\n" + hset);
//
//        hset.clear();
//        System.out.println("After removing element:\n" + hset);

        //Вариант 2

//        // Create a empty hash set
//        HashSet<String> h_set = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        System.out.println("Original hash set contains: "+ h_set);
//        //  clear() method removes all the elements from a hash set
//        // and the set becomes empty.
//        h_set.clear();
//
//        // Display original hash set content again
//        System.out.println("HashSet content: "+h_set);
    }
}
