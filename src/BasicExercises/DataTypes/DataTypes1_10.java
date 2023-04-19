package BasicExercises.DataTypes;

import java.util.ArrayList;
import java.util.Collections;
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

//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the time zone offset to GMT: ");
//        long timeZoneChange = input.nextInt();
//        long totalMilliseconds = System.currentTimeMillis();
//        long totalSeconds = totalMilliseconds / 1000;
//        long currentSecond = totalSeconds % 60;
//        long totalMinutes = totalSeconds / 60;
//        long currentMinute = totalMinutes % 60;
//        long totalHours = totalMinutes / 60;
//        long currentHour = ((totalHours + timeZoneChange) % 24);
//        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

        System.out.println("Exercise 6");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input weight in pounds: ");
//        double weight = sc.nextDouble();
//        System.out.println("Input height in inches: ");
//        double height = sc.nextDouble();
//        double BMI = (weight / Math.pow(height, 2)) * 703;
//        System.out.println("BMI: " + BMI);

        //Вариант 2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input weight in pounds: ");
//        double weight = input.nextDouble();
//        System.out.print("Input height in inches: ");
//        double inches = input.nextDouble();
//        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
//        System.out.print("Body Mass Index is " + BMI+"\n");

        System.out.println("Exercise 7");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the distance in meters: ");
//        double distance = sc.nextDouble();
//        System.out.println("Enter hours: ");
//        double hours = sc.nextDouble();
//        System.out.println("Enter minutes: ");
//        double minutes = sc.nextDouble();
//        System.out.println("Enter seconds: ");
//        double seconds = sc.nextDouble();
//
//        double justSeconds = hours * 3600 + minutes * 60 + seconds;
//
//        double metPerSec = distance / justSeconds;
//        double kilPerHour = (distance / 1000) / (justSeconds / 3600);
//        double milPerHour = kilPerHour / 1.609;
//
//        System.out.print("metPerSec: " + metPerSec + "\n" + "kilPerHour: " + kilPerHour + "\n" + "milPerHour: " + milPerHour + "\n");

        //Вариант 2
//        Scanner scanner = new Scanner(System.in);
//        float timeSeconds;
//        float mps,kph, mph;
//        System.out.print("Input distance in meters: ");
//        float distance = scanner.nextFloat();
//        System.out.print("Input hour: ");
//        float hr = scanner.nextFloat();
//        System.out.print("Input minutes: ");
//        float min = scanner.nextFloat();
//        System.out.print("Input seconds: ");
//        float sec = scanner.nextFloat();
//        timeSeconds = (hr*3600) + (min*60) + sec;
//        mps = distance / timeSeconds;
//        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
//        mph = kph / 1.609f;
//        System.out.println("Your speed in meters/second is "+mps);
//        System.out.println("Your speed in km/h is "+kph);
//        System.out.println("Your speed in miles/h is "+mph);
//
//        scanner.close();

        System.out.println("Exercise 8");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the side length value: ");
//        double num = sc.nextInt();
//
//        double square = Math.pow(num, 2);
//        double cube = Math.pow(num, 3);
//        double fourthDegree = Math.pow(num, 4);
//
//        System.out.println("Square: " + square + "\n" + "Cube: " + cube + "\n" + "Fourth Degree: " + fourthDegree);

        //Вариант 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the side length value: ");
//        double val = in.nextDouble();
//        System.out.printf("Square: %12.2f\n", val * val);
//        System.out.printf("Cube: %14.2f\n", val * val * val);
//        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));

        System.out.println("Exercise 9");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first integer: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second integer: ");
//        int num2 = sc.nextInt();
//
//        System.out.printf("Sum of two integers: %d%n", num1 + num2);
//        System.out.printf("Difference of two integers: %d%n", num1 - num2);
//        System.out.printf("Product of two integers: %d%n", num1 * num2);
//        System.out.printf("Average of two integers: %.2f%n", (double) (num1 + num2) / 2);
//        System.out.printf("Distance of two integers: %d%n", Math.abs(num1 - num2));
//        System.out.printf("Max integer: %d%n", Math.max(num1, num2));
//        System.out.printf("Min integer: %d%n", Math.min(num1, num2));

        System.out.println("Exercise 10");

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter six non-negative digits: ");
//        int num = sc.nextInt();
//
//        splitTheNumber(num);

        //Вариант 2
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
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

//    public static int splitTheNumber(int num) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        while (num > 0) {
//            result.add(num % 10);
//            num = num / 10;
//        }
//        Collections.reverse(result);
//        System.out.println("Split number: " + result);
//        return num;
//    }
}
