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

        //Мой вариант
//        int[] num = {10789, 2035, 1899, 1456, 2013};
//        Arrays.sort(num);
//        System.out.println("The original array: " + Arrays.toString(num));
//        System.out.println("The second largest element in the array: " + num[num.length-2]);

        //Вариант 2
//        int[] my_array = {
//                10789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2165, 1457, 2456};
//        System.out.println("Original numeric array : "+Arrays.toString(my_array));
//        Arrays.sort(my_array);
//        int index = my_array.length-1;
//        while(my_array[index]==my_array[my_array.length-1]){
//            index--;
//        }
//        System.out.println("Second largest value: " + my_array[index]);

        System.out.println("Exercise 18");

        /*
        Напишите программу на Java, чтобы найти второй наименьший элемент в массиве.
         */

        //Мой вариант
//        int[] num = {10789, 2035, 1899, 1456, 2013, -1, -4};
//        Arrays.sort(num);
//        System.out.println("The original array: " + Arrays.toString(num));
//        System.out.println("The second smallest element in the array: " + num[1]);

        //Вариант 2
//        int[] my_array = {-1, 4, 0, 2, 7, -3};
//        System.out.println("Original numeric array : "+Arrays.toString(my_array));
//        int min = Integer.MAX_VALUE;
//        int second_min = Integer.MAX_VALUE;
//        for (int i = 0; i < my_array.length; i++) {
//            if(my_array[i]==min){
//                second_min=min;
//            } else if (my_array[i] < min) {
//                second_min = min;
//                min = my_array[i];
//            } else if (my_array[i] < second_min) {
//                second_min = my_array[i];
//            }
//        }
//        System.out.println("Second lowest number is : " + second_min);

        System.out.println("Exercise 19");

        /*
        Напишите программу на Java, чтобы добавить две матрицы одинакового размера.
         */

//        int m, n, c, d;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Input number of rows of matrix");
//        m = in.nextInt();
//        System.out.println("Input number of columns of matrix");
//        n  = in.nextInt();
//
//        int array1[][] = new int[m][n];
//        int array2[][] = new int[m][n];
//        int sum[][] = new int[m][n];
//
//        System.out.println("Input elements of first matrix");
//
//        for (  c = 0 ; c < m ; c++ )
//            for ( d = 0 ; d < n ; d++ )
//                array1[c][d] = in.nextInt();
//
//        System.out.println("Input the elements of second matrix");
//
//        for ( c = 0 ; c < m ; c++ )
//            for ( d = 0 ; d < n ; d++ )
//                array2[c][d] = in.nextInt();
//
//        for ( c = 0 ; c < m ; c++ )
//            for ( d = 0 ; d < n ; d++ )
//                sum[c][d] = array1[c][d] + array2[c][d];
//
//        System.out.println("Sum of the matrices:-");
//
//        for ( c = 0 ; c < m ; c++ )
//        {
//            for ( d = 0 ; d < n ; d++ )
//                System.out.print(sum[c][d]+"\t");
//
//            System.out.println();
//        }

        System.out.println("Exercise 20");

        /*
        Напишите программу на Java для преобразования массива в ArrayList.
         */

        //Мой вариант
//        String[] str = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
//        System.out.println("A regular array: " + Arrays.toString(str));
//
//        ArrayList<String> newstr = new ArrayList<>(Arrays.asList(str));
//        System.out.println("Dynamic array: " + newstr);

        //Вариант 2
//        String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
//        ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
//
//        System.out.println(list);

        System.out.println("Exercise 21");

        /*
        Напишите программу на Java для преобразования ArrayList в массив.
         */

        //Мой вариант
//        ArrayList<String> str = new ArrayList<>(Arrays.asList("Python", "JAVA", "PHP", "Perl", "C#", "C++"));
//        System.out.println("Dynamic array: " + str);
//
//        String[] newstr = str.toArray(new String[str.size()]);
//        System.out.println("A regular array: " + Arrays.toString(newstr));

        //Вариант 2
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Python");
//
//        list.add("Java");
//
//        list.add("PHP");
//
//        list.add("C#");
//
//        list.add("C++");
//
//        list.add("Perl");
//
//        String[]  my_array = new String[list.size()];
//
//        list.toArray(my_array);
//
//        for (String  string : my_array)
//        {
//            System.out.println(string);
//        }

        System.out.println("Exercise 22");

        /*
        Напишите программу на Java, чтобы найти все пары элементов в массиве, сумма которых равна указанному числу.
         */

        //Мой вариант
//        int[] num = {2, 7, 4, -5, 11, 5, 20};
//        System.out.println("Array: " + Arrays.toString(num));
//
//        int n = 15;
//
//        System.out.println("Pairs of elements and their sum: ");
//        for (int i = 0; i < num.length; i++) {
//            for (int k = 0+i; k < num.length; k++) {
//                if (num[i] + num[k] == n)
//                    System.out.println(num[i] + " + " + num[k] + " = " + n);
//            }
//        }

        //Вариант 2
//        pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
//
//        pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);

        System.out.println("Exercise 23");

        /*
        Напишите программу на Java, чтобы проверить равенство двух массивов.
         */

        //Мой вариант
//        int[] num1 = {2, 7, 4, -5, 11, 5, 20};
//        int[] num2 = {2, 7, 4, -5, 11, 5, 20};
//        System.out.println("Array 1: " + Arrays.toString(num1));
//        System.out.println("Array 2: " + Arrays.toString(num2));
//
//        if (Arrays.equals(num1, num2)) {
//            System.out.println("Arrays are equal");
//        } else {
//            System.out.println("Arrays are different");
//        }

        //Вариант 2
