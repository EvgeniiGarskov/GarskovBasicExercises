package BasicExercises.String;

public class String6_10 {

    public static void main(String[] args) {

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java для лексикографического сравнения двух строк, игнорируя различия в регистре.
         */

        //Мой вариант

//        String str = "This is Exercise 1";
//        String str2 = "This is exercise 1";
//        System.out.println("Line 1: " + str);
//        System.out.println("Line 2: " + str2);
//        if (str.compareToIgnoreCase(str2) == 0) {
//            System.out.println("The rows are equal");
//        } else if (str.compareTo(str2) > 0) {
//            System.out.println("Line 1 is bigger than line 2");
//        } else {
//            System.out.println("Row 1 is smaller than row 2");
//        }

        //Вариант 2

//        String str1 = "This is exercise 1";
//        String str2 = "This is Exercise 1";
//
//        System.out.println("String 1: " + str1);
//        System.out.println("String 2: " + str2);
//
//        // Compare the two strings.
//        int result = str1.compareToIgnoreCase(str2);
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

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java для объединения заданной строки с концом другой строки.
         */

        //Мой вариант

//        String str = "PHP exercises and ";
//        String str2 = "Python exercises";
//        System.out.println("Line 1: " + str);
//        System.out.println("Line 2: " + str2);
//        String str3 = str.concat(str2);
//        // System.out.println(str + str2);
//        System.out.println("Combined string: " + str3);

        //Вариант 2

//        String str1 = "PHP Exercises and ";
//        String str2 = "Python Exercises";
//
//        System.out.println("String 1: " + str1);
//        System.out.println("String 2: " + str2);
//
//
//        // Concatenate the two strings together.
//        String str3 = str1.concat(str2);
//
//        // Display the new String.
//        System.out.println("The concatenated string: " + str3);

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java, чтобы проверить, содержит ли заданная строка указанную последовательность значений char.
         */

        //Мой вариант

//        String str = "PHP exercises and ";
//        String str2 = "Python exercises";
//        System.out.println("Line 1: " + str);
//        System.out.println("Line 2: " + str2);
//        String str3 = str.concat(str2);
//        // System.out.println(str + str2);
//        System.out.println("Combined string: " + str3);
//        System.out.println(str3.contains("PHP"));

        //Вариант 2

//        String str1 = "PHP Exercises and Python Exercises";
//        String str2 = "and";
//        System.out.println("Original String: " + str1);
//        System.out.println("Specified sequence of char values: " + str2);
//        System.out.println(str1.contains(str2));

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для сравнения заданной строки с указанной последовательностью символов.
         */

        //Мой вариант

//        String str = "example.com";
//        String str2 = "Example.com";
//        System.out.println("Line 1: " + str);
//        System.out.println("Line 2: " + str2);
//        System.out.println(str.contentEquals("example.com"));
//        System.out.println(str2.contentEquals("example.com"));

        //Вариант 2

//        String str1 = "example.com", str2 = "Example.com";
//        CharSequence cs = "example.com";
//        System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
//        System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java для сравнения заданной строки с заданным строковым буфером.
         */

        //Мой вариант

//        String str = "example.com";
//        String str2 = "Example.com";
//        System.out.println("Line 1: " + str);
//        System.out.println("Line 2: " + str2);
//        StringBuffer sb = new StringBuffer("example.com");
//        System.out.println(str.contentEquals(sb));
//        System.out.println(str2.contentEquals(sb));

        //Вариант 2

//        String str1 = "example.com", str2 = "Example.com";
//        StringBuffer strbuf = new StringBuffer(str1);
//
//        System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
//
//        System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
    }
}
