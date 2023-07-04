package BasicExercises.String;

public class String26_31 {

    public static void main(String[] args) {

        System.out.println("Exercise 26");

        /*
        Напишите программу на Java, чтобы проверить, начинается ли данная строка с другой строки.
         */

        //Мой вариант

//        String str = "Red is favorite color.";
//        String str2 = "Orange is also my favorite color.";
//        String str3 = "Red";
//        System.out.println("Original string 1: " + str);
//        System.out.println("Original string 2: " + str2);
//        System.out.println("String: '" + str + "' starts with " + str3 + " ? - " + str.startsWith(str3));
//        System.out.println("String: '" + str2 + "' starts with " + str3 + " ? - " + str2.startsWith(str3));

        //Вариант 2

//        String str1 = "Red is favorite color.";
//        String str2 = "Orange is also my favorite color.";
//
//        // The String to check the above two Strings to see
//        // if they start with this value (Red).
//        String startStr = "Red";
//
//        // Do either of the first two Strings start with startStr?
//        boolean starts1 = str1.startsWith(startStr);
//        boolean starts2 = str2.startsWith(startStr);
//
//        // Display the results of the startsWith calls.
//        System.out.println( str1 + " starts with " +
//                startStr + "? " + starts1);
//        System.out.println(str2 + " starts with " +
//                startStr + "? " + starts2);

        System.out.println("Exercise 27");

        /*
        Напишите программу на Java, чтобы получить подстроку заданной строки в двух указанных позициях.
         */

        //Мой вариант

//        String str = "Red is favorite color.";
//        System.out.println("Original string: " + str);
//        System.out.println("Substring [7-15]: " + str.substring(7,15));

        //Вариант 2

//        String str = "The quick brown fox jumps over the lazy dog.";
//
//        // Get a substring of the above string starting from
//        // index 10 and ending at index 26.
//        String new_str = str.substring(10, 26);
//
//        // Display the two strings for comparison.
//        System.out.println("old = " + str);
//        System.out.println("new = " + new_str);

        System.out.println("Exercise 28");

        /*
        Напишите программу Java для создания массива символов, содержащего строку.
         */

        //Мой вариант

//        String str = "Red is favorite color.";
//        System.out.println("Original string: " + str);
//        char[] charArr = str.toCharArray();
//        System.out.println("Array of characters:");
//        System.out.println(charArr);
//        // for (int i = 0; i < charArr.length; i++) {
//        //   System.out.print(charArr[i] + " | ");
//        // }

        //Вариант 2

//        String str = "Java Exercises.";
//
//        // Convert the above string to a char array.
//        char[] arr = str.toCharArray();
//
//        // Display the contents of the char array.
//        System.out.println(arr);

        System.out.println("Exercise 29");

        /*
        Напишите программу на Java для преобразования всех символов строки в нижний регистр.
         */

        //Мой вариант

//        String str = "Red Is Favorite Color.";
//        System.out.println("Original string: " + str);
//        System.out.println("Lowercase: " + str.toLowerCase());

        //Вариант 2

//        String str = "The Quick BroWn FoX!";
//
//        // Convert the above string to all lowercase.
//        String lowerStr = str.toLowerCase();
//
//        // Display the two strings for comparison.
//        System.out.println("Original String: " + str);
//        System.out.println("String in lowercase: " + lowerStr);

        System.out.println("Exercise 30");

        /*
        Напишите программу Java для преобразования всех символов строки в верхний регистр.
         */

        //Мой вариант

//        String str = "Red is favorite color.";
//        System.out.println("Original string: " + str);
//        System.out.println("Uppercase: " + str.toUpperCase());

        //Вариант 2

//        String str = "The Quick BroWn FoX!";
//
//        // Convert the above string to all uppercase.
//        String upper_str = str.toUpperCase();
//
//        // Display the two strings for comparison.
//        System.out.println("Original String: " + str);
//        System.out.println("String in uppercase: " + upper_str);

        System.out.println("Exercise 31");

        /*
        Напишите программу на Java, чтобы обрезать начальные или конечные пробелы в заданной строке.
         */

        //Мой вариант

//        String str = "  Red is favorite color.  ";
//        System.out.println("Original string: " + str);
//        System.out.println("Trim: " + str.trim());

        //Вариант 2

//        String str = " Java Exercises ";
//
//        // Trim the whitespace from the front and back of the
//        // String.
//        String new_str = str.trim();
//
//        // Display the strings for comparison.
//        System.out.println("Original String: " + str);
//        System.out.println("New String: " + new_str);
    }
}
