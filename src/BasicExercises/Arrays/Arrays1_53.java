package BasicExercises.Arrays;

import java.util.*;

public class Arrays1_53 {

    //Упражнение 10
    static int max;
    static int min;

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java для сортировки числового массива и строкового массива.
         */

        //Мой вариант
//        int [] arraysNum = {1789, 2035, 1899, 1456, 2013};
//        System.out.println("The original array: " + Arrays.toString(arraysNum));
//        Arrays.sort(arraysNum);
//        System.out.println("Sorted array: " + Arrays.toString(arraysNum));

        //Вариант 2
//        int[] my_array1 = {
//                1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2165, 1457, 2456};
//
//        String[] my_array2 = {
//                "Java",
//
//                "Python",
//                "PHP",
//                "C#",
//                "C Programming",
//                "C++"
//        };
//        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
//        Arrays.sort(my_array1);
//        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
//
//        System.out.println("Original string array : "+Arrays.toString(my_array2));
//        Arrays.sort(my_array2);
//        System.out.println("Sorted string array : "+Arrays.toString(my_array2));

        System.out.println("Exercise 2");

        /*
        Напишите программу на Java для суммирования значений массива.
         */

        //Мой вариант
//        int [] arraysNum = {3, 4, 5, 7, 9};
//        int sum = 0;
//
//        //for (int i : arraysNum) {
//        for (int i = 0; i < arraysNum.length; i++) {
//            sum += arraysNum[i];
//        }
//        System.out.println("The original array: " + Arrays.toString(arraysNum));
//        System.out.println("Sum of array elements: " + sum);

        //Вариант 2
//        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int i : my_array)
//            sum += i;
//        System.out.println("The sum is " + sum);

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java для печати следующей сетки.
         */

        //Мой вариант
//        String [][] arraysNum = new String[10][10];
//
//        for (int i = 0; i < arraysNum.length; i++) {
//            for (int j = 0; j < arraysNum.length; j++) {
//                arraysNum[i][j] = "-";
//                System.out.print(arraysNum[i][j]);
//            }
//            System.out.println();
//        }

        //Вариант 2
//        int [][]a = new int[10][10];
//        for(int i = 0; i < 10; i++)
//        {
//            for(int j = 0; j < 10; j++)
//            {
//                System.out.printf("%2d ", a[i][j]);
//            }
//            System.out.println();
//        }

        System.out.println("Exercise 4");

        /*
        Напишите Java-программу для расчета среднего значения элементов массива.
         */

        //Мой вариант
//        int [] arraysNum = {3, 4, 5, 7, 9};
//        double sum = 0;
//        double average = 0;
//
//        //for (int i : arraysNum) {
//        for (int i = 0; i < arraysNum.length; i++) {
//            sum += arraysNum[i];
//            average = sum / arraysNum.length;
//        }
//        System.out.println("The original array: " + Arrays.toString(arraysNum));
//        System.out.println("Sum of array elements: " + sum);
//        System.out.println("Average value of array elements: " + average);

        //Вариант 2
//        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
//        //calculate sum of all array elements
//        int sum = 0;
//        for(int i=0; i < numbers.length ; i++)
//            sum = sum + numbers[i];
//        //calculate average value
//        double average = sum / numbers.length;
//        System.out.println("Average value of the array elements is : " + average);

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы проверить, содержит ли массив определенное значение.
         */

        //Мой вариант
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        String num = sc.next();
//
//        int [] arraysNum = {1789, 2035, 1899, 1456, 2013};
//        System.out.println("The original array: " + Arrays.toString(arraysNum));
//        Arrays.sort(arraysNum);
//        System.out.println("Sorted array: " + Arrays.toString(arraysNum));
//
//        if (Arrays.toString(arraysNum).contains(num)) {
//            System.out.println("The number is present in the array");
//        } else {
//            System.out.println("There is no such number in the array");
//        }

        //Вариант 2
//        int[] my_array1 = {
//                1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2265, 1457, 2456};
//        System.out.println(contains(my_array1, 2013));
//        System.out.println(contains(my_array1, 2015));

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java, чтобы найти индекс элемента массива.
         */