//        int[] array1 =  {2, 5, 7, 9, 11};
//        int[] array2 =  {2, 5, 7, 8, 11};
//        int[] array3 =  {2, 5, 7, 9, 11};
//
//        equality_checking_two_arrays(array1,  array2);
//        equality_checking_two_arrays(array1, array3);

        System.out.println("Exercise 24");

        /*
        Напишите программу на Java, чтобы найти пропущенное число в массиве.
         */

        //Мой вариант
//        int n = 0;
//
//        int[] num = {1, 2, 3, 4, 6, 7, 8};
//        System.out.println("Array: " + Arrays.toString(num));
//
//        for (int i = 0; i < num.length; i++) {
//            n++;
//            if (num[i] != n) {
//                System.out.println("Missing number: " + n);
//                n++;
//            }
//        }

        //Вариант 2
//        int total_num;
//        int[] numbers = new int[]{1,2,3,4,6,7};
//        total_num = 7;
//        int expected_num_sum = total_num * ((total_num + 1) / 2);
//        int num_sum = 0;
//        for (int i: numbers) {
//            num_sum += i;
//        }
//        System.out.print( expected_num_sum - num_sum);
//        System.out.print("\n");

        System.out.println("Exercise 25");

        /*
        Напишите программу на Java, чтобы найти общие элементы из трех отсортированных (в порядке убывания) массивов.
         */

        //Мой вариант
//        int[] num1 = {2, 4, 8};
//        int[] num2 = {2, 3, 4, 8, 10, 16};
//        int[] num3 = {4, 8, 14, 40};
//        System.out.println("Array 1: " + Arrays.toString(num1));
//        System.out.println("Array 2: " + Arrays.toString(num2));
//        System.out.println("Array 3: " + Arrays.toString(num3));
//
//        ArrayList<Integer> newList = new ArrayList<> ();
//
//        System.out.println("Identical elements in three arrays: ");
//        for (int i = 0; i < num1.length; i++) {
//            for (int k = 0; k < num2.length; k++) {
//                for (int g = 0; g < num3.length; g++) {
//                    if (num1[i] == num2[k] && num2[k] == num3[g]) {
//                        newList.add(num3[g]);
//                        // System.out.println(num3[g]);
//                    }
//                }
//            }
//        }
//        System.out.println(newList);

        //Вариант 2
//        ArrayList<Integer> common = new ArrayList<Integer>();
//        int array1[] = {2, 4, 8};
//        int array2[] = {2, 3, 4, 8, 10, 16};
//        int array3[] = {4, 8, 14, 40};
//        int x = 0, y = 0, z = 0;
//        while (x < array1.length && y < array2.length && z < array3.length){
//            if (array1[x] == array2[y] && array2[y] == array3[z]){
//                common.add(array1[x]);
//                x++;
//                y++;
//                z++;
//            }
//            else if (array1[x] < array2[y])
//                x++;
//            else if (array2[y] < array3[z])
//                y++;
//            else
//                z++;
//        }
//        System.out.println("Common elements from three sorted (in non-decreasing order) arrays: ");
//        System.out.println(common);

        System.out.println("Exercise 26");

        /*
        Напишите программу на Java, чтобы переместить все 0 в конец массива. Поддерживать относительный порядок
        других (ненулевых) элементов массива.
         */

        //Мой вариант
//        int[] num = {0, 0, 1, 0, 3, 0, 5, 0, 6};
//        System.out.println("The original array: " + Arrays.toString(num));
//        reorder(num);
//        System.out.println("Sorted array: " + Arrays.toString(num));

        //Вариант 2
//        int[] array_nums = {0,0,1,0,3,0,5,0,6};
//        int i = 0;
//        System.out.print("\nOriginal array: \n");
//        for (int n : array_nums)
//            System.out.print(n+"  ");
//
//        for(int j = 0, l = array_nums.length; j < l;) {
//            if(array_nums[j] == 0)
//                j++;
//            else {
//                int temp = array_nums[i];
//                array_nums[i] = array_nums[j];
//                array_nums[j] = temp;
//                i ++;
//                j ++;
//            }
//        }
//        while (i < array_nums.length)
//            array_nums[i++] = 0;
//        System.out.print("\nAfter moving 0's to the end of the array: \n");
//        for (int n : array_nums)
//            System.out.print(n+"  ");
//        System.out.print("\n");

        System.out.println("Exercise 27");

        /*
        Напишите программу на Java, чтобы найти количество четных и нечетных целых чисел в данном массиве целых чисел.
         */

        //Мой вариант
//        int even = 0;
//        int odd = 0;
//
//        int[] num = {5, 7, 2, 4, 9};
//        System.out.println("The original array: " + Arrays.toString(num));
//
//        for (int i : num) {
//            if (i%2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//
//        System.out.println("Even elements: " + even);
//        System.out.println("Odd elements: " + odd);

        //Вариант 2
//        int[] array_nums = {5, 7, 2, 4, 9};
//        System.out.println("Original Array: "+Arrays.toString(array_nums));
//        int ctr = 0;
//        for(int i = 0; i < array_nums.length; i++)
//        {
//            if(array_nums[i] % 2 == 0)
//                ctr++;
//        }
//        System.out.println("Number of even numbers : "+ctr);
//        System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));

        System.out.println("Exercise 28");

        /*
        Напишите программу на Java, чтобы получить разницу между самым большим и самым маленьким значениями
        в массиве целых чисел. Длина массива должна быть от 1 и выше.
         */

        //Мой вариант
//        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(5, 7, 2, 4, 9));
//        System.out.println("The original array: " + num);
//        System.out.println("Difference between max and min values: " + (Collections.max(num) - Collections.min(num)));

        //Вариант 2
