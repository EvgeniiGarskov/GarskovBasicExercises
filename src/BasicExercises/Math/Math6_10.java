package BasicExercises.Math;

import java.util.Scanner;

public class Math6_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java, которая реверсирует целое число.
         */

        //Мой вариант

//        int n = 4526;
//        System.out.println("Number is "+ n);
//        System.out.print("Reversed Number is "+ reverse(n));
//        }
//        static int reverse(int n) {
//
//            int rev = 0; // reversed number
//            int rem;   // remainder
//
//            while(n>0){
//                rem = n%10;
//                rev = (rev*10) + rem;
//                n = n/10;
//            }
//            return rev;

        //Вариант 2

//        int num =1287;
//        int is_positive = 1;
//        if (num < 0) {
//            is_positive = -1;
//            num = -1 * num;
//        }
//        int sum  = 0;
//        while (num > 0) {
//            int r = num % 10;
//
//            int maxDiff = Integer.MAX_VALUE - sum * 10;
//            if (sum > Integer.MAX_VALUE / 10 || r > maxDiff)
//                System.out.println("Wrong number");;
//
//            sum = sum * 10 + r;
//            num /= 10;
//        }
//        System.out.println(is_positive * sum);

        System.out.println("Exercise 7");

        /*
        Напишите программу Java для преобразования римского числа в целое число.
         */

//        String str = "DCCVII";
//        int len = str.length();
//
//        str = str + " ";
//        int result = 0;
//        for (int i = 0; i < len; i++) {
//            char ch   = str.charAt(i);
//            char next_char = str.charAt(i+1);
//
//            if (ch == 'M') {
//                result += 1000;
//            } else if (ch == 'C') {
//                if (next_char == 'M') {
//                    result += 900;
//                    i++;
//                } else if (next_char == 'D') {
//                    result += 400;
//                    i++;
//                } else {
//                    result += 100;
//                }
//            } else if (ch == 'D') {
//                result += 500;
//            } else if (ch == 'X') {
//                if (next_char == 'C') {
//                    result += 90;
//                    i++;
//                } else if (next_char == 'L') {
//                    result += 40;
//                    i++;
//                } else {
//                    result += 10;
//                }
//            } else if (ch == 'L') {
//                result += 50;
//            } else if (ch == 'I') {
//                if (next_char == 'X') {
//                    result += 9;
//                    i++;
//                } else if (next_char == 'V') {
//                    result += 4;
//                    i++;
//                } else {
//                    result++;
//                }
//            } else { // if (ch == 'V')
//                result += 5;
//            }
//        }
//        System.out.println("\nRoman Number: "+str);
//        System.out.println("Equivalent Integer: "+result+"\n");

        System.out.println("Exercise 8");

        /*
        Напишите программу Java для преобразования целочисленного значения в абсолютное значение.
         */

        //Мой вариант

//        int n = -4526;
//        System.out.println("Number is "+ n);
//        System.out.println("The absolute value of is " + Math.abs(n));

        //Вариант 2

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input an integer number: ");
//        int x = in.nextInt();
//        System.out.printf("The absolute value of %d is: %d",x, convert (x));
//        System.out.printf("\n");
//        }
//        public static int convert (int n)
//        {
//            int absvalue = (n >= 0) ? n : -n;
//            return absvalue;

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для преобразования плавающего значения в абсолютное значение.
         */

        //Мой вариант

//        double n = -4526;
//        System.out.println("Number is " + n);
//        System.out.println("The absolute value of is " + Math.abs(n));

        //Вариант 2

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a float number: ");
//        float  x = in.nextFloat();
//        System.out.printf("The absolute value of %.2f is: %.2f",x, convert(x));
//        System.out.printf("\n");
//        }
//
//        public static float convert(float n)
//        {
//            float absvalue = (n >= 0) ? n : -n;
//            return absvalue;

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java, которая принимает значение числа с плавающей запятой и возвращает округленное значение с плавающей запятой.
        Пример данных:
        Введите число с плавающей запятой: 12,51
        Округленное значение 12,510000: 13,00
        Введите число
        с плавающей запятой: 12,49999 Округленное значение 12,499990: 12,00
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a float number: ");
//        float  x = in.nextFloat();
//        System.out.printf("The rounded value of %f is: %.2f",x, round_num(x));
//        System.out.printf("\n");
//        }
//
//        public static float round_num(float fn)
//        {
//            float f_num = (float)Math.floor(fn);
//            float c_num = (float)Math.ceil(fn);
//            if ((fn - f_num) > (c_num - fn))
//            {
//                return c_num;
//            }
//            else if ((c_num - fn) > (fn - f_num))
//            {
//                return f_num;
//            }
//            else
//            {
//                return c_num;
//            }
    }
}
