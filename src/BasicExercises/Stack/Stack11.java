package BasicExercises.Stack;

import java.util.Collections;
import java.util.Stack;

public class Stack11 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для поворота элементов стека в правильном направлении.
         */

        //Мой вариант

//        Stack <String> stack = new Stack();
//
//        stack.push("Red");
//        stack.push("Green");
//        stack.push("Black");
//
//
//        System.out.println("Original stack:\n" + stack);
//
//        // Вращение списка на 1
//        Collections.rotate(stack, 1);
//
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
//            // сохранение последнего элемента в списке
//            String temp = stack.get(2);
//
//            // пройдитесь по списку и переместите элементы вправо
//            for (int j = 2; j > 0; j--) {
//                stack.set(j, stack.get(j - 1));
//            }
//            stack.set(0, temp);
//        }
//
//
//        // System.out.println("Stack After Rotation:\n" + Arrays.toString(stack.toArray()));
//        System.out.println("Stack After Rotation:\n" + stack);
    }
}
