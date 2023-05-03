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

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java, чтобы узнать количество дней в месяце.

        Тестовые данные
        Введите номер месяца: 2
        Введите год: 2016
         */

//        Scanner input = new Scanner(System.in);
//        int number_Of_DaysInMonth = 0;
//        String MonthOfName ="Unknown";
//        System.out.print("Input a month number: ");
//        int month = input.nextInt();
//        System.out.print("Input a year: ");
//        int year = input.nextInt();
//        switch (month) {
//            case 1:
//                MonthOfName ="January";
//                number_Of_DaysInMonth = 31;
//                break;
//            case 2:
//                MonthOfName ="February";
//                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//                    number_Of_DaysInMonth = 29;
//                } else {
//                    number_Of_DaysInMonth = 28;
//                }
//                break;
//            case 3:
//                MonthOfName ="March";
//                number_Of_DaysInMonth = 31;
//                break;
//            case 4:
//                MonthOfName ="April";
//                number_Of_DaysInMonth = 30;
//                break;
//            case 5:
//                MonthOfName ="May";
//                number_Of_DaysInMonth = 31;
//                break;
//            case 6:
//                MonthOfName ="June";
//                number_Of_DaysInMonth = 30;
//                break;
//            case 7:
//                MonthOfName ="July";
//                number_Of_DaysInMonth = 31;
//                break;
//            case 8:
//                MonthOfName ="August";
//                number_Of_DaysInMonth = 31;
//                break;
//            case 9:
//                MonthOfName ="September";
//                number_Of_DaysInMonth = 30;
//                break;
//            case 10:
//                MonthOfName ="October";
//                number_Of_DaysInMonth = 31;
//                break;
//            case 11:
//                MonthOfName ="November";
//                number_Of_DaysInMonth = 30;
//                break;
//            case 12:
//                MonthOfName ="December";
//                number_Of_DaysInMonth = 31;
//        }
//        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java, в которой пользователю нужно предоставить один символ из алфавита.
        Распечатать гласный согласного, в зависимости от ввода пользователя.
        Если пользовательский ввод не является буквой (между a и z или A и Z) или является строкой длиной> 1, выведите сообщение об ошибке.

        Тестовые данные
        Введите алфавит: p
         */

        //Мой вариант
//        String vowels = "A, E, I, O, U, Y, a, e, i, o, u, y";
//        String consonants = "B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z, b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z";
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the alphabet character: ");
//        String str = sc.nextLine();
//
//        if (str.length() > 1) {
//            System.out.println("Error, enter one character!");
//        } else if (vowels.contains(str)) {
//            System.out.println("The letter is a vowel");
//        } else if (consonants.contains(str)) {
//            System.out.println("The letter is consonant");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input an alphabet: ");
//        String input = in.next().toLowerCase();
//        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
//        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                || input.equals("o") || input.equals("u");
//        if (input.length() > 1)
//        {
//            System.out.println("Error. Not a single character.");
//        }
//        else if (!(uppercase || lowercase))
//        {
//            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
//        }
//        else if (vowels)
//        {
//            System.out.println("Input letter is Vowel");
//        }
//        else
//        {
//            System.out.println("Input letter is Consonant");
//        }

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java, которая берет год от пользователя, и напечатайте, является ли этот год високосным или нет.

        Тестовые данные
        Введите год: 2016
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year: ");
//        int year = sc.nextInt();
//
//        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//            System.out.println("Leap year");
//        } else {
//            System.out.println("A normal year");
//        }

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the year: ");
//        int year = in.nextInt();
//        boolean x = (year % 4) == 0;
//        boolean y = (year % 100) != 0;
//        boolean z = ((year % 100 == 0) && (year % 400 == 0));
//        if (x && (y || z))
//        {
//            System.out.println(year + " is a leap year");
//        }
//        else
//        {
//            System.out.println(year + " is not a leap year");
//        }

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java для отображения первых 10 натуральных чисел.
         */

        //Мой вариант