        //Мой вариант
//        int [] arraysNum = {25, 14, 56, 15, 36};
//        System.out.println("The original array: " + Arrays.toString(arraysNum));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int num = sc.nextInt();
//
//        System.out.println ("Index of the number in the array: " + find(arraysNum, num));
//
////         for (int i = 0; i < arraysNum.length; i++) {
////           if (arraysNum[i] == num) {
////             System.out.println("Index of the number in the array: " + i);
////           }
////         }

        //Вариант 2
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
//        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));

        System.out.println("Exercise 7");

        /*
        Напишите Java-программу для удаления определенного элемента из массива.
         */

        //Мой вариант
//        int [] arraysNum = {25, 14, 56, 15, 36};
//        System.out.println("Оригинальный массив: " + Arrays.toString(arraysNum));
//
//        int element = 25;
//
//        removeElem(arraysNum, element);
//
//        System.out.println("Новый массив: " + Arrays.toString(arraysNum));

        //Вариант 2
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//
//        System.out.println("Original Array : "+Arrays.toString(my_array));
//
//        // Remove the second element (index->1, value->14) of the array
//        int removeIndex = 1;
//        for(int i = removeIndex; i < my_array.length -1; i++){
//            my_array[i] = my_array[i + 1];
//        }
////      We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
//        System.out.println("After removing the second element: "+Arrays.toString(my_array));

        System.out.println("Exercise 8");

        /*
        Напишите Java-программу для копирования массива путем итерации массива.
         */

        //Мой вариант
//        int[] num = {25, 14, 56, 15, 36};
//        int[] numCopy = new int[5];
//        System.out.println("The original array: " + Arrays.toString(num));
//
//        for (int i = 0; i < num.length; i++) {
//            numCopy[i] = num[i];
//        }
//        System.out.println("Copied array: " + Arrays.toString(numCopy));

        //Вариант 2
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        int[] new_array = new int[10];
//
//        System.out.println("Source Array : "+Arrays.toString(my_array));
//
//        for(int i=0; i < my_array.length; i++) {
//            new_array[i] = my_array[i];
//        }
//        System.out.println("New Array: "+Arrays.toString(new_array));

        System.out.println("Exercise 9");

        /*
        Напишите Java-программу для вставки элемента (определенной позиции) в массив.
         */

        //Мой вариант
//        int[] num = {25, 14, 56, 15, 36};
//        System.out.println("The original array: " + Arrays.toString(num));
//
//        int key = 3;
//        int index = 2;
//
//        num = append(num, key, index);
//        System.out.println("New array: " + Arrays.toString(num));

        //Вариант 2
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        // Insert an element in 3rd position of the array (index->2, value->5)
//
//        int Index_position = 2;
//        int newValue    = 5;
//        System.out.println("Original Array : "+Arrays.toString(my_array));
//
//        for(int i=my_array.length-1; i > Index_position; i--){
//            my_array[i] = my_array[i-1];
//        }
//        my_array[Index_position] = newValue;
//        System.out.println("New Array: "+Arrays.toString(my_array));

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java, чтобы найти максимальное и минимальное значение массива.
         */

        //Мой вариант
//        int[] num = {53, 32, 19, 79, 25, 5, 47};
//        System.out.println("The original array: " + Arrays.toString(num));
//
//        Arrays.sort(num);
//        System.out.println("Minimum array element: " + num[0]);
//        System.out.println("Maximum array element: " + num[num.length - 1]);

        //Вариант 2
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        max_min(my_array);
//        System.out.println(" Original Array: "+Arrays.toString(my_array));
//        System.out.println(" Maximum value for the above array =" + max);
//        System.out.println(" Minimum value for the above array =" + min);

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java, чтобы перевернуть массив целочисленных значений.
         */

        //Мой вариант
//        Integer[] num = {5, 2, 7, 9, 6};
//        System.out.println("The original array: " + Arrays.toString(num));
//
//        reverse(num);
//        System.out.println("Reverse array: " + Arrays.toString(num));
//    }
//        static void reverse(Integer[] num) {
//        Collections.reverse(Arrays.asList(num));

