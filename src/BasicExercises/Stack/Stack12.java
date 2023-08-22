package BasicExercises.Stack;

import java.util.Collections;
import java.util.Stack;

public class Stack12 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для поворота элементов стека влево.
         */

        //Мой вариант

//        Stack <String> stack = new Stack();
//
//        stack.push("Red");
//        stack.push("Green");
//        stack.push("Black");
//
//
//        // System.out.println("Original stack:\n" + Arrays.toString(stack.toArray()));
//        System.out.println("Original stack:\n" + stack);
//
//        // Вращение списка на расстоянии -1
//        Collections.rotate(stack, -1);
//
//        // System.out.println("Stack After Rotation:\n" + Arrays.toString(stack.toArray()));
//        System.out.println("Stack After Rotation:\n" + stack);

        //Мой вариант 2

//        Stack <String> stack = new Stack();
//
//        stack.push("Red");
//        stack.push("Green");
//        stack.push("Black");
//
//
//        // System.out.println("Original stack:\n" + Arrays.toString(stack.toArray()));
//        System.out.println("Original stack:\n" + stack);
//
//        // Цикл в зависимости от количества оборотов
//        for (int i = 0; i < 1; i++) {
//            // сохранение первого элемента в списке
//            String temp = stack.get(0);
//
//            // пройдитесь по списку и переместите элементы влево
//            for (int j = 0; j < 2; j++) {
//                stack.set(j, stack.get(j + 1));
//            }
//            stack.set(2, temp);
//        }
//
//
//        // System.out.println("Stack After Rotation:\n" + Arrays.toString(stack.toArray()));
//        System.out.println("Stack After Rotation:\n" + stack);
    }
}
