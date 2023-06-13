package BasicExercises.Method;

import java.util.Scanner;

public class Method1_23 {

    //Упражнение 11
//    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите метод Java, чтобы найти наименьшее число среди трех чисел.

        Тестовые данные:
        Введите первое число: 25
        Введите второе число: 37
        Введите третье число: 29
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter the second number: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Enter the third number: ");
//        double num3 = sc.nextDouble();
//
//        System.out.println("The smallest number: " + checkMin(num1, num2, num3));

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double x = in.nextDouble();
//        System.out.print("Input the Second number: ");
//        double y = in.nextDouble();
//        System.out.print("Input the third number: ");
//        double z = in.nextDouble();
//        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );

        System.out.println("Exercise 2");

        /*
        Напишите метод Java для вычисления среднего значения трех чисел.

        Тестовые данные:
        Введите первое число: 25
        Введите второе число: 45
        Введите третье число: 65
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter the second number: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Enter the third number: ");
//        double num3 = sc.nextDouble();
//
//        System.out.println("Average value: " + averageValue(num1, num2, num3));

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double x = in.nextDouble();
//        System.out.print("Input the second number: ");
//        double y = in.nextDouble();
//        System.out.print("Input the third number: ");
//        double z = in.nextDouble();
//        System.out.print("The average value is " + average(x, y, z)+"\n" );

        System.out.println("Exercise 3");

        /*
        Напишите метод Java для отображения среднего символа строки.

        Примечание: а) Если длина строки нечетная, будет два средних символа.
        б) Если длина строки четная, будет один средний символ.

        Тестовые данные:
        введите строку: 350
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a string: ");
//        String str = in.nextLine();
//        System.out.print("The middle character in the string: " + middle(str)+"\n");

        System.out.println("Exercise 4");

        /*
        Напишите метод Java для подсчета всех гласных в строке.

        Образец решения:

        Тестовые данные:
        введите строку: w3resource
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the string: ");
//        String str = in.nextLine();
//
//        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");

        System.out.println("Exercise 5");

        /*
        Напишите метод Java для подсчета всех слов в строке.

        Тестовые данные:
        Введите строку: Быстрая коричневая лиса перепрыгивает через ленивую собаку.
        Test Data:
        Input the string: The quick brown fox jumps over the lazy dog.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the line: ");
//        String str = sc.nextLine();
//
//        System.out.println("Number of words per line: " + countingWords(str));

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the string: ");
//        String str = in.nextLine();
//
//        System.out.print("Number of words in the string: " + count_Words(str)+"\n");

        System.out.println("Exercise 6");

        /*
        Напишите метод Java для вычисления суммы цифр в целом числе.

        Тестовые данные:
        введите целое число: 25
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//
//        System.out.println("The sum of the digits of the number: " + sumDigits(num));

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input an integer: ");
//        int digits = in.nextInt();
//        System.out.println("The sum is " + sumDigits(digits));

        System.out.println("Exercise 7");

        /*
        Напишите метод Java для отображения первых 50 пятиугольных чисел.

        Пятиугольное число — это фигурное число, которое расширяет понятие треугольных и квадратных чисел
        до пятиугольника, но, в отличие от первых двух, узоры, участвующие в построении пятиугольных чисел,
        не являются осесимметричными.
         */

        //Мой вариант
//        int num = 50;
//
//        pentagonal (num);

        //Вариант 2
//        int count = 1;
//        for(int i = 1; i <= 50; i++) {
//            System.out.printf("%-6d", getPentagonalNumber(i));
//            if (count % 10 == 0) System.out.println();
//            count++;
//        }

        System.out.println("Exercise 8");

        /*
        Напишите метод Java для вычисления будущей стоимости инвестиций при заданной процентной ставке в течение определенного количества лет.

        Пример данных (ежемесячно):
        Введите сумму инвестиции: 1000
        Введите процентную ставку: 10
        Введите количество лет: 5
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the investment amount: ");
//        double investment = in.nextDouble();
//        System.out.print("Input the rate of interest: ");
//        double rate = in.nextDouble();
//        System.out.print("Input number of years: ");
//        int year = in.nextInt();
//
//        rate *= 0.01;
//
//        System.out.println("Years    FutureValue");
//        for(int i = 1; i <= year; i++) {
//            int formatter = 19;
//            if (i >= 10) formatter = 18;
//            System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
//        }

        System.out.println("Exercise 9");

        /*
        Напишите метод Java для печати символов между двумя символами (т.е. от A до P).

        Примечание. Печатает по 20 символов в строке.
         */

//        print_Chars('(', 'z', 20);