//        System.out.println("The first 10 natural numbers:");
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        //Вариант 2
//        int i;
//        System.out.println ("The first 10 natural numbers are:\n");
//        for (i=1;i<=10;i++)
//        {
//            System.out.println (i);
//        }
//        System.out.println ("\n");

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java для отображения первых n натуральных чисел и их суммы.

        Тестовые данные
        Введите номер: 7
         */

        //Мой вариант
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int num = sc.nextInt();
//
//        System.out.println("First natural numbers: " + num);
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.println("Sum of natural numbers: " + sum);

        //Вариант 2
//        int i, n, sum=0;
//        {
//            Scanner in = new Scanner(System.in);
//            System.out.print("Input number: ");
//            n = in.nextInt();
//        }
//        System.out.println("The first n natural numbers are : "+n);
//
//        for(i=1;i<=n;i++)
//        {
//            System.out.println(i);
//            sum+=i;
//        }
//        System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы ввести 5 цифр с клавиатуры и найти их сумму и среднее.

        Тестовые данные
        Введите 5 цифр: 1 2 3 4 5
         */

        //Мой вариант
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 5 numbers separated by a space: ");
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//
//        System.out.println("Sum of numbers: " + (a + b + c + d + e));
//        System.out.println("Average value: " + (a + b + c + d + e) / 5);

        //Мой вариант 2
//        int sum = 0;
//        int count = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 numbers separated by a space: ");
//
//        while (sc.hasNextInt()) {
//            int num = sc.nextInt();
//            sum += num;
//            count++;
////             if (sc.hasNextInt()) {
////               System.out.print(sc.nextInt());
////             } else {
////               sc.next();
////             }
//        }
//        if (count > 0) {
//            int average = sum / count;
//            System.out.println("Sum of numbers: " + sum);
//            System.out.println("Average value: " + average);
//        } else {
//            System.out.println("No integers were entered. The average value cannot be calculated.");
//        }

        //Вариант 2
//        int i,n=0,s=0;
//        double avg;
//        {
//
//            System.out.println("Input the 5 numbers : ");
//
//        }
//        for (i=0;i<5;i++)
//        {
//            Scanner in = new Scanner(System.in);
//            n = in.nextInt();
//
//            s +=n;
//        }
//        avg=s/5;
//        System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java для отображения куба числа с точностью до целого числа.

        Тестовые данные
        Введите количество терминов: 4
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i + " in a cube: " + Math.pow(i, 3));
//        }

        //Вариант 2
//        int i,n;
//        System.out.print("Input number of terms : ");
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        for(i=1;i<=n;i++)
//        {
//            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
//        }

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java для отображения таблицы умножения заданного целого числа.

        Тестовые данные
        Введите число (Таблица для расчета): Введите число членов: 5
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int num = sc.nextInt();
//
//        for (int i = 0; i <= num; i++) {
//            System.out.println(num + " x " + i + " = " + num * i);
//        }

        //Вариант 2
//        int j,n;
//        System.out.print("Input the number(Table to be calculated): ");
//        {
//            System.out.print("Input number of terms : ");
//            Scanner in = new Scanner(System.in);
//            n = in.nextInt();
//            System.out.println ("\n");
//            for(j=0;j<=n;j++)
//
//                System.out.println(n+" X "+j+" =" +n*j);
//        }

        System.out.println("Exercise 15");

        /*
        Напишите программу на Java для отображения n нечетного натурального числа и их суммы.

        Тестовые данные
        Введите количество терминов: 5
         */

        //Мой вариант
//        int sum = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int num = sc.nextInt();
//
//        System.out.println("First " + num + " odd numbers: ");
//        for (int i = 1; i <= num; i++) {
//            System.out.println(2 * i - 1);
//            sum += (2 * i - 1);
//        }
//        System.out.println("Sum of odd numbers: " + sum);

        //Вариант 2
        int i,n,sum=0;
        System.out.print("Input number of terms is: ");
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            System.out.println ("\nThe odd numbers are :");
            for(i=1;i<=n;i++)
            {
                System.out.println (2*i-1);
                sum+=2*i-1;
            }
            System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
        }
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


