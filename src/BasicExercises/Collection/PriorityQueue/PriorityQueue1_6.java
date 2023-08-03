package BasicExercises.Collection.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue1_6 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java для создания очереди с приоритетом,
        добавьте несколько цветов (строк) и распечатайте элементы очереди с приоритетом.
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

        //Вариант 2

//        PriorityQueue<String> queue=new PriorityQueue<String>();
//        queue.add("Red");
//        queue.add("Green");
//        queue.add("Orange");
//        queue.add("White");
//        queue.add("Black");
//        System.out.println("Elements of the Priority Queue: ");
//        System.out.println(queue);

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для перебора всех элементов в очереди приоритетов.
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
//        // System.out.println("Priority Queue:\n" + pQueue);
//
//        System.out.println("Priority Queue:");
//        for (String str : pQueue) {
//            System.out.println(str);
//        }

        //Вариант 2

//        PriorityQueue<String> pq = new PriorityQueue<String>();
//        pq.add("Red");
//        pq.add("Green");
//        pq.add("Orange");
//        pq.add("White");
//        pq.add("Black");
//        System.out.println("Elements of the Priority Queue: ");
//        // iterate the Priority Queue
//        for (String element : pq) {
//            System.out.println(element);
//        }

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы добавить все элементы очереди с приоритетом в другую очередь с приоритетом.
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
//        pQueue.addAll(pQueue2);
//        System.out.println("Joined PriorityQueue:\n" + pQueue);

        //Вариант 2

//        PriorityQueue<String> queue1 = new PriorityQueue<String>();
//        queue1.add("Red");
//        queue1.add("Green");
//        queue1.add("Orange");
//        System.out.println("Priority Queue1: "+queue1);
//        PriorityQueue<String> queue2 = new PriorityQueue<String>();
//        queue2.add("Pink");
//        queue2.add("White");
//        queue2.add("Black");
//        System.out.println("Priority Queue2: "+queue2);
//        // adding queue2 to queue1
//        queue1.addAll(queue2);
//        System.out.println("New Priority Queue1: "+queue1);

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для вставки заданного элемента в очередь с приоритетом.
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
//        pQueue.offer("Grey");
//        System.out.println("Priority queue after Insertion: " + pQueue);

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
//        // Inserts the specified element into this priority queue.
//        pq1.offer("Blue");
//
//        System.out.println("The New Priority Queue: " + pq1);

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java для удаления всех элементов из очереди с приоритетом.
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
//        pQueue.clear();
//        System.out.println("After removing element:\n" + pQueue);

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
//        // Removing all the elements from the Priority Queue
//        pq1.clear();
//
//        System.out.println("The New Priority Queue: " + pq1);

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для подсчета количества элементов в очереди с приоритетом.
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
//        System.out.println("The size of the queue is:\n" + pQueue.size());

        //Вариант 2

//        // create an empty Priority Queue
//        PriorityQueue<String> pq = new PriorityQueue<String>();
//        // use add() method to add values in the Priority Queue
//        pq.add("Red");
//        pq.add("Green");
//        pq.add("Black");
//        pq.add("Pink");
//        pq.add("orange");
//        System.out.println("Priority Queue: " + pq);
//        System.out.println("Size of the Priority Queue: " + pq.size());
    }
}
