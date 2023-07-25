package BasicExercises.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class String38 {

    /*
    Напишите программу на Java для вывода результата удаления дубликатов из заданной строки.
     */

    //Вариант 2

//    private static String removeDuplicateChars(String sourceStr) {
//        char[] arr1 = sourceStr.toCharArray();
//        String targetStr = "";
//        for (char value: arr1) {
//            if (targetStr.indexOf(value) == -1) {
//                targetStr += value;
//            }
//        }
//        return targetStr;
//    }
//
//    public static void main(String[] args) {
//
//        //Мой вариант
//
////        String str = "w3resource";
////        System.out.println(str);
////        char[] ch = str.toCharArray();
////
////        Set<Character> charSet = new LinkedHashSet<Character>();
////        for (char c : ch) {
////            charSet.add(c);
////        }
////
////        StringBuilder sb = new StringBuilder();
////        for (Character character : charSet) {
////            sb.append(character);
////        }
////        System.out.println(sb.toString());
//
//        //Вариант 2
//
//        String str1 = "w3resource";
//        System.out.println("The given string is: " + str1);
//        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
//    }
}
