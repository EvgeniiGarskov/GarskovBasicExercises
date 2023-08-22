package BasicExercises.Polymorphism;

public class Polymorphism2 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса Vehicle с помощью метода SpeedUp(). Создайте два подкласса
        Car и Bicycle. Переопределите метод SpeedUp() в каждом подклассе, чтобы увеличить скорость автомобиля
        по-разному.
         */

//        Car car = new Car();
//        Bicycle bicycle = new Bicycle();
//
//        System.out.println("\nThe initial speed of the car: " + car.getSpeed());
//        System.out.println("The initial speed of the bicycle: " + bicycle.getSpeed());
//        System.out.println();
//
//        car.speedUp();
//        bicycle.speedUp();
//
//        System.out.println("\nThe speed of the car after acceleration: " + car.getSpeed());
//        System.out.println("The speed of the bicycle after acceleration: " + bicycle.getSpeed());
    }
}

//class Vehicle {
//
//    private int speed;
//
//    public void speedUp() {
//        speed += 10;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//}
//
//class Car extends Vehicle{
//
//    @Override
//    public void speedUp() {
//        super.speedUp();
//        System.out.println("The speed of the car is increased by 10 units");
//    }
//}
//
//class Bicycle extends Vehicle{
//
//    @Override
//    public void speedUp() {
//        super.speedUp();
//        System.out.println("The speed of the bicycle is increased by 20 units");
//    }
//}