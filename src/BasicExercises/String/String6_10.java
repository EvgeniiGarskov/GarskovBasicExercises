package BasicExercises.String;

public class String6_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для лексикографического сравнения двух строк, игнорируя различия в регистре.
         */

        //Мой вариант

        String str = "This is Exercise 1";
        String str2 = "This is exercise 1";
        System.out.println("Line 1: " + str);
        System.out.println("Line 2: " + str2);
        if (str.compareToIgnoreCase(str2) == 0) {
            System.out.println("The rows are equal");
        } else if (str.compareTo(str2) > 0) {
            System.out.println("Line 1 is bigger than line 2");
        } else {
            System.out.println("Row 1 is smaller than row 2");
        }

        //Вариант 2
    }
}
