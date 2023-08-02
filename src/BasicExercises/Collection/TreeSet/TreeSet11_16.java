package BasicExercises.Collection.TreeSet;

import java.util.TreeSet;

public class TreeSet11_16 {

    public static void main(String[] args) {

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java, чтобы получить элемент в дереве, который меньше или равен заданному элементу.
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
//        int value = tset.floor(25);
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
//        System.out.println("Less than or equal to 86 : "+tree_num.floor(86));
//        System.out.println("Less than or equal to 29 : "+tree_num.floor(29));

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы получить элемент в наборе дерева, строго больший или равный заданному элементу.
         */

        //Мой вариант

//        TreeSet <Integer> tset = new TreeSet <Integer>();
//
//        tset.add(10);
//        tset.add(12);
//        tset.add(30);
//        tset.add(40);
//        tset.add(50);
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        System.out.println(tset.higher(10));

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
//        System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
//        System.out.println("Strictly greater than 31 : "+tree_num.higher(31));

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java, чтобы получить элемент в наборе деревьев, который имеет меньшее значение, чем заданный элемент.
         */

        //Мой вариант

//        TreeSet <Integer> tset = new TreeSet <Integer>();
//
//        tset.add(10);
//        tset.add(12);
//        tset.add(30);
//        tset.add(40);
//        tset.add(50);
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        System.out.println(tset.lower(12));

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
//        System.out.println("Strictly less than 69 : "+tree_num.lower(69));
//        System.out.println("Strictly less than 12 : "+tree_num.lower(12));

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java для извлечения и удаления первого элемента набора деревьев .
         */

        //Мой вариант

//        TreeSet <Integer> tset = new TreeSet <Integer>();
//
//        tset.add(10);
//        tset.add(12);
//        tset.add(30);
//        tset.add(40);
//        tset.add(50);
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        System.out.println("First lowest element " + "removed is:\n" + tset.pollFirst());
//        System.out.println("After removing element" + " from TreeSet:\n" + tset);

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
//        System.out.println("Original tree set: "+tree_num);
//        System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
//        System.out.println("Tree set after removing first element: "+tree_num);

        System.out.println("Exercise 15");

        /*
        Напишите программу на Java для извлечения и удаления последнего элемента набора деревьев.
         */

        //Мой вариант

//        TreeSet <Integer> tset = new TreeSet <Integer>();
//
//        tset.add(10);
//        tset.add(12);
//        tset.add(30);
//        tset.add(40);
//        tset.add(50);
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        System.out.println("The Last element of the set:\n" + tset.pollLast());
//        System.out.println("Contents of the set after pollLast:\n" + tset);

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
//        System.out.println("Original tree set: "+tree_num);
//        System.out.println("Removes the last element: "+tree_num.pollLast());
//        System.out.println("Tree set after removing last element: "+tree_num);

        System.out.println("Exercise 16");

        /*
        Напишите программу на Java для удаления заданного элемента из набора деревьев.
         */

        //Мой вариант

//        TreeSet <Integer> tset = new TreeSet <Integer>();
//
//        tset.add(10);
//        tset.add(12);
//        tset.add(30);
//        tset.add(40);
//        tset.add(50);
//
//        System.out.println("The TreeSet:\n" + tset);
//
//        tset.remove(12);
//        System.out.println("New TreeSet after removing:\n" + tset);

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
//        System.out.println("Original tree set: "+tree_num);
//        System.out.println("Removes 70 from the list: "+tree_num.remove(70));
//        System.out.println("Tree set after removing last element: "+tree_num);
    }
}
