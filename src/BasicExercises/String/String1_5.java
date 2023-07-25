package BasicExercises.String;

public class String1_5 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java, чтобы получить символ по заданному индексу в строке.
         */

        //Мой вариант

//        String str = "Java Exercises";
//        System.out.println("Line: " + str);
//        char ch1 = str.charAt(0);
//        char ch2 = str.charAt(10);
//
//        System.out.println("The character at position 0 is: " + ch1);
//        System.out.println("The character at position 10 is: " + ch2);

        //Вариант 2

//        String str = "Java Exercises!";
//        System.out.println("Original String = " + str);
//        // Get the character at positions 0 and 10.
//        int index1 = str.charAt(0);
//        int index2 = str.charAt(10);
//
//        // Print out the results.
//        System.out.println("The character at position 0 is " +
//                (char)index1);
//        System.out.println("The character at position 10 is " +
//                (char)index2);

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java, чтобы получить символ (кодовая точка Unicode) по заданному индексу в строке.
         */

        //Мой вариант

//        String str = "w3resource.com";
//        System.out.println("Line: " + str);
//        int ch1 = str.charAt(1);
//        int ch2 = str.charAt(9);
//
//        System.out.println("The character of position 1 in Unicode format is: " + ch1);
//        System.out.println("The character of position 9 in Unicode format is: " + ch2);

        //Вариант 2

//        String str = "w3resource.com";
//        System.out.println("Original String : " + str);
//
//        // codepoint at index 1
//        int val1 = str.codePointAt(1);
//
//        // codepoint at index 9
//        int val2 = str.codePointAt(9);
//
//        // prints character at index1 in string
//        System.out.println("Character(unicode point) = " + val1);
//        // prints character at index9 in string
//        System.out.println("Character(unicode point) = " + val2);

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы получить символ (кодовая точка Unicode) перед указанным индексом в строке.
         */

        //Мой вариант

//        String str = "w3resource.com";
//        System.out.println("Line: " + str);
//        int ch1 = str.codePointBefore(1);
//        int ch2 = str.codePointBefore(9);
//
//        System.out.println("The character (Unicode) before the specified index in the string: " + ch1);
//        System.out.println("The character (Unicode) before the specified index in the string: " + ch2);

        //Вариант 2

//        String str = "w3resource.com";
//        System.out.println("Original String : " + str);
//
//        // codepoint before index 1
//        int val1 = str.codePointBefore(1);
//
//        // codepoint before index 9
//        int val2 = str.codePointBefore(9);
//
//        // prints character before index1 in string
//        System.out.println("Character(unicode point) = " + val1);
//        // prints character before index9 in string
//        System.out.println("Character(unicode point) = " + val2);

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java для подсчета кодовых точек Unicode в указанном текстовом диапазоне строки.
         */

        //Мой вариант

//        String str = "w3resource.com";
//        System.out.println("Line: " + str);
//        int ch1 = str.codePointCount(1, 10);
//
//        System.out.println("The number of Unicode code points in the specified text range of the string: " + ch1);

        //Вариант 2

//        String str = "w3rsource.com";
//        System.out.println("Original String : " + str);
//
//        // codepoint from index 1 to index 10
//        int ctr = str.codePointCount(1, 10);
//
//        // prints character from index 1 to index 10
//        System.out.println("Codepoint count = " + ctr);

        System.out.println("Exercise 5");

        /*
        Напишите программу Java для лексикографического сравнения двух строк.
        Две строки лексикографически равны, если они имеют одинаковую длину и содержат одни и те же символы в одних и тех же позициях.
         */

        //Мой вариант

//        String str = "This is exercise 1";
//        String str2 = "This is exercise 2";
//        System.out.println("Line 1: " + str);
//        System.out.println("Line 2: " + str2);
//        if (str.compareTo(str2) == 0) {
//            System.out.println("The rows are equal");
//        } else if (str.compareTo(str2) > 0) {
//            System.out.println("Line 1 is bigger than line 2");
//        } else {
//            System.out.println("Row 1 is smaller than row 2");
//        }

        //Вариант 2

//        String str1 = "This is Exercise 1";
//        String str2 = "This is Exercise 2";
//
//        System.out.println("String 1: " + str1);
//        System.out.println("String 2: " + str2);
//
//        // Compare the two strings.
//        int result = str1.compareTo(str2);
//
//        // Display the results of the comparison.
//        if (result < 0)
//        {
//            System.out.println("\"" + str1 + "\"" +
//                    " is less than " +
//                    "\"" + str2 + "\"");
//        }
//        else if (result == 0)
//        {
//            System.out.println("\"" + str1 + "\"" +
//                    " is equal to " +
//                    "\"" + str2 + "\"");
//        }
//        else // if (result > 0)
//        {
//            System.out.println("\"" + str1 + "\"" +
//                    " is greater than " +
//                    "\"" + str2 + "\"");
//        }
    }
}
