package BasicExercises.Collection.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet6_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для клонирования списка наборов деревьев в другой набор деревьев.
         */

        //Мой вариант

//        TreeSet <String> tset = new TreeSet <String>();
//
//        tset.add("Red");
//        tset.add("Green");
//        tset.add("Black");
//        tset.add("White");
//        tset.add("Pink");
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        TreeSet cloned_set = new TreeSet();
//        cloned_set = (TreeSet)tset.clone();
//        System.out.println("The cloned TreeSet:\n" + cloned_set);

        //Вариант 2

//        // create an empty tree set
//        TreeSet<String> t_set = new TreeSet<String>();
//        // use add() method to add values in the tree set
//        t_set.add("Red");
//        t_set.add("Green");
//        t_set.add("Black");
//        t_set.add("Pink");
//        t_set.add("orange");
//
//        System.out.println("Original tree set:" + t_set);
//        TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
//        System.out.println("Cloned tree list: " + t_set);

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java, чтобы получить количество элементов в наборе деревьев.
         */

        //Мой вариант

//        TreeSet <String> tset = new TreeSet <String>();
//
//        tset.add("Red");
//        tset.add("Green");
//        tset.add("Black");
//        tset.add("White");
//        tset.add("Pink");
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        System.out.println("The size of the set is: " + tset.size());

        //Вариант 2

//        // create an empty tree set
//        TreeSet<String> t_set = new TreeSet<String>();
//        // use add() method to add values in the tree set
//        t_set.add("Red");
//        t_set.add("Green");
//        t_set.add("Black");
//        t_set.add("Pink");
//        t_set.add("orange");
//        System.out.println("Original tree set: " + t_set);
//        System.out.println("Size of the tree set: " + t_set.size());

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java для сравнения двух наборов деревьев.
         */

        //Мой вариант

//        TreeSet <String> tset = new TreeSet <String>();
//
//        tset.add("Red");
//        tset.add("Green");
//        tset.add("Black");
//        tset.add("White");
//        tset.add("Pink");
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        TreeSet <String> tset2 = new TreeSet <String>();
//
//        tset2.add("Red");
//        tset2.add("Green");
//        tset2.add("Black");
//        tset2.add("White");
//
//        System.out.println("The TreeSet 2:\n" + tset2);
//
//        // compare TreeSet with TreeSet2
//        if (tset.equals(tset2) == true) {
//            System.out.println("TreeSet are equal");
//        } else {
//            // else block execute when
//            // ArrayList are not equal
//            System.out.println();
//            System.out.println("TreeSet are not equal");
//        }

        //Вариант 2

//        // Create a empty tree set
//        TreeSet<String> t_set1 = new TreeSet<String>();
//        // use add() method to add values in the tree set
//        t_set1.add("Red");
//        t_set1.add("Green");
//        t_set1.add("Black");
//        t_set1.add("White");
//        System.out.println("Free Tree set: "+t_set1);
//
//        TreeSet<String> t_set2 = new TreeSet<String>();
//        t_set2.add("Red");
//        t_set2.add("Pink");
//        t_set2.add("Black");
//        t_set2.add("Orange");
//        System.out.println("Second Tree set: "+t_set2);
//        //comparison output in tree set
//        TreeSet<String> result_set = new TreeSet<String>();
//        for (String element : t_set1){
//            System.out.println(t_set2.contains(element) ? "Yes" : "No");
//        }

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для поиска чисел меньше 7 в древовидном наборе.
         */

//        // creating TreeSet
//        TreeSet <Integer>tree_num = new TreeSet<Integer>();
//        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
//
//        // Add numbers in the tree
//        tree_num.add(1);
//        tree_num.add(2);
//        tree_num.add(3);
//        tree_num.add(5);
//        tree_num.add(6);
//        tree_num.add(7);
//        tree_num.add(8);
//        tree_num.add(9);
//        tree_num.add(10);
//
//        // Find numbers less than 7
//        treeheadset = (TreeSet)tree_num.headSet(7);
//
//        // create an iterator
//        Iterator iterator;
//        iterator = treeheadset.iterator();
//
//        //Displaying the tree set data
//        System.out.println("Tree set data: ");
//        while (iterator.hasNext()){
//            System.out.println(iterator.next() + " ");
//        }

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java, чтобы получить элемент в наборе деревьев, который больше или равен заданному элементу.
         */

        //Мой вариант

//        TreeSet <Integer> tset = new TreeSet <Integer>();
//
//        tset.add(10);
//        tset.add(20);
//        tset.add(30);
//        tset.add(40);
//        tset.add(50);
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        int value = tset.ceiling(25);
//
//        System.out.println("Ceiling value for 25: " + value);

        //Вариант 2

//        // creating TreeSet
//        TreeSet <Integer>tree_num = new TreeSet<Integer>();
//        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
//
//        // Add numbers in the tree
//        tree_num.add(10);
//        tree_num.add(22);
//        tree_num.add(36);
//        tree_num.add(25);
//        tree_num.add(16);
//        tree_num.add(70);
//        tree_num.add(82);
//        tree_num.add(89);
//        tree_num.add(14);
//
//        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
//        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));
    }
}