//        int[] array_nums = {5, 7, 2, 4, 9};
//        System.out.println("Original Array: "+Arrays.toString(array_nums));
//        int max_val = array_nums[0];
//        int min = array_nums[0];
//        for(int i = 1; i < array_nums.length; i++)
//        {
//            if(array_nums[i] > max_val)
//                max_val = array_nums[i];
//            else if(array_nums[i] < min)
//                min = array_nums[i];
//        }
//        System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));

        System.out.println("Exercise 29");

        /*
        Напишите программу на Java для вычисления среднего значения массива целых чисел, за исключением
        самых больших и самых маленьких значений.
         */

        //Мой вариант
//        int[] num = {5, 7, 2, 4, 9};
//        System.out.println("The original array: " + Arrays.toString(num));
//
//        int max = num[0];
//        int min = num[0];
//        float sum = 0;
//
//        for (int i : num) {
//            sum += i;
//        }
//
//        for (int i = 1; i < num.length; i++) {
//            if(num[i] > max) {
//                max = num[i];
//            } else if(num[i] < min) {
//                min = num[i];
//            }
//        }
//        float average = ((sum - (max + min)) / (num.length - 2));
//        System.out.printf("The average value of an array of integers, with the exception of max and max values: %.2f", average);

        //Вариант 2
//        int[] array_nums = {5, 7, 2, 4, 9};
//        System.out.println("Original Array: "+Arrays.toString(array_nums));
//        int max = array_nums[0];
//        int min = array_nums[0];
//        float sum = array_nums[0];
//        for(int i = 1; i < array_nums.length; i++)
//        {
//            sum  += array_nums[i];
//            if(array_nums[i] > max)
//                max = array_nums[i];
//            else if(array_nums[i] < min)
//                min = array_nums[i];
//        }
//        float x = ((sum-max-min) / (array_nums.length - 2));
//        System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f",x);
//        System.out.print("\n");

        System.out.println("Exercise 30");

        /*
        Напишите программу на Java, чтобы проверить, является ли массив целых чисел без 0 и -1.
         */

        //Мой вариант
//        int[] num = {50, 77, 12, 54, -11};
//        System.out.println("The original array: " + Arrays.toString(num));
//        System.out.println("Array without 0 and -1: " + check(num));

        //Вариант 2
//        int[] array_nums = {50, 77, 12, 54, -11};
//        System.out.println("Original Array: "+Arrays.toString(array_nums));
//        System.out.println("Result: "+test(array_nums));

        System.out.println("Exercise 31");

        /*
        Напишите программу на Java, чтобы проверить, равна ли сумма всех десятичных чисел в массиве 30.
        Возвращаемое значение false, если условие не удовлетворяет, иначе true.
         */

        //Мой вариант
//        int[] num = {10, 77, 10, 54, -11, 10};
//        System.out.println("The original array: " + Arrays.toString(num));
//        System.out.println("The sum of all decimal numbers in the array is 30: " + sumNum(num));

        //Вариант 2
//        int[] array_nums = {10, 77, 10, 54, -11, 10};
//        System.out.println("Original Array: "+Arrays.toString(array_nums));
//        int search_num = 10;
//        int fixed_sum = 30;
//
//        System.out.println("Result: "+result(array_nums, search_num, fixed_sum));

        System.out.println("Exercise 32");

        /*
        Напишите программу на Java, чтобы проверить, содержит ли массив целых чисел два указанных элемента 65 и 77.
         */

        //Мой вариант
//        int[] num = {77, 77, 65, 65, 65, 77};
//        System.out.println("The original array: " + Arrays.toString(num));
//        int check65 = 0;
//        int check77 = 0;
//        System.out.println("Does the array of integers contain the two specified elements 65 and 77: " + checkNum(num, check65, check77));

        //Вариант 2
//        int[] array_nums = {77, 77, 65, 65, 65, 77};
//        System.out.println("Original Array: "+Arrays.toString(array_nums));
//        int num1 = 77;
//        int num2 = 65;
//
//        System.out.println("Result: "+result(array_nums, num1, num2));

        System.out.println("Exercise 33");

        /*
        Напишите Java-программу для удаления дублирующих элементов данного массива и возврата новой длины массива.
        Образец массива: [20, 20, 30, 40, 50, 50, 50]
        После удаления дублирующих элементов программа должна вернуть 4 в качестве новой длины массива.
         */

        //Мой вариант
//        int[] num = {20, 20, 30, 40, 50, 50, 50};
//        System.out.println("The original array: " + Arrays.toString(num));
//        System.out.println("Long: " + num.length);
//        int[] newArr = removeDuplicate(num);
//        System.out.println("Array without duplicates: " + Arrays.toString(newArr));
//        System.out.println("Long: " + newArr.length);

        //Вариант 2
//        int nums[] = {20, 20, 30, 40, 50, 50, 50};
//        System.out.println("Original array length: "+nums.length);
//        System.out.print("Array elements are: ");
//        for (int i = 0; i < nums.length; i++)
//        {
//            System.out.print(nums[i]+" ");
//        }
//        System.out.println("\nThe new length of the array is: "+array_sort(nums));

        System.out.println("Exercise 34");

        /*
        Напишите программу на Java, чтобы найти длину самой длинной последовательной последовательности элементов
        из заданного несортированного массива целых чисел.
        Образец массива: [49, 1, 3, 200, 2, 4, 70, 5]
        Самая длинная последовательность последовательных элементов - это [1, 2, 3, 4, 5], поэтому программа вернет ее длину 5.
         */

        //Вариант 2
//        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};
//        System.out.println("Original array length: "+nums.length);
//        System.out.print("Array elements are: ");
//        for (int i = 0; i < nums.length; i++)
//        {
//            System.out.print(nums[i]+" ");
//        }
//        System.out.println("\nThe new length of the array is: "+longest_sequence(nums));

        System.out.println("Exercise 35");

        /*
        Напишите программу на Java, чтобы найти сумму двух элементов данного массива, которая равна заданному целому числу.
        Образец массива: [1,2,4,5,6]
        Целевое значение: 6.
         */

        //Мой вариант
