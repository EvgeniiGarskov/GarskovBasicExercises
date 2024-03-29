package BasicExercises.Stack;

import java.util.Stack;

public class Stack4 {

//    // использование класса Stack для
//    // реализации стека
//    static Stack<Character> st = new Stack<>();
//
//    // Ниже приведена рекурсивная функция
//    // который вставляет элемент
//    // в самом низу стопки.
//
//    static void insert_at_bottom(char x) {
//        if (st.isEmpty()) {
//            st.push(x);
//        } else {
//            // Все элементы удерживаются в рабочем состоянии
//            // Вызываем стек до тех пор, пока мы не достигнем конца
//            // стека. Когда стек становится
//            // пусто, st.size() становится равным 0,
//            // выше, если часть выполнена и
//            // элемент вставлен внизу
//            char a = st.peek();
//            st.pop();
//            insert_at_bottom(x);
//
//            // вытолкнуть все удерживаемые элементы
//            // в стеке вызовов функций
//            // как только элемент вставлен
//            // внизу
//            st.push(a);
//        }
//    }
//
//    // Ниже приведена функция, которая
//    // переворачивает данный стек, используя
//    // insert_at_bottom()
//    static void reverse() {
//        if (st.size() > 0) {
//            // Удерживать все элементы в рабочем состоянии
//            // Вызываем стек до тех пор, пока мы
//            // не достигнем конца стека
//            char x = st.peek();
//            st.pop();
//            reverse();
//
//            // Вставить все удерживаемые элементы
//            // в стеке вызовов функций
//            // один за другим снизу
//            // наверх. Каждый элемент
//            // вставляется в нижнюю часть
//            insert_at_bottom(x);
//        }
//    }

    public static void main(String[] args) {

        /*
        Напишите программу на Java, переворачивающую элементы стека.
         */

//        // вставлять элементы в
//        // стек
//        st.push('1');
//        st.push('2');
//        st.push('3');
//        st.push('4');
//
//        System.out.println("Original Stack");
//
//        System.out.println(st);
//
//        // функция для обращения вспять
//        // стек
//        reverse();
//
//        System.out.println("Reversed Stack");
//
//        System.out.println(st);
    }
}
