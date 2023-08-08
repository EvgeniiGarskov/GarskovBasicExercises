package BasicExercises.Inheritance;

public class Inheritance2 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса Vehicle с методом drive(). Создайте подкласс с именем Car,
        который переопределяет метод drive() для печати «Ремонт автомобиля».

        Эта программа создает класс под названием «Транспортное средство» с методом, называемым drive(), и подклассом,
        называемым Car, который переопределяет метод drive() для печати «Ремонт автомобиля».

        Объяснение:

        В этой программе мы сначала определяем родительский класс с именем Vehicle с помощью метода drive(), который
        просто выводит на консоль «Починка автомобиля».

        Затем мы создаем подкласс с именем Car, который расширяет класс Vehicle и переопределяет метод drive(), чтобы
        вместо этого напечатать «Reparing a car».

        В методе main() мы создаем экземпляр классов Vehicle и Car и вызываем метод drive() для каждого объекта.
        Результатом первого вызова drive() будет «Ремонт автомобиля», а результатом второго вызова drive() будет
        «Ремонт автомобиля», как определено в классе Car.
         */

//        Vehicle vehicle = new Vehicle();
//        vehicle.drive();
//        Car car = new Car();
//        car.drive();
    }
}

//class Vehicle {
//
//    public void drive() {
//        System.out.println("Repairing a vehicle");
//    }
//}
//
//class Car extends Vehicle {
//
//    @Override
//    public void drive() {
//        System.out.println("Car repair");
//    }
//}
