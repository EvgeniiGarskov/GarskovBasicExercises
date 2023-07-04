package BasicExercises.String;

public class String21_25 {

    public static void main(String[] args) {

        System.out.println("Exercise 21");

        /*
        Напишите программу на Java, чтобы получить последний индекс строки в строке.

        Образец строки всего алфавита: «Быстрая коричневая лиса перепрыгивает через ленивую собаку».
         */

//        String str = "The quick brown fox jumps over the lazy dog.";
//
//        // Get the index of all the characters of the alphabet
//        // starting from the beginning of the String.
//        int a = str.lastIndexOf("a", str.length() - 1);
//        int b = str.lastIndexOf("b", str.length() - 1);
//        int c = str.lastIndexOf("c", str.length() - 1);
//        int d = str.lastIndexOf("d", str.length() - 1);
//        int e = str.lastIndexOf("e", str.length() - 1);
//        int f = str.lastIndexOf("f", str.length() - 1);
//        int g = str.lastIndexOf("g", str.length() - 1);
//        int h = str.lastIndexOf("h", str.length() - 1);
//        int i = str.lastIndexOf("i", str.length() - 1);
//        int j = str.lastIndexOf("j", str.length() - 1);
//        int k = str.lastIndexOf("k", str.length() - 1);
//        int l = str.lastIndexOf("l", str.length() - 1);
//        int m = str.lastIndexOf("m", str.length() - 1);
//        int n = str.lastIndexOf("n", str.length() - 1);
//        int o = str.lastIndexOf("o", str.length() - 1);
//        int p = str.lastIndexOf("p", str.length() - 1);
//        int q = str.lastIndexOf("q", str.length() - 1);
//        int r = str.lastIndexOf("r", str.length() - 1);
//        int s = str.lastIndexOf("s", str.length() - 1);
//        int t = str.lastIndexOf("t", str.length() - 1);
//        int u = str.lastIndexOf("u", str.length() - 1);
//        int v = str.lastIndexOf("v", str.length() - 1);
//        int w = str.lastIndexOf("w", str.length() - 1);
//        int x = str.lastIndexOf("x", str.length() - 1);
//        int y = str.lastIndexOf("y", str.length() - 1);
//        int z = str.lastIndexOf("z", str.length() - 1);
//
//        // Display the results of all the lastIndexOf method calls.
//        System.out.println(" a  b c  d  e  f  g  h i  j");
//        System.out.println("===========================");
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
//        System.out.println(" u  v  w  x  y  z");
//        System.out.println("=================");
//        System.out.println(u + " " + v + " " + w + " " + x + " " +
//                y + " " + z);

        System.out.println("Exercise 22");

        /*
        Напишите программу на Java, чтобы получить длину заданной строки.
         */

        //Мой вариант

//        String str = "example.com";
//        System.out.println("Line length '"+str+"' : " + str.length());

        //Вариант 2

//        String str = "example.com";
//        // Get the length of str.
//        int len = str.length();
//        System.out.println("The string length of '"+str+"' is: "+len);

        System.out.println("Exercise 23");

        /*
        Напишите программу на Java, чтобы выяснить, соответствует ли регион в текущей строке региону в другой строке.
         */

        //Мой вариант

//        String str = "example regionMatches";
//        String str2 = "regionMatches";
//        System.out.print("Result of Comparing of String 1 [8-21] and String 2 [0-13]: ");
//        System.out.println(str.regionMatches(8, str2, 0, 13));

        //Вариант 2

//        //String str1 = "Red Green Orange Yellow";
//        //String str2 = "Yellow Orange Green Red";
//
//        String str1 = "Shanghai Houston Colorado Alexandria";
//        String str2 = "Alexandria Colorado Houston Shanghai";
//
//        // Determine whether characters 0 through 7 in str1
//        // match characters 28 through 35 in str2.
//        boolean match1 = str1.regionMatches(0, str2, 28, 8);
//
//        // Determine whether characters 9 through 15 in str1
//        // match characters 9 through 15 in str2.
//        boolean match2 = str1.regionMatches(9, str2, 9, 8);
//
//        // Display the results of the regionMatches method calls.
//        System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
//        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);

        System.out.println("Exercise 24");

        /*
        Напишите программу Java для замены указанного символа другим символом.
         */

        //Мой вариант

//        String str = "The quick brown fox jumps over the lazy dog.";
//        System.out.println("Original string: " + str);
//        System.out.println("New String: " + str.replace("d", "f"));

        //Вариант 2

//        String str = "The quick brown fox jumps over the lazy dog.";
//
//        // Replace all the 'd' characters with 'f' characters.
//        String new_str = str.replace('d', 'f');
//
//        // Display the strings for comparison.
//        System.out.println("Original string: " + str);
//        System.out.println("New String: " + new_str);

        System.out.println("Exercise 25");

        /*
        Напишите программу Java для замены каждой подстроки заданной строки, которая соответствует заданному регулярному выражению, заданной заменой.

        Пример строки: «Быстрая коричневая лиса перепрыгивает через ленивую собаку».

        В приведенной выше строке замените все лисы на кошку.
         */

        //Мой вариант

//        String str = "The quick brown fox jumps over the lazy dog.";
//        System.out.println("Original string: " + str);
//        System.out.println("New String: " + str.replaceAll("fox", "cat"));

        //Вариант 2

//        String str = "The quick brown fox jumps over the lazy dog.";
//
//        // Replace all the 'dog' with 'cat'.
//        String new_str = str.replaceAll("fox", "cat");
//
//        // Display the strings for comparison.
//        System.out.println("Original string: " + str);
//        System.out.println("New String: " + new_str);
    }
}
