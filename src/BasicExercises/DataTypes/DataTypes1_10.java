package BasicExercises.DataTypes;

import java.util.Scanner;

public class DataTypes1_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter degrees Fahrenheit: ");
//        int Num1 = sc.nextInt();
//
//        int c = 0;
//
//        System.out.println(Num1 + " degrees Fahrenheit equals " + convDegrees(Num1, c) + " Celsius");

        //Вариант 2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input a degree in Fahrenheit: ");
//        double fahrenheit = input.nextDouble();
//        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
//        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        System.out.println("Exercise 2");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number in inches: ");
//        double Inch = sc.nextDouble();
//        double Metre = Inch / 39.37;
//        System.out.println(Inch + " an inch is equal to " + Metre + " meters");

        //Вариант 2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input a value for inch: ");
//        double inch = input.nextDouble();
//        double meters = inch * 0.0254;
//        System.out.println(inch + " inch is " + meters + " meters");

        System.out.println("Exercise 3");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer from 0 to 1000: ");
//        long num1 = sc.nextLong();
//        System.out.println("The sum of the digits is: " + sumDigits(num1));

        System.out.println("Exercise 4");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of minutes: ");
//        int minutes = sc.nextInt();
//        int year = minutes / 525600;
//        int remainingMinutes = minutes % 525600;
//        int day = remainingMinutes / 1440;
//
//        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");

        //Вариант 2
//        double minutesInYear = 60 * 24 * 365;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the number of minutes: ");
//        double min = input.nextDouble();
//        long years = (long) (min / minutesInYear);
//        int days = (int) (min / 60 / 24) % 365;
//        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

        System.out.println("Exercise 5");

        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

//    public static int convDegrees(int Num1, int c) {
//
//        c = (Num1 - 32) * 5 / 9;
//        return c;
//    }

//    public static int sumDigits(long num1) {
//        int sum = 0;
//        while (num1 != 0) {
//            sum += num1 % 10;
//            num1 /= 10;
//        }
//        return sum;
//    }
}
