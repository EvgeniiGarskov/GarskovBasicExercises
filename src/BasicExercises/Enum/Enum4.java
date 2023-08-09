package BasicExercises.Enum;

public class Enum4 {

    //Мой вариант
//    enum Direction {
//        North,
//        South,
//        East,
//        West
//    }

    //Вариант 2

//    public enum Direction {
//        NORTH,
//        SOUTH,
//        EAST,
//        WEST
//    }

    public static void main(String[] args) {

        /*
        Напишите программу на Java для реализации перечисления под названием «Направление» с константами,
        представляющими стороны света (север, юг, восток, запад).

        Объяснение:

        Вышеприведенная программа реализует перечисление Direction с четырьмя значениями, представляющими стороны света:
        СЕВЕР, ЮГ, ВОСТОК и ЗАПАД. Внутри основного метода мы создаем две переменные, direction1 и direction2, оба типа
        Direction, и присваиваем им значения NORTH и WEST. Наконец, мы печатаем значения direction1 и direction2,
        используя System.out.println().
         */

        //Мой вариант

//        Direction north = Direction.North;
//        Direction south = Direction.South;
//        Direction east = Direction.East;
//        Direction west = Direction.West;
//
//        System.out.println("Direction 1: " + north);
//        System.out.println("Direction 2: " + south);
//        System.out.println("Direction 3: " + east);
//        System.out.println("Direction 4: " + west);

        //Вариант 2

//        Direction direction1 = Direction.NORTH;
//        Direction direction2 = Direction.WEST;
//
//        System.out.println("First direction: " + direction1);
//        System.out.println("Second direction: " + direction2);
    }
}