        System.out.println("Exercise 10");

        /*
        Напишите метод Java, чтобы проверить, является ли год (целое число), введенный пользователем, високосным или нет.
         */

        //Мой вариант
//        int year = 2017;
//
//        checkLeapYear(year);

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a year: ");
//        int year = in.nextInt();
//
//        System.out.println(is_LeapYear(year));

        System.out.println("Exercise 11");

        /*
        Напишите метод Java, чтобы проверить, является ли строка допустимым паролем.

        Правила пароля:
        пароль должен содержать не менее десяти символов.
        Пароль состоит только из букв и цифр.
        Пароль должен содержать не менее двух цифр.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.print(
//                "1. Пароль должен содержать не менее восьми символов\n"+
//                        "2. Пароль состоит только из букв и цифр\n"+
//                        "3. Пароль должен содержать как минимум две цифры\n"+
//                        "Enter a password: ");
//        String pass = sc.nextLine();
//
//        checkPass(pass);

        //Вариант 2
//        Scanner input = new Scanner(System.in);
//        System.out.print(
//                "1. A password must have at least eight characters.\n" +
//                        "2. A password consists of only letters and digits.\n" +
//                        "3. A password must contain at least two digits \n" +
//                        "Input a password (You are agreeing to the above Terms and Conditions.): ");
//        String s = input.nextLine();
//
//        if (is_Valid_Password(s)) {
//            System.out.println("Password is valid: " + s);
//        } else {
//            System.out.println("Not a valid password: " + s);
//        }

        System.out.println("Exercise 12");

        /*
        Напишите метод Java (принимает n в качестве входных данных) для отображения матрицы n на n.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//
//        matrix(num);

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//        int n = in.nextInt();
//        printMatrix(n);

        System.out.println("Exercise 13");

        /*
        Напишите методы Java для вычисления площади треугольника.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter length 1: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter length 2: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Enter length 3: ");
//        double num3 = sc.nextDouble();
//
//        System.out.println("The area of the triangle: " + square(num1, num2, num3));

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input Side-1: ");
//        double side1 = in.nextDouble();
//        System.out.print("Input Side-2: ");
//        double side2 = in.nextDouble();
//        System.out.print("Input Side-3: ");
//        double side3 = in.nextDouble();
//        System.out.println( is_Valid(side1, side2,side3) ?
//                "The area of the triangle is " + area_triangle(side1, side2, side3) : "Invalid triangle" );

        System.out.println("Exercise 14");

        /*
        Напишите метод Java для создания площади пятиугольника.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of sides: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter the side: ");
//        double num2 = sc.nextDouble();
//
//        System.out.println("The area of the pentagon: " + square(num1, num2));

        //Вариант 2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the number of sides: ");
//        int n = input.nextInt();
//        System.out.print("Input the side: ");
//        double side = input.nextDouble();
//
//        System.out.println("The area of the pentagon is " + pentagon_area(n, side));
    }
    //Упражнение 1
//    public static double checkMin (double num1, double num2, double num3) {
//        double a = 0;
//        if (num1 < num2 && num1 < num3) {
//            a = num1;
//        } else if (num2 < num1 && num2 < num3) {
//            a = num2;
//        } else {
//            a = num3;
//        }
//        return a;
//    }

//    public static double smallest(double x, double y, double z) {
//        return Math.min(Math.min(x, y), z);
//    }

    //Упражнение 2
//    public static double averageValue (double num1, double num2, double num3) {
//        return ((num1 + num2 + num3) / 3);
//    }

//    public static double average(double x, double y, double z)
//    {
//        return (x + y + z) / 3;
//    }

    //Упражнение 3
//    public static String middle(String str) {
//        int position;
//        int length;
//        if (str.length() % 2 == 0) {
//            position = str.length() / 2 - 1;
//            length = 2;
//        }
//        else {
//            position = str.length() / 2;
//            length = 1;
//        }
//        return str.substring(position, position + length);
//    }

    //Упражнение 4
//    public static int count_Vowels(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
//                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                count++;
//            }
//        }
//        return count;
//    }

    //Упражнение 5
//    public static int countingWords (String str) {
//        int blockCount = str.split(" ").length;
//        return blockCount;
//    }

//    public static int count_Words(String str) {
//        int count = 0;
//        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ' ') {
//                    count++;
//                }
//            }
//            count = count + 1;
//        }
//        return count; // returns 0 if string starts or ends with space " ".
//    }

    //Упражнение 6

//    public static int sumDigits (int num) {
//        int sum = 0;
//        while ( num != 0) {
//            sum += (num % 10);
//            num/=10;
//        }
//        return sum;
//    }

//    public static int sumDigits(long n) {
//        int result = 0;
//
//        while(n > 0) {
//            result += n % 10;
//            n /= 10;
//        }
//
//        return result;
//    }

    //Упражнение 7
//    public static void pentagonal (int num) {
//        int pentagonal = 0;
//        System.out.println("Pentagonal numbers are : ");
//        for (int n = 1; n <= num; n++) {
//            pentagonal = (n * (3 * n - 1)) / 2;
//            System.out.print(pentagonal + " ");
//        }
//    }

//    public static int getPentagonalNumber(int i) {
//        return (i * (3 * i - 1))/2;
//    }

    //Упражнение 8
//    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
//        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
//    }

    //Упражнение 9
//    public static void print_Chars(char char1, char char2, int n) {
//        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
//            System.out.print(char1 + " ");
//            if (ctr % n == 0) System.out.println("");
//        }
//        System.out.print("\n");
//    }

    //Упражнение 10
//    public static void checkLeapYear (int year) {
//        System.out.println("Year : " + year);
//        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//            System.out.println("Leap year");
//        } else {
//            System.out.println("A normal year");
//        }
//    }

//    public static boolean is_LeapYear(int y)
//    {
//        boolean a = (y % 4) == 0;
//        boolean b = (y % 100) != 0;
//        boolean c = ((y % 100 == 0) && (y % 400 == 0));
//
//        return a && (b || c);
//    }

    //Упражнение 11
//    public static void checkPass(String pass) {
//        if (pass.length() < 8) {
//            System.out.println("Пароль меньше 8 символов!");
//        } else {
//            if (pass.matches("(?=.*[0-9].*[0-9]).*")){
//            } else {
//                System.out.println("Пароль не содержит двух цифр!");
//            }
//            if (pass.matches("(?=.*[A-Z]).*")){
//            } else {
//                System.out.println("Пароль не содержит заглавной буквы!");
//            }
//            if (pass.matches("(?=.*[a-z]).*(?=.*[a-z]).*")){
//            } else {
//                System.out.println("Пароль должен состоять только из букв и цифр!");
//            }
//        }
//    }

//    public static boolean is_Valid_Password(String password) {
//
//        if (password.length() < PASSWORD_LENGTH) return false;
//
//        int charCount = 0;
//        int numCount = 0;
//        for (int i = 0; i < password.length(); i++) {
//
//            char ch = password.charAt(i);
//
//            if (is_Numeric(ch)) numCount++;
//            else if (is_Letter(ch)) charCount++;
//            else return false;
//        }
//
//
//        return (charCount >= 2 && numCount >= 2);
//    }
//
//    public static boolean is_Letter(char ch) {
//        ch = Character.toUpperCase(ch);
//        return (ch >= 'A' && ch <= 'Z');
//    }
//
//
//    public static boolean is_Numeric(char ch) {
//
//        return (ch >= '0' && ch <= '9');
//    }

    //Упражнение 12
//    public static void matrix(int num){
//        int[][] array = new int[num][num];
//        for (int i = 0; i< array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 2);
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void printMatrix(int n) {
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                System.out.print((int)(Math.random() * 2) + " ");
//            }
//            System.out.println();
//        }
//    }

    //Упражнение 13
//    public static double square(double num1, double num2, double num3){
//        double p = (num1+num2+num3) / 2;
//        return Math.sqrt(p * (p-num1) * (p-num2) * (p-num3));
//    }

//    public static boolean is_Valid(double side1, double side2, double side3) {
//        if( side1 + side2 > side3 &&
//                side2 + side3 > side1 &&
//                side1 + side3 > side2) return true;
//        else return false;
//    }
//    public static double area_triangle(double side1, double side2, double side3) {
//        double area = 0;
//        double s = (side1 + side2 + side3)/2;
//        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
//        return area;
//    }

    //Упражнение 14
//    public static double square(double num1, double num2){
//        return ((num1 * num2 * num2)) / (4.0 * Math.tan(Math.PI / num1));
//    }

//    public static double pentagon_area(int n, double s) {
//        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
//    }
}
