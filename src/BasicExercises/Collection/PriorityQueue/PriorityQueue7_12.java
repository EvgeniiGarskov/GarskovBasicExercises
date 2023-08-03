package BasicExercises.Collection.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue7_12 {

    public static void main(String[] args) {

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java для сравнения двух очередей с приоритетом.
         */

        //Мой вариант

//        PriorityQueue <String> pQueue = new PriorityQueue <String> ();
//
//        pQueue.add("Red");
//        pQueue.add("Green");
//        pQueue.add("Black");
//        pQueue.add("White");
//        pQueue.add("Pink");
//
//        System.out.println("Priority Queue:\n" + pQueue);
//
//        PriorityQueue <String> pQueue2 = new PriorityQueue <String>();
//
//        pQueue2.add("1");
//        pQueue2.add("2");
//        pQueue2.add("3");
//        pQueue2.add("4");
//        pQueue2.add("5");
//
//        System.out.println("PriorityQueue 2:\n" + pQueue2);
//
//        // compare PriorityQueue with PriorityQueue 2
//        if (pQueue.equals(pQueue2) == true) {
//            System.out.println("TreeSet are equal");
//        } else {
//            // else block execute when
//            // ArrayList are not equal
//            System.out.println();
//            System.out.println("TreeSet are not equal");
//        }

        //Вариант 2

//        // Create a empty Priority Queue
//        PriorityQueue<String> pq1 = new PriorityQueue<String>();
//        // use add() method to add values in the Priority Queue
//        pq1.add("Red");
//        pq1.add("Green");
//        pq1.add("Black");
//        pq1.add("White");
//        System.out.println("First Priority Queue: "+pq1);
//        PriorityQueue<String> pq2 = new PriorityQueue<String>();
//        pq2.add("Red");
//        pq2.add("Pink");
//        pq2.add("Black");
//        pq2.add("Orange");
//        System.out.println("Second Priority Queue: "+pq2);
//        //comparison output in Priority Queue
//        for (String element : pq1){
//            System.out.println(pq2.contains(element) ? "Yes" : "No");
//        }

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java для извлечения первого элемента очереди приоритетов.
         */

        //Мой вариант

//        PriorityQueue <String> pQueue = new PriorityQueue <String> ();
//
//        pQueue.add("Red");
//        pQueue.add("Green");
//        pQueue.add("Black");
//        pQueue.add("White");
//        pQueue.add("Pink");
//
//        System.out.println("Priority Queue:\n" + pQueue);
//
//        System.out.println("The first element of the Queue:\n" + pQueue.peek());

        //Вариант 2

//        // Create Priority Queue
//        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
//        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
//
//        // Add numbers in the Queue
//        pq1.add(10);
//        pq1.add(22);
//        pq1.add(36);
//        pq1.add(25);
//        pq1.add(16);
//        pq1.add(70);
//        pq1.add(82);
//        pq1.add(89);
//        pq1.add(14);
//        System.out.println("Original Priority Queue: "+pq1);
//        System.out.println("The first element of the Queue: "+pq1.peek());

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для извлечения и удаления первого элемента.
         */

        //Мой вариант

//        PriorityQueue <String> pQueue = new PriorityQueue <String> ();
//
//        pQueue.add("Red");
//        pQueue.add("Green");
//        pQueue.add("Black");
//        pQueue.add("White");
//        pQueue.add("Pink");
//
//        System.out.println("Priority Queue:\n" + pQueue);
//
//        System.out.println("Poll Method:\n" + pQueue.poll());
//
//        System.out.println("After Remove:\n" + pQueue);

        //Вариант 2

//        // Create Priority Queue
//        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
//        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
//        // Add numbers in the Priority Queue
//        pq1.add(10);
//        pq1.add(22);
//        pq1.add(36);
//        pq1.add(25);
//        pq1.add(16);
//        pq1.add(70);
//        pq1.add(82);
//        pq1.add(89);
//        pq1.add(14);
//        System.out.println("Original Priority Queue: "+pq1);
//        System.out.println("Removes the first element: "+pq1.poll());
//        System.out.println("Priority Queue after removing first element: "+pq1);

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java для преобразования приоритетной очереди в массив, содержащий все ее элементы.
         */

        //Мой вариант

//        PriorityQueue <String> pQueue = new PriorityQueue <String> ();
//
//        pQueue.add("Red");
//        pQueue.add("Green");
//        pQueue.add("Black");
//        pQueue.add("White");
//        pQueue.add("Pink");
//
//        System.out.println("Priority Queue:\n" + pQueue);
//
//        ArrayList<String> arrList = new ArrayList <String>(pQueue);
//        System.out.println("Priority Queue to ArrayList:\n" + arrList);

        //Вариант 2

//        // Create Priority Queue
//        PriorityQueue<String> pq1 = new PriorityQueue<String>();
//        // use add() method to add values in the Priority Queue
//        pq1.add("Red");
//        pq1.add("Green");
//        pq1.add("Black");
//        pq1.add("White");
//        System.out.println("Original Priority Queue: "+pq1);
//
//        //Convert a linked list to array list
//        List<String> array_list = new ArrayList<String>(pq1);
//        System.out.println("Array containing all of the elements in the queue: "+array_list);

        System.out.println("Exercise 11");

        /*
        Напишите программу Java для преобразования элемента Priority Queue в строковые представления.
         */

//        // Create Priority Queue
//        PriorityQueue<String> pq1 = new PriorityQueue<String>();
//        // use add() method to add values in the Priority Queue
//        pq1.add("Red");
//        pq1.add("Green");
//        pq1.add("Black");
//        pq1.add("White");
//        System.out.println("Original Priority Queue: "+pq1);
//
//        //Convert Priority Queue to a string representation
//        String str1;
//        str1 = pq1.toString();
//        System.out.println("String representation of the Priority Queue: "+str1);

        System.out.println("Exercise 12");

        /*
        Напишите программу Java, чтобы изменить priorityQueue на очередь с максимальным приоритетом.
         */

//        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
//        // Add numbers in the Queue
//        pq1.add(10);
//        pq1.add(22);
//        pq1.add(36);
//        pq1.add(25);
//        pq1.add(16);
//        pq1.add(70);
//        pq1.add(82);
//        pq1.add(89);
//        pq1.add(14);
//        System.out.println("\nOriginal Priority Queue: "+pq1);
//
//        System.out.print("\nMaximum Priority Queue: ");
//        Integer val = null;
//        while( (val = pq1.poll()) != null) {
//            System.out.print(val+"  ");
//        }
//        System.out.print("\n");
    }
}