//        int[] num = {1, 2, 4, 5, 6};
//        System.out.println("The original array: " + Arrays.toString(num));
//        int n = 6;
//
//        for (int i = 0; i < num.length; i++) {
//            for (int k = 0+i; k < num.length; k++) {
//                if (num[i] + num[k] == n) {
//                    System.out.println(num[i] + " + " + num[k] + " = " + n);
//                }
//            }
//        }

        //Вариант 2
//        ArrayList<Integer> my_array = new ArrayList<Integer>();
//        my_array.add(1);
//        my_array.add(2);
//        my_array.add(4);
//        my_array.add(5);
//        my_array.add(6);
//        int target = 6;
//        ArrayList<Integer> result = two_sum_array_target(my_array, target);
//        for(int i : result)
//            System.out.print("Index: "+i + " ");

        System.out.println("Exercise 36");

        /*
        Напишите программу на Java, чтобы найти все уникальные триплеты, в которых сумма всех трех элементов [x, y, z (x ≤ y ≤ z)] равна указанному числу.
        Пример массива: [1, -2, 0, 5, -1, -4]
        Целевое значение: 2.
         */

        //Мой вариант
//        int[] num = {1, -2, 0, 5, -1, -4};
//        System.out.println("The original array: " + Arrays.toString(num));
//        int n = 2;
//
//        System.out.println("Unique triplets with sum n: ");
//        for (int i = 0; i < num.length; i++) {
//            for (int k = 0+i; k < num.length; k++) {
//                for (int g = 0+k; g < num.length; g++) {
//                    if ((num[i] + num[k] + num[g]) == n) {
//                        System.out.println(num[i] + " + " + num[k] + " + " + num[g] + " = " + n);
//                    }
//                }
//            }
//        }

        //Вариант 2
//        int[] input = {1, -2, 0, 5, -1, -4};
//        int target = 2;
//        Arrays1_53 r = new Arrays1_53();
//        System.out.println(r.threeSum(input,target));

        System.out.println("Exercise 37");

        /*
        Напишите Java-программу для создания массива ее антидиагоналей из заданной квадратной матрицы.

        Пример:
        Вход:
        1 2
        3 4
        Выход:
        [
        [1],
        [2, 3],
        [4]
        ]
        Входные данные:
        [10, 20, 30]
        [50, 60, 70]
        [90, 100, 110]
        Выход:
        [10]
        [20, 50]
        [30, 60, 90]
        [70, 100]
        [110]
         */

        //Вариант 2
//        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        temp.add(10);
//        temp.add(20);
//        temp.add(30);
//        A.add(new ArrayList<Integer>(temp));
//        temp.clear();
//
//        temp.add(50);
//        temp.add(60);
//        temp.add(70);
//        A.add(new ArrayList<Integer>(temp));
//        temp.clear();
//
//        temp.add(90);
//        temp.add(100);
//        temp.add(110);
//        A.add(new ArrayList<Integer>(temp));
//        temp.clear();
//        for(ArrayList<Integer> t : A)
//            System.out.println(t);
//
//        ArrayList<ArrayList<Integer>> result  = diagonalEfficient(A);
//        for(ArrayList<Integer> t : result)
//            System.out.println(t);

        System.out.println("Exercise 38");

        /*
        Напишите программу на Java, чтобы получить элемент контрольного числа из заданного массива целых чисел, содержащих дубликаты.

        Элемент большинства: элемент большинства - это элемент, который появляется более чем в n / 2 раза, где n - размер массива.
         */

        //Мой вариант
//        int[] num = {5, 2, 7, 7, 7};
//        System.out.println("The original array: " + Arrays.toString(num));
//        int n = num.length;
//
//        findMajority(num, n);

        //Вариант 2
//        // Array - test majority element
//        int nums[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
//        System.out.println("Original Array : "+Arrays.toString(nums));
//        int result = MajorityElement(nums);
//        if (result != -1)
//            System.out.println("Majority element is " + result);
//        else
//            System.out.println("Majority element does not exist");

        System.out.println("Exercise 39");

        /*
        Напишите Java-программу для печати всех ЛИДЕРОВ в массиве.

        Примечание. Элемент является лидером, если он больше всех элементов с правой стороны.
         */

        //Мой вариант
//        int[] num = {10, 9, 14, 23, 15, 0, 9};
//        System.out.println("Original Array: " + Arrays.toString(num));
//
//        for(int i = 0; i < num.length; i++) {
//            int j;
//            for(j = i+1; j < num.length; j++) {
//                if (num[i] <= num[j]) {
//                    break;
//                }
//            }
//            if (j == num.length) {
//                System.out.print(num[i] + " ");
//            }
//        }

        //Вариант 2
//        int arr[] = {10, 9, 14, 23, 15, 0, 9};
//        int size = arr.length;
//        for (int i = 0; i < size; i++)
//        {
//            int j;
//            for (j = i + 1; j < size; j++)
//            {
//                if (arr[i] <= arr[j])
//                    break;
//            }
//            if (j == size)
//                System.out.print(arr[i] + " ");
//        }

        System.out.println("Exercise 40");

        /*
        Напишите программу на Java, чтобы найти два элемента из заданного массива положительных
        и отрицательных чисел, чтобы их сумма была ближе всего к нулю.
         */

        //Вариант 2
