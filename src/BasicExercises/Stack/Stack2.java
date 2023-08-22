package BasicExercises.Stack;

import java.util.Stack;
import java.io.*;
import java.util.*;

public class Stack2 {

//    // Эта функция возвращает отсортированный стек
//    public static Stack<Integer> sortstack(Stack<Integer>input) {
//        Stack<Integer> tmpStack = new Stack<Integer>();
//        while(!input.isEmpty()) {
//            // извлеките первый элемент
//            int tmp = input.pop();
//
//            // пока временный стек не пуст и
//            // верхняя часть стека меньше временной
//            while(!tmpStack.isEmpty() && tmpStack.peek() < tmp) {
//                // извлеките из временного стека и
//                // переместите его во входной стек
//                input.push(tmpStack.pop());
//            }
//            // поместить temp во временную часть стека
//            tmpStack.push(tmp);
//        }
//        return tmpStack;
//    }

    public static void main(String[] args) {

        /*
        Напишите программу на Java для сортировки элементов заданного стека в порядке возрастания.
         */

//        Stack<Integer> input = new Stack<Integer>();
//        input.add(34);
//        input.add(3);
//        input.add(31);
//        input.add(98);
//        input.add(92);
//        input.add(23);
//
//        // Это временный стек
//        Stack<Integer> tmpStack=sortstack(input);
//        System.out.println("Sorted numbers are:");
//
//        while (!tmpStack.empty()) {
//            System.out.print(tmpStack.pop()+" ");
//        }
    }
}
