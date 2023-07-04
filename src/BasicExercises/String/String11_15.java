package BasicExercises.String;

import java.util.Calendar;

public class String11_15 {

    public static void main(String[] args) {

        System.out.println("Exercise 11");

        /*
        Напишите программу Java для создания объекта String с массивом символов.
         */

        //Мой вариант

//        char[] charArr = {'1', '2', '3', '4'};
////        System.out.println(charArr);
//        String str = String.copyValueOf(charArr, 1, 3);
//        System.out.println("The book contains " + str + " pages");

        //Вариант 2

//        // Character array with data.
//        char[] arr_num = new char[] { '1', '2', '3', '4' };
//
//        // Create a String containig the contents of arr_num
//        // starting at index 1 for length 2.
//        String str = String.copyValueOf(arr_num, 1, 3);
//
//        // Display the results of the new String.
//        System.out.println("\nThe book contains " + str +" pages.\n");

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы проверить, заканчивается ли данная строка другой строкой.
         */

        //Мой вариант

//        String str = "Python Exercises";
//        String str2 = "Python Exercise";
//        String str3 = "se";
//        System.out.println(str + " ends in " + str3 + " ? - " + str.endsWith("se"));
//        System.out.println(str2 + " ends in " + str3 + " ? - " + str2.endsWith("se"));

        //Вариант 2

//        String str1 = "Python Exercises";
//        String str2 = "Python Exercise";
//
//        // The String to check the above two Strings to see
//        // if they end with this value (se).
//        String end_str = "se";
//
//        // Check first two Strings end with end_str
//        boolean ends1 = str1.endsWith(end_str);
//        boolean ends2 = str2.endsWith(end_str);
//
//        // Display the results of the endsWith calls.
//        System.out.println("\"" + str1 + "\" ends with " +
//                "\"" + end_str + "\"? " + ends1);
//        System.out.println("\"" + str2 + "\" ends with " +
//                "\"" + end_str + "\"? " + ends2);

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java, чтобы проверить, содержат ли два объекта String одни и те же данные.
         */

        //Мой вариант

//        String str = "Stephen Edwin King";
//        String str2 = "To Walter Winchell";
//        String str3 = "Mike Royko";
//        System.out.println(str + " equal to " + str2 + " ? - " + str.equals(str2));
//        System.out.println(str + " equal to " + str3 + " ? - " + str.equals(str3));

        //Вариант 2

//        String columnist1 = "Stephen Edwin King";
//        String columnist2 = "Walter Winchell";
//        String columnist3 = "Mike Royko";
//
//        // Are any of the above Strings equal to one another?
//        boolean equals1 = columnist1.equals(columnist2);
//        boolean equals2 = columnist1.equals(columnist3);
//
//        // Display the results of the equality checks.
//        System.out.println("\"" + columnist1 + "\" equals \"" +
//                columnist2 + "\"? " + equals1);
//        System.out.println("\"" + columnist1 + "\" equals \"" +
//                columnist3 + "\"? " + equals2);

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java для сравнения заданной строки с другой строкой, игнорируя рассмотрение регистра.
         */

        //Мой вариант

//        String str = "Stephen Edwin King";
//        String str2 = "Walter Winchell";
//        String str3 = "walter winchell";
//        System.out.println(str + " equal to " + str2 + " ? - " + str.equalsIgnoreCase(str2));
//        System.out.println(str2 + " equal to " + str3 + " ? - " + str2.equalsIgnoreCase(str3));

        //Вариант 2

//        String columnist1 = "Stephen Edwin King";
//        String columnist2 = "Walter Winchell";
//        String columnist3 = "stephen edwin king";
//
//        // Test any of the above Strings equal to one another
//        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
//        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);
//
//        // Display the results of the equality checks.
//        System.out.println("\"" + columnist1 + "\" equals \"" +
//                columnist2 + "\"? " + equals1);
//        System.out.println("\"" + columnist1 + "\" equals \"" +
//                columnist3 + "\"? " + equals2);

        System.out.println("Exercise 15");

        /*
        Напишите программу Java для печати текущей даты и времени в указанном формате.
         */

//        Calendar c = Calendar.getInstance();
//        System.out.println("Current Date and Time :");
//        System.out.format("%tB %te, %tY%n", c, c, c);
//        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
