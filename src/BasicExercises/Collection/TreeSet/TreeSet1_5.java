package BasicExercises.Collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1_5 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java для создания набора деревьев, добавьте несколько цветов (строк) и распечатайте набор деревьев.
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

        //Вариант 2

//        TreeSet<String> tree_set = new TreeSet<String>();
//        tree_set.add("Red");
//        tree_set.add("Green");
//        tree_set.add("Orange");
//        tree_set.add("White");
//        tree_set.add("Black");
//        System.out.println("Tree set: ");
//        System.out.println(tree_set);

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для перебора всех элементов в древовидном наборе.
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
//        // System.out.println("The TreeSet:\n" + tset);
//
//        // Iterator value = tset.iterator();
//
//        // System.out.println("The iterator values are: ");
//        // while (value.hasNext()) {
//        //   System.out.println(value.next());
//        // }
//
//        for (String str : tset) {
//            System.out.println(str + " ");
//        }

        //Вариант 2

//        TreeSet<String> tree_set = new TreeSet<String>();
//        tree_set.add("Red");
//        tree_set.add("Green");
//        tree_set.add("Orange");
//        tree_set.add("White");
//        tree_set.add("Black");
//        // Print the tree list
//        for (String element : tree_set) {
//            System.out.println(element);
//        }

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы добавить все элементы указанного набора деревьев в другой набор деревьев.
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
//        tset2.add("1");
//        tset2.add("2");
//        tset2.add("3");
//        tset2.add("4");
//        tset2.add("5");
//
//        System.out.println("The TreeSet 2:\n" + tset2);
//
//        tset.addAll(tset2);
//        System.out.println("Joined TreeSet:\n" + tset);

        //Вариант 2

//        TreeSet<String> tree_set1 = new TreeSet<String>();
//        tree_set1.add("Red");
//        tree_set1.add("Green");
//        tree_set1.add("Orange");
//        System.out.println("Tree set1: "+tree_set1);
//        TreeSet<String> tree_set2 = new TreeSet<String>();
//        tree_set2.add("Pink");
//        tree_set2.add("White");
//        tree_set2.add("Black");
//        System.out.println("Tree set2: "+tree_set2);
//        // adding treetwo to treeone
//        tree_set1.addAll(tree_set2);
//        System.out.println("Tree set1: "+tree_set1);

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для создания представления в обратном порядке элементов, содержащихся в заданном наборе деревьев.
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
//        Iterator<String> iterator = tset.descendingIterator();
//        System.out.print("TreeSet in reverse order:\n");
//
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

        //Вариант 2

//        // create an empty tree set
//        TreeSet<String> t_set = new TreeSet<String>();
//        // use add() method to add values in the tree set
//        t_set.add("Red");
//        t_set.add("Green");
//        t_set.add("Black");
//        t_set.add("Pink");
//        t_set.add("orange");
//        // print original list
//        System.out.println("Original tree set:" + t_set);
//        Iterator it = t_set.descendingIterator();
//        // Print list elements in reverse order
//        System.out.println("Elements in Reverse Order:");
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы получить первый и последний элементы в наборе дерева.
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
//        System.out.println("The first element is:\n" + tset.first());
//        System.out.println("The last element is:\n" + tset.last());

        //Вариант 2

//        TreeSet<String> tree_set = new TreeSet<String>();
//        tree_set.add("Red");
//        tree_set.add("Green");
//        tree_set.add("Orange");
//        tree_set.add("White");
//        tree_set.add("Black");
//        System.out.println("Tree set: ");
//        System.out.println(tree_set);
//
//        // Find first element of the tree set
//        Object first_element = tree_set.first();
//        System.out.println("First Element is: "+first_element);
//
//        // Find last element of the tree set
//        Object last_element = tree_set.last();
//        System.out.println("Last Element is: "+last_element);
    }
}
