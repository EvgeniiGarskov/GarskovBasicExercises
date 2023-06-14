package BasicExercises.Number;

import java.util.Scanner;

import static java.util.stream.LongStream.rangeClosed;

public class Number1_29 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java, чтобы проверить, является ли заданное число уродливым.

        В системе счисления уродливые числа — это положительные числа, единственными простыми делителями
        которых являются 2, 3 или 5. Первые 10 уродливых чисел — это 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. По соглашению, 1 — это включены.

        Тестовые данные: введите целое число: 235
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//
//        if (isUgly3(num)) {
//            System.out.println("An ugly number");
//        } else {
//            System.out.println("Not an ugly number");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input an integer number: ");
//        int n = in.nextInt();
//        if (n <= 0) {
//            System.out.print("Input a correct number.");
//        }
//        int x = 0;
//        while (n != 1) {
//            if (n % 5 == 0) {
//                n /= 5;
//            } else if (n % 3 == 0) {
//                n /= 3;
//            } else if (n % 2 == 0) {
//                n /= 2;
//            } else {
//                System.out.print("It is not an ugly number.");
//                x = 1;
//                break;
//            }
//        }
//        if (x==0)
//            System.out.print("It is an ugly number.");
//        System.out.print("\n");

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java, которая классифицирует целые числа от 1 до 10 000 как обильные, недостаточные и совершенные.

        В теории чисел обильное число — это число, для которого сумма его собственных делителей больше, чем само число.
        Пример:
        Первые несколько избыточных чисел:
        12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96. , 100, 102,…
        Целое число 12 — первое распространенное число. Его собственными делителями являются 1, 2, 3, 4 и 6, всего 16.
        Неполноценное число: в теории чисел неполноценное число — это число n, для которого сумма делителей σ(n)<2n, или,
        что то же самое, сумма собственных делителей (или сумма аликвот) s(n)<n. Значение 2n − σ(n) (или n − s(n)) называется недостатком числа.
        Например, делителями числа 21 являются 1, 3 и 7, а их сумма равна 11. Поскольку 11 меньше 21, число 21 является недостаточным.
        Его дефицит равен 2 × 21 − 32 = 10.
        Первые несколько недостающих чисел:
        1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 21, 22, 23, 25, 26, 27, 29, 31, 32, 33, …….
        Совершенное число: в системе счисления совершенное число — это положительное целое число, равное
        сумме его собственных положительных делителей, то есть сумме его положительных делителей, исключая само число.
        Соответственно, совершенное число — это число, которое составляет половину суммы всех своих положительных
        делителей (включая само себя), т. е. σ1(n) = 2n.
        Первое совершенное число — 6. Его собственные делители — 1, 2 и 3, а 1 + 2 + 3 = 6. Эквивалентно, число 6
        равно половине суммы всех его положительных делителей: ( 1 + 2 + 3 + 6 ) / 2 = 6. Следующее совершенное
        число 28 = 1 + 2 + 4 + 7 + 14. За ним следуют совершенные числа 496 и 8128.
         */

//        int count_Deficient_no = 0;
//        int count_Perfect_no = 0;
//        int count_Abundant_no = 0;
//
//        for (long i = 1; i <= 10_000L; i++) {
//            long sum = proper_Divs_Sum(i);
//            if (sum < i)
//                count_Deficient_no++;
//            else if (sum == i)
//                count_Perfect_no++;
//            else
//                count_Abundant_no++;
//        }
//        System.out.println("Number Counting [(integers) between 1 to 10,000]: ");
//        System.out.println("Deficient number: " + count_Deficient_no);
//        System.out.println("Perfect number: " + count_Perfect_no);
//        System.out.println("Abundant number: " + count_Abundant_no);

        System.out.println("Exercise 3");

        /*
        Напишите программу Java для генерации случайных целых чисел в определенном диапазоне.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number 1");
//        int num = sc.nextInt();
//        System.out.println("Enter a number 2");
//        int num2 = sc.nextInt();
//
//        System.out.printf("Random number in the range from %d to %d: %d", num, num2, random(num, num2));

        //Вариант 2
//        Scanner sc = new Scanner( System.in );
//        System.out.print("Input the starting number of the range: ");
//        int rsnum = sc.nextInt();
//        System.out.print("Input the ending number of the range: ");
//        int renum = sc.nextInt();
//        int random_num = rsnum + (int)(Math.random() * ((renum - rsnum) + 1));
//        System.out.println(random_num);
    }
    //Упражнение 1
//    public static boolean isUgly3 (int num) {
//        if (num > 0) {
//            while (num % 2 == 0) {
//                num /= 2;
//            }
//            while (num % 3 == 0) {
//                num /= 3;
//            }
//            while (num % 5 == 0) {
//                num /= 5;
//            }
//        }
//        return num == 1;
//    }

    //Упражнение 2
//    public static Long proper_Divs_Sum(long num) {
//        return rangeClosed(1, (num + 1) / 2).filter(i -> num % i == 0 && num != i).sum();
//    }

    //Упражнение 3
//    public static int random (int num, int num2) {
//        return (int) (Math.random() * num2) + num;
//    }
}
