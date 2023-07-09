package BasicExercises.String;

public class String44 {

    /*
    Напишите программу на Java, которая реверсирует строку с помощью рекурсии.
     */

    //Мой вариант

//    public static String reverseString(String str) {
//        char[] array = str.toCharArray();
//        String result = "";
//        for (int i = array.length - 1; i >= 0; i--) {
//            result = result + array[i];
//        }
//        return result;
//    }

    //Вариант 2

//    void reverseString(String str1) {
//        if ((str1 == null) || (str1.length() <= 1))
//            System.out.println(str1);
//        else {
//            System.out.print(str1.charAt(str1.length() - 1));
//            reverseString(str1.substring(0, str1.length() - 1));
//        }
//    }

    public static void main(String[] args) {

        //Мой вариант

//        String str = "Welcome";
//        System.out.println(str);
//        System.out.println("Revers: " + reverseString(str));

        //Вариант 2

//        String str1 = "The quick brown fox jumps";
//        System.out.println("The given string is: " + str1);
//        System.out.println("The string in reverse order is:");
//        String44 obj = new String44();
//        obj.reverseString(str1);
    }
}
