package BasicExercises.Conditional_operators;

import java.util.Scanner;

public class Conditional_operators1_32 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java, чтобы проверить, является ли число положительным или отрицательным.

        Тестовые данные
        Введите номер: 35
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//
//        if (num >= 0) {
//            System.out.println("Number " + num + " positive");
//        } else {
//            System.out.println("Number " + num + " negative");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int input = in.nextInt();
//        if (input > 0)
//        {
//            System.out.println("Number is positive");
//        }
//        else if (input < 0)
//        {
//            System.out.println("Number is negative");
//        }
//        else
//        {
//            System.out.println("Number is zero");
//        }

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для решения квадратных уравнений (используйте if, else if и else).

        Тестовые данные
        Введите a: 1
        Введите b: 5
        Введите c: 1
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number a: ");
//        double numA = sc.nextDouble();
//        System.out.println("Enter a number b: ");
//        double numB = sc.nextDouble();
//        System.out.println("Enter a number c: ");
//        double numC = sc.nextDouble();
//
//        double discriminant = Math.pow(numB,2) - 4 * numA * numC;
//        double root1 = (-numB - Math.sqrt(discriminant)) / 2 * numA;
//        double root2 = (-numB + Math.sqrt(discriminant)) / 2 * numA;
//        double root3 = (-numB / 2 * numA);
//
//        if (discriminant > 0) {
//            System.out.println("The first root: " + root1);
//            System.out.println("The second root: " + root2);
//        } else if (discriminant == 0) {
//            System.out.println("Two equal roots: " + root3);
//        } else {
//            System.out.println("There are no roots");
//        }

        //Вариант 2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input a: ");
//        double a = input.nextDouble();
//        System.out.print("Input b: ");
//        double b = input.nextDouble();
//        System.out.print("Input c: ");
//        double c = input.nextDouble();
//        double result = b * b - 4.0 * a * c;
//        if (result > 0.0) {
//            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
//            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
//            System.out.println("The roots are " + r1 + " and " + r2);
//        } else if (result == 0.0) {
//            double r1 = -b / (2.0 * a);
//            System.out.println("The root is " + r1);
//        } else {
//            System.out.println("The equation has no real roots.");
//        }

        System.out.println("Exercise 3");

        /*
        Возьмите три числа у пользователя и напечатайте наибольшее число.

        Тестовые данные
        Введите 1-е число: 25
        Введите 2-е число: 78
        Введите 3-е число: 87
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the 1st number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the 2nd number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the 3rd number");
//        int num3 = sc.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("The largest number: " + num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("The largest number: " + num2);
//        } else {
//            System.out.println("The largest number: " + num3);
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the 1st number: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input the 2nd number: ");
//        int num2 = in.nextInt();
//
//        System.out.print("Input the 3rd number: ");
//        int num3 = in.nextInt();
//
//
//        if (num1 > num2)
//            if (num1 > num3)
//                System.out.println("The greatest: " + num1);
//
//        if (num2 > num1)
//            if (num2 > num3)
//                System.out.println("The greatest: " + num2);
//
//        if (num3 > num1)
//            if (num3 > num2)
//                System.out.println("The greatest: " + num3);

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java, которая читает число с плавающей запятой и печатает «ноль», если число равно нулю.
        В противном случае выведите «положительный» или «отрицательный». Добавьте «маленький», если абсолютное значение числа меньше 1,
        или «большой», если он превышает 1 000 000.

        Тестовые данные
        Входное значение: 25
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        double num = sc.nextDouble();
//
//        if (num > 0) {
//            if (num > 1000000) {
//                System.out.println("A large positive number");
//            } else if (num < 1) {
//                System.out.println("A small positive number");
//            } else {
//                System.out.println("Positive number");
//            }
//        } else if (num < 0) {
//            if (Math.abs(num) > 1000000) {
//                System.out.println("A large negative number");
//            } else if (Math.abs(num) < 1) {
//                System.out.println("A small negative number");
//            } else {
//                System.out.println("Negative number");
//            }
//        } else {
//            System.out.println("Zero");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input value: ");
//        double input = in.nextDouble();
//        if (input > 0)
//        {
//            if (input < 1)
//            {
//                System.out.println("Positive small number");
//            }
//            else if (input > 1000000)
//            {
//                System.out.println("Positive large number");
//            }
//            else
//            {
//                System.out.println("Positive number");
//            }
//        }
//        else if (input < 0)
//        {
//            if (Math.abs(input) < 1)
//            {
//                System.out.println("Negative small number");
//            }
//            else if (Math.abs(input) > 1000000)
//            {
//                System.out.println("Negative large number");
//            }
//            else
//            {
//                System.out.println("Negative number");
//            }
//        }
//        else
//        {
//            System.out.println("Zero");
//        }

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, которая хранит число от пользователя и генерирует целое число от 1 до 7 и отображает название дня недели.

        Тестовые данные
        Введите номер: 3
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int dayOfWeek = sc.nextInt();
//
//        if (dayOfWeek == 1) {
//            System.out.println("Today is Monday");
//        } else if (dayOfWeek == 2) {
//            System.out.println("Today is Tuesday");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Today is Wednesday");
//        } else if (dayOfWeek == 4) {
//            System.out.println("Today is Thursday");
//        } else if (dayOfWeek == 5) {
//            System.out.println("Today is Friday");
//        } else if (dayOfWeek == 6) {
//            System.out.println("Today is Saturday");
//        } else if (dayOfWeek == 7) {
//            System.out.println("Today is Sunday");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int day = in.nextInt();
//        System.out.println(getDayName(day));

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java, которая считывает два числа с плавающей запятой и проверяет,
        являются ли они одинаковыми с точностью до трех знаков после запятой.

        Тестовые данные
        Входное число с плавающей точкой: 1256
        Введите число с плавающей точкой другого числа: 3254
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first floating point number: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter the second floating point number: ");
//        double num2 = sc.nextDouble();
//
//        double epsilon = 0.001d;
//
//        if (Math.abs(num1 - num2) < epsilon) {
//            System.out.println("The numbers are equal");
//        } else {
//            System.out.println("Not equal");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input floating-point number: ");
//        double x = in.nextDouble();
//        System.out.print("Input floating-point another number: ");
//        double y = in.nextDouble();
//        x = Math.round(x * 1000);
//        x = x / 1000;
//        y = Math.round(y * 1000);
//        y = y / 1000;
//        if (x == y)
//        {
//            System.out.println("They are the same up to three decimal places");
//        }
//        else
//        {
//            System.out.println("They are different");
//        }
    }

//    public static String getDayName(int day) {
//        String dayName = "";
//        switch (day) {
//            case 1:
//                dayName = "Monday";
//                break;
//            case 2:
//                dayName = "Tuesday";
//                break;
//            case 3:
//                dayName = "Wednesday";
//                break;
//            case 4:
//                dayName = "Thursday";
//                break;
//            case 5:
//                dayName = "Friday";
//                break;
//            case 6:
//                dayName = "Saturday";
//                break;
//            case 7:
//                dayName = "Sunday";
//                break;
//            default:
//                dayName = "Invalid day range";
//        }
//        return dayName;
//    }
}