        //Вариант 2
//        int[] my_array1 = {
//                1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2165, 1457, 2456};
//        System.out.println("Original array : "+Arrays.toString(my_array1));
//        for(int i = 0; i < my_array1.length / 2; i++)
//        {
//            int temp = my_array1[i];
//            my_array1[i] = my_array1[my_array1.length - i - 1];
//            my_array1[my_array1.length - i - 1] = temp;
//        }
//        System.out.println("Reverse array : "+Arrays.toString(my_array1));

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы найти повторяющиеся значения в массиве целочисленных значений.
         */

//        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
//
//        for (int i = 0; i < my_array.length-1; i++)
//        {
//            for (int j = i+1; j < my_array.length; j++)
//            {
//                if ((my_array[i] == my_array[j]) && (i != j))
//                {
//                    System.out.println("Duplicate Element : "+my_array[j]);
//                }
//            }
//        }

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java, чтобы найти повторяющиеся значения в массиве строковых значений.
         */

        //Мой вариант
//        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu"};
//        System.out.println("The original array: " + Arrays.toString(my_array));
//
//        for (int i = 0; i < my_array.length-1; i++) {
//            for (int j = i+1; j < my_array.length; j++) {
//                if ((my_array[i] == my_array[j]) && (i != j)) {
//                    System.out.println("Duplicate Element : "+my_array[j]);
//                }
//            }
//        }

        //Вариант 2
//        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
//
//        for (int i = 0; i < my_array.length-1; i++)
//        {
//            for (int j = i+1; j < my_array.length; j++)
//            {
//                if( (my_array[i].equals(my_array[j])) && (i != j) )
//                {
//                    System.out.println("Duplicate Element is : "+my_array[j]);
//                }
//            }
//        }

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java, чтобы найти общие элементы между двумя массивами (строковые значения).
         */

        //Мой вариант
//        String[] my_array1 = {"Python", "JAVA", "PHP"};
//        String[] my_array2 = {"MySQL", "Oracle", "PHP", "JAVA"};
//        System.out.println("The original array 1: " + Arrays.toString(my_array1));
//        System.out.println("The original array 2: " + Arrays.toString(my_array2));
//
//        Set<String> strarr = new HashSet<>();
//
//        for (int i = 0; i < my_array1.length; i++) {
//            for (int j = 0; j < my_array2.length; j++) {
//                if (my_array1[i] == my_array2[j]) {
//                    strarr.add(my_array1[i]);
//                }
//            }
//        }
//        System.out.println("Duplicate Element : " + strarr);

        //Вариант 2
//        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
//
//        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
//
//        System.out.println("Array1 : "+Arrays.toString(array1));
//        System.out.println("Array2 : "+Arrays.toString(array2));
//
//        HashSet<String> set = new HashSet<String>();
//
//        for (int i = 0; i < array1.length; i++)
//        {
//            for (int j = 0; j < array2.length; j++)
//            {
//                if(array1[i].equals(array2[j]))
//                {
//                    set.add(array1[i]);
//                }
//            }
//        }
//
//        System.out.println("Common element : "+(set));     //OUTPUT : [THREE, FOUR, FIVE]

        System.out.println("Exercise 15");

        /*
        Напишите программу на Java, чтобы найти общие элементы между двумя массивами целых чисел.
         */

        //Мой вариант
//        int[] my_array1 = {1, 2, 5};
//        int[] my_array2 = {6, 5, 8, 1};
//        System.out.println("The original array 1: " + Arrays.toString(my_array1));
//        System.out.println("The original array 2: " + Arrays.toString(my_array2));
//
//        Set<Integer> numarr = new HashSet<>();
//
//        for (int i = 0; i < my_array1.length; i++) {
//            for (int j = 0; j < my_array2.length; j++) {
//                if (my_array1[i] == my_array2[j]) {
//                    numarr.add(my_array1[i]);
//                }
//            }
//        }
//        System.out.println("Duplicate Element : " + numarr);

        //Вариант 2
//        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
//        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
//
//        System.out.println("Array1 : "+Arrays.toString(array1));
//        System.out.println("Array2 : "+Arrays.toString(array2));
//
//
//        for (int i = 0; i < array1.length; i++)
//        {
//            for (int j = 0; j < array2.length; j++)
//            {
//                if(array1[i] == (array2[j]))
//                {
//
//                    System.out.println("Common element is : "+(array1[i]));
//                }
//            }
//        }

        System.out.println("Exercise 16");

        /*
        Напишите Java-программу для удаления дублирующихся элементов из массива.
         */

