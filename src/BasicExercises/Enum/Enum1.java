package BasicExercises.Enum;

public class Enum1 {

    //Мой вариант

//    enum DaysOfWeek {
//        Monday,
//        Tuesday,
//        Wednesday,
//        Thursday,
//        Friday,
//        Saturday,
//        Sunday
//    }

    //Вариант 2

//    public enum Days_Of_Week {
//        SUNDAY,
//        MONDAY,
//        TUESDAY,
//        WEDNESDAY,
//        THURSDAY,
//        FRIDAY,
//        SATURDAY
//    }

    public static void main(String[] args) {

    /*
    Напишите программу на Java для создания перечисления DaysOfWeek, представляющего дни недели.

    Объяснение:

    Вышеприведенная программа определяет перечисление Days_Of_Week с семью значениями, представляющими каждый день
    недели. Внутри основного метода мы создаем сегодня переменную типа Days_Of_Week и присваиваем ей
    значение MONDAY. Наконец, мы печатаем сегодняшнее значение, используя System.out.println(). Измените и
    используйте это перечисление в соответствии с вашими требованиями.
     */

        //Мой вариант

//        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
//            System.out.println(daysOfWeek);
//        }

        //Вариант 2

//        Days_Of_Week today = Days_Of_Week.MONDAY;
//        System.out.println("Today is " + today);
    }
}