//        int arr[] = {1, 5, -4, 7, 8, -6};
//        int size = arr.length;
//        int l, r, min_sum, sum, min_l_num, min_r_num;
//
//        if(size < 2)
//        {
//            System.out.println("Invalid Input");
//            return;
//        }
//
//        min_l_num = 0;
//        min_r_num = 1;
//        min_sum = arr[0] + arr[1];
//
//        for(l = 0; l < size - 1; l++)
//        {
//            for(r = l+1; r < size; r++)
//            {
//                sum = arr[l] + arr[r];
//                if(Math.abs(min_sum) > Math.abs(sum))
//                {
//                    min_sum = sum;
//                    min_l_num = l;
//                    min_r_num = r;
//                }
//            }
//        }
//
//        System.out.println("Two elements whose sum is minimum are "+
//                arr[min_l_num]+ " and "+arr[min_r_num]);

        System.out.println("Exercise 41");

        /*
        Напишите программу на Java, чтобы найти самые маленькие и вторые самые маленькие элементы данного массива.
         */

        //Вариант 2
//        int arr[] = {5, 7, -8, 5, 14, 1};
//
//        int first_element, second_element, arr_size = arr.length;
//
//        /* Return if the array size less than two */
//        if (arr_size < 2)
//        {
//            System.out.println("Array size less than two.");
//            return;
//        }
//
//        first_element = second_element = Integer.MAX_VALUE;
//        for (int i = 0; i < arr_size ; i ++)
//        {
//            /* Update both first and second if current element is smaller than first. */
//            if (arr[i] < first_element)
//            {
//                second_element = first_element;
//                first_element = arr[i];
//            }
//
//            /* Update second if arr[i] is between first and second
//               elements.*/
//            else if (arr[i] < second_element && arr[i] != first_element)
//                second_element = arr[i];
//        }
//        if (second_element == Integer.MAX_VALUE)
//            System.out.println("No second smallest element.");
//        else
//            System.out.println("The smallest element is " +
//                    first_element + " and second Smallest  element is " + second_element +".");

        System.out.println("Exercise 42");

        /*
        Напишите Java-программу для разделения всех нулей на левой стороне и всех единиц
        на правой стороне заданного массива нулей и единиц.
         */

        //Мой вариант
        //Решение в упражнении 26

        //Вариант 2
//        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
//        int i,  nums_size = nums.length;
//        int left = 0, right = nums_size - 1;
//
//        System.out.println("Original Array : "+Arrays.toString(nums));
//
//        while (left < right)
//        {
//            /* While  0 at left increment left index  */
//            while (nums[left] == 0 && left < right)
//                left++;
//
//            /* While we see 1 at right decrement right index*/
//            while (nums[right] == 1 && left < right)
//                right--;
//
//
//            if (left < right)
//            {
//                nums[left] = 0;
//                nums[right] = 1;
//                left++;
//                right--;
//            }
//        }
//
//        System.out.println("Array after segregation is : "+Arrays.toString(nums));

        System.out.println("Exercise 43");

        /*
        Напишите программу на Java, чтобы найти все комбинации из четырех элементов данного массива,
        сумма которых равна заданному значению.
         */

        //Мой вариант
//        int[] num = {10, 20, 30, 40, 1, 2};
//        System.out.println("The original array: " + Arrays.toString(num));
//        int n = 53;
//
//        for(int i = 0; i < num.length; i++) {
//            for(int j = i+1; j < num.length; j++) {
//                for(int k = j+1; k < num.length; k++) {
//                    for(int q = k+1; q < num.length; q++) {
//                        if (num[i] + num[j] + num[k] + num[q] == n) {
//                            System.out.println(num[i] + " + " + num[j] + " + " + num[k] + " + " + num[q] + " = " + n);
//                        }
//                    }
//                }
//            }
//        }

        //Вариант 2

//        int nums[] = {10, 20, 30, 40, 1, 2};
//        int n = nums.length;
//        // given value
//        int s = 53;
//        System.out.println("Given value: "+s);
//        System.out.print("Combination of four elements:");
//        // Find other three elements after fixing first element
//        for (int i = 0; i < n - 3; i++)
//        {
//            // Find other two elements after fixing second element
//            for (int j = i + 1; j < n - 2; j++)
//            {
//                // Find the fourth element after fixing third element
//                for (int k = j + 1; k < n - 1; k++)
//                {
//                    // find the fourth
//                    for (int l = k + 1; l < n; l++)
//                    {
//                        if (nums[i] + nums[j] + nums[k] + nums[l] == s)
//                            System.out.print("\n"+nums[i]+" "+nums[j]+" "+nums[k]
//                                    +" "+nums[l]);
//                    }
//                }
//            }
//        }

        System.out.println("Exercise 44");

        /*
        Напишите программу на Java для подсчета количества возможных треугольников из заданного несортированного массива натуральных чисел.
         */

        //Вариант 2
//        int nums[] = {6, 7, 9, 16, 25, 12, 30, 40};
//        int n = nums.length;
//        System.out.println("Original Array : "+Arrays.toString(nums));
//        // Sort the array elements in non-decreasing order
//        Arrays.sort(nums);
//
//        // Initialize count of triangles
//        int ctr = 0;
//
//        for (int i = 0; i < n-2; ++i)
//        {
//            int x = i + 2;
//
//            for (int j = i+1; j < n; ++j)
//            {
//                while (x < n && nums[i] + nums[j] > nums[x])
//                    ++x;
//                ctr += x - j - 1;
//            }
//        }
//        System.out.println("Total number of triangles:  " +ctr);

        System.out.println("Exercise 45");

        /*
        Напишите Java-программу для циклического вращения заданного массива по часовой стрелке на единицу.
         */

        //Мой вариант
//        int[] num = {10, 20, 30, 40, 1, 2};
//        System.out.println("Original Array: " + Arrays.toString(num));
//        //Указываем индекс, который будем перемещать
//        int n = num.length-1;
//        shiftToRight(num, n);
//        }
//        public static void shiftToRight (int[] num, int n) {
//        int temp = num[n];
//
//        for(int i = n; i > 0; i--) {
//            num[i] = num[i-1];
//        }
//        num[0] = temp;
//
//        System.out.println("Array after shifting to right by one : "+Arrays.toString(num));

        //Вариант 2
