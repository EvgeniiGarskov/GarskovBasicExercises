package BasicExercises.String;

import java.util.LinkedHashMap;

public class String37 {

    /*
    Напишите программу на Java, чтобы найти длину самой длинной подстроки заданной строки без повторяющихся символов.

    Примечание:
    1) Данная строка состоит из английских букв, цифр, символов и пробелов.
    2) 0 <= заданная длина строки <= 5 * 104

    Сложность: средняя.
    Компания: Amazon, Google, Bloomberg, Microsoft, Adobe, Apple, Oracle, Facebook и другие.

    Входная строка: pickoutthelongestsubstring
    Самая длинная подстрока: [u, b, s, t, r, i, n, g]
    Самая длинная длина подстроки: 8

    Входная строка: ppppppppppppp
    Самая длинная подстрока: [p]
    Самая длинная длина подстроки: 1

    Входная строка: Microsoft
    Самая длинная подстрока: [M, i, c, r, o, s]
    Самая длинная длина подстроки: 6
     */

//    static void longestSubstring(String inputString) {
//        char[] arr1 = inputString.toCharArray();
//        String long_str = null;
//        int str_length = 0;
//        LinkedHashMap< Character, Integer >
//                charPosMap = new LinkedHashMap < Character, Integer >();
//        for (int i = 0; i < arr1.length; i++) {
//            char ch = arr1[i];
//            if (!charPosMap.containsKey(ch)) {
//                charPosMap.put(ch, i);
//            } else {
//                i = charPosMap.get(ch);
//                charPosMap.clear();
//            }
//            if (charPosMap.size() > str_length) {
//                str_length = charPosMap.size();
//                long_str = charPosMap.keySet().toString();
//            }
//        }
//        System.out.println("Input String : " + inputString);
//        System.out.println("The longest substring : " + long_str);
//        System.out.println("The longest Substring Length : " + str_length);
//    }
//
//    public static void main(String[] args) {
//
//        longestSubstring("pickoutthelongestsubstring");
//        longestSubstring("ppppppppppppp");
//        longestSubstring("Microsoft");
//    }
}
