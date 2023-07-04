package BasicExercises.String;

public class String16_20 {

    public static void main(String[] args) {

        System.out.println("Exercise 16");

        /*
        Напишите программу на Java, чтобы получить содержимое заданной строки в виде массива байтов.
         */

//        String str = "This is a sample String.";
//
//        // Copy the contents of the String to a byte array.
//        byte[] byte_arr = str.getBytes();
//
//        // Create a new String using the contents of the byte array.
//        String new_str = new String(byte_arr);
//
//        // Display the contents of the byte array.
//        System.out.println("\nThe new String equals " +
//                new_str + "\n");

        System.out.println("Exercise 17");

        /*
        Напишите программу на Java, чтобы получить содержимое заданной строки в виде массива символов.
         */

        //Мой вариант

//        String str ="This is a sample String.";
//        System.out.println("Original line: " + str);
//        char[] ch = new char[20];
//        str.getChars(0, 10, ch, 0);
//        System.out.println("The char array is equal to: ");
//        System.out.println(ch);

        //Вариант 2

//        String str = "This is a sample string.";
//
//        // Copy the contents of the String to a byte array.
//        // Only copy characters 4 through 10 from str.
//        // Fill the source array starting at position 2.
//        char[] arr = new char[] { ' ', ' ', ' ', ' ',
//                ' ', ' ', ' ', ' ' };
//        str.getChars(4, 10, arr, 2);
//
//        // Display the contents of the byte array.
//        System.out.println("The char array equals \"" +
//                arr + "\"");

        System.out.println("Exercise 18");

        /*
        Напишите программу Java для создания отдельного идентификатора для данной строки.
         */

        //Мой вариант

//        String str = "Java Exercises.";
//        int hc = str.hashCode();
//        System.out.println("Hash code of the string:" + str + " equal to: " + hc);

        //Вариант 2

//        String str = "Python Exercises.";
//
//        // Get the hash code for the above string.
//        int hash_code = str.hashCode();
//
//        // Display the hash code.
//        System.out.println("The hash for " + str +
//                " is " + hash_code);

        System.out.println("Exercise 19");

        /*
        Напишите программу на Java, чтобы получить индекс всех символов алфавита.

        Образец строки всего алфавита: «Быстрая коричневая лиса перепрыгивает через ленивую собаку».
         */

//        String str = "The quick brown fox jumps over the lazy dog.";
//
//        // Get the index of all the characters of the alphabet
//        // starting from the beginning of the String.
//        int a = str.indexOf("a", 0);
//        int b = str.indexOf("b", 0);
//        int c = str.indexOf("c", 0);
//        int d = str.indexOf("d", 0);
//        int e = str.indexOf("e", 0);
//        int f = str.indexOf("f", 0);
//        int g = str.indexOf("g", 0);
//        int h = str.indexOf("h", 0);
//        int i = str.indexOf("i", 0);
//        int j = str.indexOf("j", 0);
//        int k = str.indexOf("k", 0);
//        int l = str.indexOf("l", 0);
//        int m = str.indexOf("m", 0);
//        int n = str.indexOf("n", 0);
//        int o = str.indexOf("o", 0);
//        int p = str.indexOf("p", 0);
//        int q = str.indexOf("q", 0);
//        int r = str.indexOf("r", 0);
//        int s = str.indexOf("s", 0);
//        int t = str.indexOf("t", 0);
//        int u = str.indexOf("u", 0);
//        int v = str.indexOf("v", 0);
//        int w = str.indexOf("w", 0);
//        int x = str.indexOf("x", 0);
//        int y = str.indexOf("y", 0);
//        int z = str.indexOf("z", 0);
//
//        // Display the results of all the indexOf method calls.
//        System.out.println(" a  b c  d e  f  g h i  j");
//        System.out.println("=========================");
//        System.out.println(a + " " + b + " " + c + " " + d + " " +
//                e + " " + f + " " + g + " " + h + " " +
//                i + " " + j + "\n");
//
//        System.out.println("k  l  m  n  o  p q  r  s  t");
//        System.out.println("===========================");
//        System.out.println(k + " " + l + " " + m + " " + n + " " +
//                o + " " + p + " " + q + " " + r + " " +
//                s + " " + t + "\n");
//
//        System.out.println("u  v  w  x  y  z");
//        System.out.println("================");
//        System.out.println(u + " " + v + " " + w + " " + x + " " +
//                y + " " + z);

        System.out.println("Exercise 20");

        /*
        Напишите программу на Java, чтобы получить каноническое представление строкового объекта.
         */

        //Мой вариант

//        String str1 = new String("str");
//        String str2 = new String("str");
//        String str3 = str1.intern();
//        String str4 = str2.intern();
//        System.out.println("str1 == str2 ? : " + (str1 == str2));
//        System.out.println("str3 == str4 ? : " + (str3 == str4));

        //Вариант 2

//        // Create three strings in three different ways.
//        String str1 = "Java Exercises";
//        String str2 = new StringBuffer("Java").append(" Exercises").toString();
//        String str3 = str2.intern();
//
//        // Determine which strings are equivalent using the ==
//        // operator (as compared to calling equals(), which is
//        // a more expensive operation.
//        System.out.println("str1 == str2? " + (str1 == str2));
//        System.out.println("str1 == str3? " + (str1 == str3));
    }
}