//        System.out.println("Original arraay:");
//        System.out.println(Arrays.toString(arra));
//
//        rotate_array();
//
//        System.out.println("Rotated arraay:");
//        System.out.println(Arrays.toString(arra));

        System.out.println("Exercise 46");

        /*
        Напишите программу на Java, чтобы проверить, существует ли пара с указанной суммой заданного отсортированного и повернутого массива.
         */

//        int arr_int[] = {22, 25, 17, 18, 19, 20};
//        int sum = 42;
//        int n = arr_int.length;
//
//        if (sum_pair(arr_int, n, sum))
//            System.out.print("Array has a pair of elements with sum 42.");
//        else
//            System.out.print("Array has no pair with sum 42.");

        System.out.println("Exercise 47");

        /*
        Напишите программу на Java, чтобы найти число оборотов в данном повернутом отсортированном массиве целых чисел.
         */

//        int arr_int[] = {35, 32, 30, 14, 18, 21, 27};
//        // int arr_int[] = {35, 32, 14, 18, 21, 27};
//        // int arr_int[] = {35, 14, 18, 21, 27};
//        int n = arr_int.length;
//        System.out.println(count_rotations(arr_int, n));

        System.out.println("Exercise 48");

        /*
        Напишите программу на Java, чтобы упорядочить элементы заданного массива целых чисел, где
        все отрицательные целые числа появляются перед всеми положительными целыми числами.
         */

//        int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
//        System.out.println("Original Array: "+Arrays.toString(nums));
//        sort_nums(nums);
//        System.out.println("New Array: "+Arrays.toString(nums));

        System.out.println("Exercise 49");

        /*
        Напишите программу на Java, чтобы упорядочить элементы заданного массива целых чисел, где
        все положительные целые числа появляются перед всеми отрицательными целыми числами.
         */

//        int arra_nums[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
//        System.out.println("Original array : "+Arrays.toString(arra_nums));
//        int j,temp,arr_size;
//        arr_size = 8;
//        for (int i = 0; i <arr_size; i++){
//            j = i;
//
//            //Shift positive numbers left, negative numbers right
//
//            while ((j > 0) && (arra_nums[j] >0) && (arra_nums[j-1] < 0)){
//                temp = arra_nums[j];
//                arra_nums[j] = arra_nums[j-1];
//                arra_nums[j-1] = temp;
//                j--;
//            }
//        }
//        System.out.println("New array : "+Arrays.toString(arra_nums));

        System.out.println("Exercise 50");

        /*
        Напишите Java-программу для сортировки массива натуральных чисел данного массива, в отсортированном массиве
        значение первого элемента должно быть максимальным, второе значение должно быть минимальным значением,
        третье должно быть вторым максимумом, четвертая секунда - вторым минимумом и т. Д. на.
         */

//        int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int result[];
//
//        System.out.println("Original Array ");
//        System.out.println(Arrays.toString(nums));
//
//        result = rearrange(nums,nums.length);
//
//        System.out.println("New Array ");
//        System.out.println(Arrays.toString(result));

        System.out.println("Exercise 51");

        /*
        Напишите программу на Java, чтобы разделить 0 в левой части и 1 в правой части массива из 0 и 1 в случайном порядке.
         */

//        int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1,0 };
//        int result[];
//        System.out.println("Original Array ");
//        System.out.println(Arrays.toString(arr));
//        int n = arr.length;
//
//        result = separate_0_1(arr, n);
//        System.out.println("New Array ");
//        System.out.println(Arrays.toString(result));

        System.out.println("Exercise 52");

        /*
        Напишите Java-программу для разделения четных и нечетных чисел заданного массива целых чисел.
        Сначала ставьте все четные числа, а затем нечетные.
         */

//        int nums[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
//        int result[];
//        System.out.println("Original Array ");
//        System.out.println(Arrays.toString(nums));
//        result = separate_odd_even(nums);
//
//        System.out.print("Array after separation ");
//        System.out.println(Arrays.toString(result));

        System.out.println("Exercise 53");

        /*
        Напишите программу на Java, чтобы заменить каждый элемент следующим наибольшим элементом (справа) в заданном массиве целых чисел.
         */

//        int nums[] = {45, 20, 100, 23, -5, 2, -6};
//        int result[];
//        System.out.println("Original Array ");
//        System.out.println(Arrays.toString(nums));
//        result = next_greatest_num(nums);
//        System.out.println("The modified array:");
//        System.out.println(Arrays.toString(result));
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

    //Упражнение 22
//    static void  pairs_value(int inputArray[], int inputNumber)
//    {
//        System.out.println("Pairs of elements and their sum : ");
//
//        for (int i =  0; i < inputArray.length; i++)
//        {
//            for (int j  = i+1; j < inputArray.length; j++)
//            {
//                if(inputArray[i]+inputArray[j] == inputNumber)
//                {
//                    System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
//                }
//            }
//        }
//    }

    //Упражнение 23
//    static void  equality_checking_two_arrays(int[] my_array1, int[] my_array2)
//    {
//        boolean  equalOrNot = true;
//
//        if(my_array1.length == my_array2.length)
//        {
//            for (int i  = 0; i < my_array1.length; i++)
//            {
//                if(my_array1[i] != my_array2[i])
//                {
//                    equalOrNot = false;
//                }
//            }
//        }
//        else
//        {
//            equalOrNot  = false;
//        }
//
//        if  (equalOrNot)
//        {
//            System.out.println("Two arrays are equal.");
//        }
//        else
//        {
//            System.out.println("Two  arrays are not equal.");
//        }
//    }

    //Упражнение 26
    // Метод для перемещения всех нулей, присутствующих в массиве, в конец
