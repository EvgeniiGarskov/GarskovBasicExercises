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
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }

//    public static int convDegrees(int Num1, int c) {
//
//        c = (Num1 - 32) * 5 / 9;
//        return c;
//    }
}
