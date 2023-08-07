package BasicExercises.Math;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.*;
import java.math.*;

public class Math1_5 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java для округления результатов целочисленного деления.
         */

        //Мой вариант

//        int num1 = 216;
//        int num2 = 360;
//        int percentage = (num1 * 100) / num2;
//        System.out.println("Percentage of the number: " + percentage + "%");

        //Вариант 2

//        int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
//        int percentage_of_marks = ((tot_theory_marks + tot_practical_marks)*100)/tot_marks;
//        System.out.print("\nPercentage of Marks: "+percentage_of_marks+"%\n");

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для получения целых и дробных частей из значения типа double.
         */

        //Мой вариант

//        double value = 3.25;
//        double fractionalPart = value % 1;
//        double integralPart = value - fractionalPart;
//        System.out.println("Double: " + fractionalPart);
//        System.out.println("Fractional part: " + fractionalPart);
//        System.out.println("The whole part: " + integralPart);

        //Вариант 2

//        double value = 12.56;
//        double fractional_part = value % 1;
//        double integral_part = value - fractional_part;
//        System.out.print("\nOriginal value: "+value);
//        System.out.print("\nIntegral part: "+integral_part);
//        System.out.print("\nFractional part: "+fractional_part);
//        System.out.println();

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы проверить, является ли двойное число целым числом.
         */

        //Мой вариант

//        double value = 3.25;
//        System.out.println("Value: " + value);
//
//        if ((value % 1) == 0) {
//            System.out.println("The value is an integer");
//        } else {
//            System.out.println("The value is a double number");
//        }

        //Вариант 2

//        double d_num = 5.44444;
//        if ((d_num % 1) == 0) {
//            System.out.println("It's not a double number");
//        } else {
//            System.out.println("It's a double number");
//        }

        System.out.println("Exercise 4");

        /*
        Напишите программу Java для округления числа с плавающей запятой до указанных десятичных знаков.
         */

        //Мой вариант

//        double value = 3.25256987;
//        System.out.println("Value: " + value);
//        System.out.printf("Rounded upto 4 decimal: " + "%.4f", value);

        //Вариант 2

//        float x = 451.3256412f;
//        BigDecimal result;
//        int decimal_place = 4;
//        BigDecimal bd_num = new BigDecimal(Float.toString(x));
//        bd_num = bd_num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP);
//        System.out.printf("Original number: %.7f\n",x);
//        System.out.println("Rounded upto 4 decimal: "+bd_num);

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java для подсчета абсолютного уникального значения в массиве.
         */

//        {
//            int[] numbers = new int[] {
//                    -1, -1, 0, 2, 2, 3, 0, 1, 5, 9
//            };
//            int count = 0;
//            HashSet< Integer > set = new HashSet < Integer > ();
//
//            for (int i = 0; i < numbers.length; i++) {
//                int n = Math.abs(numbers[i]);
//                if (!set.contains(n)) {
//                    set.add(n);
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
    }
}
