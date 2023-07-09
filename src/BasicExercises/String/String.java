package BasicExercises.String;

public class String {

    public static void main(String[] args) {

        /*
        Упражнения со строками в Java

        1. Напишите программу на Java, чтобы получить символ с заданным индексом в строке.

        Пример вывода:

        Исходная строка = Упражнения Java!
        Символ в позиции 0 - J
        Символ на позиции 10 - это i

        2. Напишите программу на Java, чтобы получить символ (кодовая точка Unicode) по заданному индексу в строке.

        Пример вывода:

        Исходная строка: w3resource.com
        Символ (точка Юникода) = 51
        Символ (точка Юникода) = 101

        3. Напишите программу на Java, чтобы получить символ (кодовая точка Unicode) перед указанным индексом в строке.

        Пример вывода:

        Исходная строка: w3resource.com
        Символ (точка Юникода) = 119
        Символ (точка Юникода) = 99

        4. Напишите программу на Java для подсчета кодовых точек Unicode в указанном текстовом диапазоне строки.

        Пример вывода:

        Исходная строка: w3rsource.com
        Количество кодовых точек = 9

        5. Напишите программу на Java для лексикографического сравнения двух строк.
        Две строки лексикографически равны, если они имеют одинаковую длину и содержат одни и те же символы в одних и тех же позициях.

        Пример вывода:

        Строка 1: это упражнение 1
        Строка 2: это упражнение 2
        «Это упражнение 1» меньше, чем «Это упражнение 2».

        6. Напишите программу на Java для лексикографического сравнения двух строк, игнорируя различия в регистре.

        Пример вывода:

        Строка 1: это упражнение 1
        Строка 2: это упражнение 1
        «Это упражнение 1» равносильно «Это упражнение 1».

        7. Напишите программу на Java для объединения заданной строки с концом другой строки.

        Пример вывода:

        Строка 1: PHP-упражнения и
        Строка 2: упражнения Python
        Объединенная строка: упражнения PHP и упражнения Python

        8. Напишите программу на Java, чтобы проверить, содержит ли заданная строка указанную последовательность значений char.

        Пример вывода:

        Исходная строка: упражнения PHP и упражнения Python
        Указанная последовательность значений char: и
        истинный

        9. Напишите программу на Java для сравнения заданной строки с заданной последовательностью символов.

        Пример вывода:

        Сравнение example.com и example.com: правда
        Сравнение Example.com и example.com: false

        10. Напишите программу на Java для сравнения заданной строки с заданным строковым буфером.

        Пример вывода:

        Сравнение example.com и example.com: правда
        Сравнение Example.com и example.com: false

        11. Напишите программу на Java для создания объекта String с массивом символов.

        Пример вывода:

        В книге 234 страницы.

        12. Напишите программу на Java, чтобы проверить, заканчивается ли данная строка другой строкой.

        Пример вывода:

        «Упражнения на Python» заканчиваются на «se»? ЛОЖЬ
        «Упражнение на Python» заканчивается на «se»? истинный

        13. Напишите программу на Java, чтобы проверить, содержат ли два объекта String одни и те же данные.

        Пример вывода:

        "Стивен Эдвин Кинг" равно "Уолтер Винчелл"? ЛОЖЬ
        «Стивен Эдвин Кинг» равен «Майку Ройко»? ЛОЖЬ

        14. Напишите программу на Java для сравнения данной строки с другой строкой, игнорируя регистр символов.

        Пример вывода:

        "Стивен Эдвин Кинг" равно "Уолтер Винчелл"? ЛОЖЬ
        "Стивен Эдвин Кинг" равно "Стивен Эдвин Кинг"? истинный

        15. Напишите программу на Java для печати текущей даты и времени в указанном формате.

        Пример вывода:

        Текущая дата и время:
        19 июня 2017 г.
        15:13
        NB: текущая дата и время изменятся в соответствии с датой и временем вашей системы.

        16. Напишите программу на Java, чтобы получить содержимое заданной строки в виде массива байтов.

        Пример вывода:

        Новая строка равна Это образец строки.

        17. Напишите программу на Java, чтобы получить содержимое заданной строки в виде массива символов.

        Пример вывода:

        Массив символов равен "[ C@2a139a55 "

        18. Напишите программу на Java для создания отдельного идентификатора для данной строки.

        Пример вывода:

        Хэш для упражнений Python. это 863132599

        19. Напишите программу на Java, чтобы получить индекс всех символов алфавита.

        Пример вывода:

        abcdefghij
        ==========================
        36 10 7 40 2 16 42 1 6 20

        клмнопкрст
        ============================
        8 35 22 14 12 23 4 11 24 31

        uvwxyz
        ================
        5 27 13 18 38 37
        Образец строки всего алфавита: «Быстрая коричневая лиса перепрыгивает через ленивую собаку».


        20. Напишите программу на Java, чтобы получить каноническое представление строкового объекта.

        Пример вывода:

        ул1 == ул2? ЛОЖЬ
        ул1 == ул3? истинный

        21. Напишите программу на Java, чтобы получить последний индекс строки в строке.

        Пример вывода:

        abcdefghij
        ============================
        36 10 7 40 33 16 42 32 6 20

        клмнопкрст
        ============================
        8 35 22 14 41 23 4 29 24 31

         uvwxyz
        =================
        21 27 13 18 38 37
        Образец строки всего алфавита: «Быстрая коричневая лиса перепрыгивает через ленивую собаку».


        22. Напишите программу на Java, чтобы получить длину заданной строки.

        Пример вывода:

        Длина строки «example.com»: 11

        23. Напишите программу на Java, чтобы выяснить, соответствует ли регион в текущей строке региону в другой строке.

        Пример вывода:

        ул1[0 - 7] == ул2[28 - 35]? истинный
        ул1[9 - 15] == ул2[9 - 15]? ЛОЖЬ

        24. Напишите программу на Java для замены указанного символа другим символом.

        Пример вывода:

        Исходная строка: Быстрая коричневая лиса перепрыгивает через ленивую собаку.
        Новая строка: Быстрая коричневая лиса прыгает через ленивый туман.

        25. Напишите программу на Java для замены каждой подстроки заданной строки, которая соответствует заданному регулярному выражению, заданной заменой.

        Пример строки: «Быстрая коричневая лиса перепрыгивает через ленивую собаку».

        В приведенной выше строке замените все лисы на кошку.

        Пример вывода:

        Исходная строка: Быстрая коричневая лиса перепрыгивает через ленивую собаку.
        Новая строка: быстрая коричневая кошка перепрыгивает через ленивую собаку.

        26. Напишите программу на Java, чтобы проверить, начинается ли данная строка с другой строки.

        Пример вывода:

        Красный - любимый цвет. начинается с красного? истинный
        Оранжевый тоже мой любимый цвет. начинается с красного? ЛОЖЬ

        27. Напишите программу на Java, чтобы получить подстроку заданной строки в двух указанных позициях.

        Пример вывода:

        old = Быстрая коричневая лиса перепрыгивает через ленивую собаку.
        новый = коричневая лиса прыгает

        28. Напишите программу на Java для создания массива символов, содержащего строку.

        Пример вывода:

        Java-упражнения.

        29. Напишите программу на Java для преобразования всех символов строки в нижний регистр.

        Пример вывода:

        Оригинальная струна: The Quick Brown FoX!
        Строка в нижнем регистре: быстрая коричневая лиса!

        30. Напишите программу на Java для преобразования всех символов строки в верхний регистр.

        Пример вывода:

        Оригинальная струна: The Quick Brown FoX!
        Строка в верхнем регистре: THE QUICK BROWN FOX!

        31. Напишите программу на Java, чтобы обрезать начальные или конечные пробелы в заданной строке.

        Пример вывода:

        Исходная строка: упражнения Java
        Новая строка: упражнения Java

        32. Напишите программу на Java для поиска самой длинной палиндромной подстроки в строке.

        Пример вывода:

        Данная строка: thequickbrownfoxxofnworkquickthe
        Самая длинная подстрока палиндрома в задании
        строка есть; коричневая фоксофнворб
        Длина палиндромной подстроки: 16

        33. Напишите программу на Java для поиска всех чередований заданных строк.

        Пример вывода:

        Даны строки: WX YZ
        Чередующиеся строки:
        YWZX
        WYZX
        YWXZ
        WXYZ
        YZWX
        WYXZ

        34. Напишите программу на Java для поиска второго наиболее часто встречающегося символа в заданной строке.

        Пример вывода:

        Данная строка: успехи
        Второй наиболее часто встречающийся символ в строке: c

        35. Напишите программу на Java для вывода всех перестановок заданной строки с повторением.

        Пример вывода:

        Данная строка: PQR
        Переставленные строки:
        ГЧП
        ППК
        ППР
        ...
        рекомендованная розничная цена
        RRQ
        РРР

        36. Напишите программу на Java, чтобы проверить, существуют ли между собой две строки данной строки. Предполагая, что уникальные символы присутствуют в обеих строках.

        Пример вывода:

        Данная строка: PMQNO
        Чередующиеся строки - это MNO и PQ.
        Данная строка чередуется: true

        Данная строка: PNQMO
        Чередующиеся строки - это MNO и PQ.
        Данная строка чередуется: false

        37. Напишите программу на Java, чтобы найти длину самой длинной подстроки заданной строки без повторяющихся символов.

        Пример вывода:

        Входная строка: выбрать самую длинную подстроку
        Самая длинная подстрока: [u, b, s, t, r, i, n, g]
        Самая длинная длина подстроки: 8

        38. Напишите программу на Java для вывода результата удаления дубликатов из заданной строки.

        Пример вывода:

        Данная строка: w3resource
        После удаления повторяющихся символов новая строка будет выглядеть так: w3resouc.

        39. Напишите программу на Java для поиска первого неповторяющегося символа в строке.

        Пример вывода:

        Данная строка: gibblegabbler
        Первый неповторяющийся символ в String: i

        40. Напишите программу на Java для разделения строки на n равных частей.

        Пример вывода:

        Данная строка: abcdefghijklmnopqrstuvwxy
        Строка разделена на 5 частей, а именно:

        abcde
        фгидж
        клмно
        первый
        uvwxy

        41. Напишите программу на Java для удаления повторяющихся символов из заданной строки, которые появляются в другой заданной строке.

        Пример вывода:

        Данная строка: быстрая коричневая лиса
        Данная строка маски: королева

        Новая строка:
        лиса с густыми бровями

        42. Напишите программу на Java для вывода списка элементов, содержащих все символы заданного слова.

        Пример вывода:

        Даны следующие строки: кролик взятка собака
        Данное слово: нагрудник

        Строки, содержащие все буквы данного слова:
        кролик
        взятка

        43. Напишите программу на Java для поиска наиболее часто встречающегося символа в строке.

        Пример вывода:

        Данная строка: тестовая строка
        Максимальное количество символов в данной строке: t

        44. Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

        Пример вывода:

        Дана строка: Быстрая коричневая лиса прыгает.
        Строка в обратном порядке:
        spmuj xof nworb kciuq ehT
         */
    }
}