        //Мой вариант
//        Integer[] my_array = {10, 22, 10, 20, 11, 22};
//
//        System.out.println("The original array: " + Arrays.toString(my_array));
//
//        Set<Integer> numarr = new HashSet<>(Arrays.asList(my_array));
//        System.out.println("Array without duplicates: " + numarr);

        //Мой вариант 2
//        Integer[] my_array = {10, 22, 10, 20, 11, 22};
//        System.out.println("The original array: " + Arrays.toString(my_array));
//
//        ArrayList<Integer> numarr = new ArrayList<>(Arrays.asList(my_array));
//        System.out.println("Dynamic array: " + numarr);
//
//        ArrayList<Integer> newNumarr = removeDuplicates(numarr);
//        System.out.println("Array without duplicates: " + newNumarr);

        //Вариант 2
//        unique_array(new int[] {0, 3, -2, 4, 3, 2});
//
//        unique_array(new int[] {10, 22, 10, 20, 11, 22});

        System.out.println("Exercise 17");

        /*
        Напишите программу на Java, чтобы найти второй по величине элемент в массиве.
         */
    }
//    public static boolean contains(int[] arr, int item) {
//        for (int n : arr) {
//            if (item == n) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public static int find (int [] arraysNum, int num) {
//        for (int i = 0; i < arraysNum.length; i++) {
//            if (arraysNum[i] == num) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static int  findIndex (int[] my_array, int t) {
//        if (my_array == null) return -1;
//        int len = my_array.length;
//        int i = 0;
//        while (i < len) {
//            if (my_array[i] == t) return i;
//            else i=i+1;
//        }
//        return -1;
//    }

//    public static int [] removeElem (int [] arraysNum, int element) {
//        return ArrayUtils.removeElement(arraysNum, element);
//    }

//    private static int[] append (int[] num, int key, int index) {
//        int[] result = new int[num.length + 1];
//
//        for (int i = 0; i < index; i++) {
//            result[i] = num[i];
//        }
//        result[index] = key;
//
//        for (int i = index + 1; i <= num.length; i++) {
//            result[i] = num[i - 1];
//        }
//        return result;
//    }

//    public static void max_min(int my_array[]) {
//        max = my_array[0];
//        min = my_array[0];
//        int len = my_array.length;
//        for (int i = 1; i < len - 1; i = i + 2) {
//            if (i + 1 > len) {
//                if (my_array[i] > max) max = my_array[i];
//                if (my_array[i] < min) min = my_array[i];
//            }
//            if (my_array[i] > my_array[i + 1]) {
//                if (my_array[i] > max) max = my_array[i];
//                if (my_array[i + 1] < min) min = my_array[i + 1];
//            }
//            if (my_array[i] < my_array[i + 1]) {
//                if (my_array[i] < min) min = my_array[i];
//                if (my_array[i + 1] > max) max = my_array[i + 1];
//            }
//        }
//    }

//    static void unique_array(int[] my_array)
//    {
//        System.out.println("Original Array : ");
//
//        for (int i = 0; i < my_array.length; i++)
//        {
//            System.out.print(my_array[i]+"\t");
//        }
//
//        //Assuming all elements in input array are unique
//
//        int no_unique_elements = my_array.length;
//
//        //Comparing each element with all other elements
//
//        for (int i = 0; i < no_unique_elements; i++)
//        {
//            for (int j = i+1; j < no_unique_elements; j++)
//            {
//                //If any two elements are found equal
//
//                if(my_array[i] == my_array[j])
//                {
//                    //Replace duplicate element with last unique element
//
//                    my_array[j] = my_array[no_unique_elements-1];
//
//                    no_unique_elements--;
//
//                    j--;
//                }
//            }
//        }
//
//        //Copying only unique elements of my_array into array1
//
//        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
//
//        //Printing arrayWithoutDuplicates
//
//        System.out.println();
//
//        System.out.println("Array with unique values : ");
//
//        for (int i = 0; i < array1.length; i++)
//        {
//            System.out.print(array1[i]+"\t");
//        }
//
//        System.out.println();
//
//        System.out.println("---------------------------");
//    }

//    public static <Integer> ArrayList removeDuplicates(ArrayList<Integer> numarr) {
//
//        ArrayList<Integer> newNumarr = new ArrayList<>();
//
//        for (Integer element : numarr) {
//            if (!newNumarr.contains(element)) {
//                newNumarr.add(element);
//            }
//        }
//        return newNumarr;
//    }
}
