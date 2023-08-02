package BasicExercises.Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1_6 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java, чтобы добавить указанный элемент в конец набора хэшей.
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
//
//        // print the hash set
//        System.out.println("The Hash Set: " + h_set);

        System.out.println("Exercise 2");

        /*
        Напишите программу Java для перебора всех элементов в хэш-списке.
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
//        Iterator value = hset.iterator();
//
//        System.out.println("The iterator values are: ");
//        while (value.hasNext()) {
//            System.out.println(value.next());
//        }
//
//        // for (String str : hset) {
//        //   System.out.print(str + " ");
//        // }

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
//
//        // set Iterator
//        Iterator<String> p = h_set.iterator();
//        // Iterate the hash set
//        while (p.hasNext()) {
//            System.out.println(p.next());
//        }

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы получить количество элементов в хэш-наборе.
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
//        // System.out.println("The Hash Set: " + hset);
//
//        System.out.println("The Hash Set size: " + hset.size());

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
//        System.out.println("Size of the Hash Set: " + h_set.size());

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для очистки набора хэшей.
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
//        // hset.clear();
//        hset.removeAll(hset);
//        System.out.println("After removing element: " + hset);

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
//        // Remove all elements
//        h_set.removeAll(h_set);
//        System.out.println("Hash Set after removing all the elements "+h_set);

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы проверить, является ли набор хэшей пустым или нет.
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
//        boolean emp = hset.isEmpty();
//
//        if (emp == true) {
//            System.out.println("The HashSet is empty");
//        } else {
//            System.out.println("The HashSet is not empty");
//        }

        //Вариант 2

//        // Create a empty hash set
//        HashSet<String> h_set = new HashSet();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        h_set.add("Pink");
//        h_set.add("Yellow");
//        System.out.println("Original Hash Set: " + h_set);
//        System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
//        System.out.println("Remove all the elements from a Hash Set: ");
//        h_set.removeAll(h_set);
//        System.out.println("Hash Set after removing all the elements "+h_set);

        System.out.println("Exercise 6");

        /*
        Напишите программу Java для клонирования набора хэшей в другой набор хэшей.
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
//        HashSet sec_list = new HashSet();
//        sec_list = (HashSet) hset.clone();
//        System.out.println("Second HashSet is:\n" + sec_list);

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
//        HashSet <String> new_h_set = new HashSet <String> ();
//        new_h_set = (HashSet)h_set.clone();
//        System.out.println("Cloned Hash Set: " + new_h_set);
    }
}