//    public static void reorder (int[] num) {
//        // `k` сохраняет индекс следующей доступной позиции
//        int k = 0;
//        // делаем для каждого элемента
//        for (int i : num) {
//            // если текущий элемент отличен от нуля, поместить элемент в
//            // следующая свободная позиция в массиве
//            if (i != 0) {
//                num[k++] = i;
//            }
//        }
//        // перемещаем все 0 в конец массива (оставшиеся индексы)
//        for (int i = k; i < num.length; i++) {
//            num[i] = 0;
//        }
//    }

    //Упражнение 30
//    public static boolean check (int[] num) {
//        for(int i : num) {
//            if (i == 0 || i == -1) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean test(int[] numbers) {
//        for (int number : numbers) {
//            if (number == 0 || number == -1) {
//                return false;
//            }
//        }
//        return true;
//    }

    //Упражнение 31
//    public static boolean sumNum(int[] num) {
//        int n = 0;
//        for (int i : num) {
//            if (i == 10) {
//                n++;
//                if (n == 3) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    public static boolean result(int[] numbers, int search_num, int fixed_sum) {
//        int temp_sum = 0;
//        for (int number : numbers) {
//            if (number == search_num) {
//                temp_sum += search_num;
//            }
//            if (temp_sum > fixed_sum) {
//                break;
//            }
//        }
//        return temp_sum == fixed_sum;
//    }

    //Упражнение 32
//    public static boolean checkNum(int[] num, int check65, int check77) {
//        for (int i : num) {
//            if (i == 65) {
//                check65++;
//            } else if (i == 77) {
//                check77++;
//            }
//        }
//        System.out.println("Values 65: " + check65);
//        System.out.println("Values 77: " + check77);
//        if (check65 >= 1 && check77 >= 1) {
//            return true;
//        }
//        return false;
//    }

//    public static boolean result(int[] array_nums, int num1, int num2) {
//        for (int number : array_nums) {
//            boolean r = number != num1 && number != num2;
//            if (r) {
//                return false;
//            }
//        }
//        return true;
//    }

    //Упражнение 33
//    public static int[] removeDuplicate (int[] num) {
//        int k = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (i == 0 || num[i] != num[i - 1]) {
//                num[k++] = num[i];
//            }
//        }
//        return Arrays.copyOf(num, k);
//    }

//    public static int array_sort(int[] nums) {
//        int index = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[index-1])
//                nums[index++] = nums[i];
//        }
//        return index;
//    }

    //Упражнение 34
//    public static int longest_sequence(int[] nums) {
//        final HashSet<Integer> h_set = new HashSet<Integer>();
//        for (int i : nums) h_set.add(i);
//        int longest_sequence_len = 0;
//        for (int i : nums) {
//            int length = 1;
//            for (int j = i - 1; h_set.contains(j); --j) {
//                h_set.remove(j);
//                ++length;
//            }
//            for (int j = i + 1; h_set.contains(j); ++j) {
//                h_set.remove(j);
//                ++length;
//            }
//            longest_sequence_len = Math.max(longest_sequence_len, length);
//        }
//        return longest_sequence_len;
//    }

    //Упражнение 35
//    public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
//
//        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        result.add(0);
//        result.add(1);
//        for(int i = 0; i < a.size(); i++){
//            if(my_map.containsKey(a.get(i))){
//                int index = my_map.get(a.get(i));
//                result.set(0, index );
//                result.set(1, i );
//                break;
//            }
//            else{
//                my_map.put(b - a.get(i), i);
//            }
//        }
//
//        return result;
//    }

    //Упражнение 36
//    public List<List<Integer>> threeSum(int[] nums, int target) {
//        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
//
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i; j < nums.length ;j++){
//                for(int k = j; k<nums.length;k++){
//                    if ( i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)){
//                        List<Integer> inner_List = new ArrayList<Integer>(3);
//                        inner_List.add(nums[i]);
//                        inner_List.add(nums[j]);
//                        inner_List.add(nums[k]);
//                        my_List.add(inner_List);
//                    }
//                }
//            }
//        }
//        return my_List;
//    }

    //Упражнение 37
//    public static ArrayList<ArrayList<Integer>> Exercise37(ArrayList<ArrayList<Integer>> A) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        int m = A.size();
//        int n = A.get(0).size();
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        temp.add(A.get(0).get(0));
//        result.add(new ArrayList<Integer>(temp));
//        int i = 0;
//        while(i < m){
//            System.out.printf("For i : %d \n", i );
//            int j = i+1;
//            while(j < n){
//                int k = i;
//                int l = j;
//                temp.clear();
//                System.out.printf("\t For j : %d \n", j );
//                while(l >= 0 && k < m){
//                    System.out.printf("\t \t For k : %d and l : %d  add \n", k, l, A.get(k).get(l) );
//                    temp.add(A.get(k).get(l));
//                    k++;
//                    l--;
//                }
//                System.out.println("\t \t Temp : " + temp);
//
//                result.add(new ArrayList<Integer>(temp));
//                j++;
//            }
//
//
//            i++;
//        }
//        temp.clear();
//        temp.add(A.get(m-1).get(n-1));
//        result.add(new ArrayList<Integer>(temp));
//        return result;
//    }
//    public static ArrayList<ArrayList<Integer>> diagonalEfficient(ArrayList<ArrayList<Integer>> A) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        int m = A.size();
//        int n = A.get(0).size();
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        temp.add(A.get(0).get(0));
//        result.add(new ArrayList<Integer>(temp));
//
//
//        int j;
//        int i = 0;
//        j = i+1;
//        while(j < n){
//            int k = i;
//            int l = j;
//            temp.clear();
//            while(k < m && l >= 0){
//                temp.add(A.get(k).get(l));
//                k++;
//                l--;
//            }
//            result.add(new ArrayList<Integer>(temp));
//            j++;
//        }
//
//        i = 1;
//        j = n-1;
//        while(i < m){
//            int k = i;
//            int l = j;
//            temp.clear();
//            while(k < m && l >= 0){
//                temp.add(A.get(k).get(l));
//                k++;
//                l--;
//            }
//            result.add(new ArrayList<Integer>(temp));
//            i++;
//        }
//
//
//
//        temp.clear();
//        return result;
//    }

    //Упражнение 38
//    public static void findMajority (int[] num, int n) {
//        int maxCount = 0;
//        int index = -1;
//
//        for(int i = 0; i < n; i++) {
//            int count = 0;
//            for(int j = 0; j < n; j++) {
//                if (num[i] == num[j]) {
//                    count++;
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                index = i;
//            }
//        }
//        if (maxCount > n/2) {
//            System.out.println(num[index]);
//        } else {
//            System.out.println ("No Majority Element");
//        }
//    }

//    public static int MajorityElement(int arra1[])
//    {
//        int n = arra1.length;
//        // Hash Map
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//        // Element's frequency in a map
//        for (int i = 0; i < n; i++)
//        {
//            if (map.get(arra1[i]) == null)
//                map.put(arra1[i], 0);
//
//            map.put(arra1[i], map.get(arra1[i]) + 1);
//        }
//        // Return the element if its count is more than n/2
//        Iterator it = map.entrySet().iterator();
//        while (it.hasNext())
//        {
//            Map.Entry pair = (Map.Entry)it.next();
//            if ((int)pair.getValue() > n/2)
//                return (int)pair.getKey();
//            it.remove();
//        }
//        // no majority element
//        return -1;
//    }

    //Упражнение 45
//    static int arra[] = new int[]{10, 20, 30, 40, 50, 60};
//
//    static void rotate_array()
//    {
//        int a = arra[arra.length-1], i;
//        for (i = arra.length-1; i > 0; i--)
//            arra[i] = arra[i-1];
//        arra[0] = a;
//    }

    //Упражнение 46
//    static boolean sum_pair(int arr_int[],
//                            int n, int x)
//    {
//        int k;
//        for (k = 0; k < n - 1; k++)
//            if (arr_int[k] > arr_int[k+1])
//                break;
//
//        int l = (k + 1) % n;
//
//        int r = k;
//
//        while (l != r)
//        {
//            if (arr_int[l] + arr_int[r] == x)
//                return true;
//            if (arr_int[l] + arr_int[r] < x)
//                l = (l + 1) % n;
//
//            else
//                r = (n + r - 1) % n;
//        }
//        return false;
//    }

    //Упражнение 47
//    static int count_rotations(int arr_int[], int n)
//    {
//        int min_val = arr_int[0], min_index = -1;
//        for (int i = 0; i < n; i++)
//        {
//            if (min_val > arr_int[i])
//            {
//                min_val = arr_int[i];
//                min_index = i;
//            }
//        }
//        return min_index;
//    }

    //Упражнение 48
//    public static void sort_nums(int[] nums) {
//        int pos_num = 0;
//        int neg_num = 0;
//        int i, j;
//        int max = Integer.MIN_VALUE;
//        for (i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) neg_num++;
//            else pos_num++;
//            if (nums[i] > max) max = nums[i];
//        }
//        max++;
//        if (neg_num == 0 || pos_num == 0) return;
//        i = 0;
//        j = 1;
//        while (true) {
//            while (i <= neg_num && nums[i] < 0) i++;
//            while (j < nums.length && nums[j] >= 0) j++;
//            if (i > neg_num || j >= nums.length) break;
//            nums[i] += max * (i + 1);
//            swap_nums(nums, i, j);
//        }
//        i = nums.length - 1;
//        while (i >= neg_num) {
//            int div = nums[i] / max;
//            if (div == 0) i--;
//            else {
//                nums[i] %= max;
//                swap_nums(nums, i, neg_num + div - 2);
//            }
//        }
//    }
//    private static void swap_nums(int[] nums, int i , int j){
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }

    //Упражнение 50
//    static int[] rearrange(int[] new_arra, int n)
//    {
//        int temp[] = new int[n];
//
//        int small_num = 0, large_num = n-1;
//        boolean flag = true;
//
//        for (int i=0; i < n; i++)
//        {
//            if (flag)
//                temp[i] = new_arra[large_num--];
//            else
//                temp[i] = new_arra[small_num++];
//
//            flag = !flag;
//        }
//
//        return temp;
//    }

    //Упражнение 51
//    static int [] separate_0_1(int arr[], int n) {
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0)
//                count++;
//        }
//
//        for (int i = 0; i < count; i++)
//            arr[i] = 0;
//
//        for (int i = count; i < n; i++)
//            arr[i] = 1;
//
//        return arr;
//    }

    //Упражнение 52
//    static int [] separate_odd_even(int arr[])
//    {
//        int left_side = 0, right_side = arr.length - 1;
//        while (left_side < right_side)
//        {
//            while (arr[left_side]%2 == 0 && left_side < right_side)
//                left_side++;
//
//            while (arr[right_side]%2 == 1 && left_side < right_side)
//                right_side--;
//
//            if (left_side < right_side)
//            {
//                int temp = arr[left_side];
//                arr[left_side] = arr[right_side];
//                arr[right_side] = temp;
//                left_side++;
//                right_side--;
//            }
//        }
//        return arr;
//    }

    //Упражнение 53
//    static int [] next_greatest_num(int arr_nums[])
//    {
//        int size = arr_nums.length;
//        int max_from_right_num =  arr_nums[size-1];
//        arr_nums[size-1] = -1;
//
//        for (int i = size-2; i >= 0; i--)
//        {
//            int temp = arr_nums[i];
//            arr_nums[i] = max_from_right_num;
//            if(max_from_right_num < temp)
//                max_from_right_num = temp;
//        }
//        return arr_nums;
//    }
}
