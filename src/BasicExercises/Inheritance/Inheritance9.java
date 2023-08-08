package BasicExercises.Inheritance;

public class Inheritance9 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания иерархии классов транспортных средств. Базовым классом должен быть
        Vehicle с подклассами Truck, Car и Motorcycle. Каждый подкласс должен иметь такие свойства, как марка, модель,
        год и тип топлива. Внедрить методы расчета эффективности использования топлива, пройденного расстояния и
        максимальной скорости.

        Объяснение:

        Приведенный класс является основным классом, который содержит основной метод. Он создает экземпляры каждого
        типа транспортного средства, устанавливает их значения, а затем распечатывает их соответствующие данные и
        расчеты, такие как эффективность использования топлива, пройденное расстояние и максимальная скорость.
         */

//        Truck truck = new Truck("Scania", "R420", "2011", "ДТ", 10.1, 4.5);
//        System.out.println("Truck Model: " + truck.getBrand()
//                + " " + truck.getModel() + " " + truck.getYear() + " " + truck.getFuelType());
//        System.out.println("Fuel Efficiency: " + truck.fuelEfficiency() + " mpg");
//        System.out.println("Distance Traveled: " + truck.distanceTraveled() + " miles");
//        System.out.println("Max Speed: " + truck.maximumSpeed() + " mph\n");
//        System.out.println();
//
//        Car car = new Car("BMW", "X7", "2023", "АИ95", 5.3, 8);
//        System.out.println("Car Model: " + car.getBrand()
//                + " " + car.getModel() + " " + car.getYear() + " " + car.getFuelType());
//        System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " mpg");
//        System.out.println("Distance Traveled: " + car.distanceTraveled() + " miles");
//        System.out.println("Max Speed: " + car.maximumSpeed() + " mph\n");
//        System.out.println();
//
//        Motorcycle motorcycle = new Motorcycle("HARLEY-DAVIDSON", "Heritage Softail Classic FLSTC", "1993", "АИ92", 2.3, 2.1);
//        System.out.println("Motorcycle Model: " + motorcycle.getBrand()
//                + " " + motorcycle.getModel() + " " + motorcycle.getYear() + " " + motorcycle.getFuelType());
//        System.out.println("Fuel Efficiency: " + motorcycle.fuelEfficiency() + " mpg");
//        System.out.println("Distance Traveled: " + motorcycle.distanceTraveled() + " miles");
//        System.out.println("Max Speed: " + motorcycle.maximumSpeed() + " mph");
//        System.out.println();
    }
}

//abstract class Vehicle {
//
//    /*
//    Объяснение:
//
//    Это абстрактный класс, который служит родительским классом для других классов транспортных средств. Он содержит
//    пять закрытых переменных экземпляра (make, model, year, FuelType и FuelEfficiency) и шесть общедоступных методов
//    (конструктор, пять геттеров для переменных экземпляра и три абстрактных метода). Абстрактные методы предназначены
//    для переопределения дочерними классами с конкретными реализациями.
//     */
//    private String brand;
//    private String model;
//    private String year;
//    private String fuelType;
//    private double fuelEfficiency;
//
//    public Vehicle(String brand, String model, String year, String fuelType, double fuelEfficiency) {
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//        this.fuelType = fuelType;
//        this.fuelEfficiency = fuelEfficiency;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public String getFuelType() {
//        return fuelType;
//    }
//
//    public double getFuelEfficiency() {
//        return fuelEfficiency;
//    }
//
//    public abstract double fuelEfficiency();
//
//    public abstract double distanceTraveled();
//
//    public abstract double maximumSpeed();
//}
//
//class Truck extends Vehicle {
//
//    /*
//    Объяснение:
//
//    Вышеупомянутый класс является дочерним классом транспортного средства и расширяет класс транспортного средства.
//    У него есть дополнительная переменная экземпляра, cargoCapacity. У класса есть конструктор, принимающий все
//    необходимые параметры, включая грузоподъемность. Класс переопределяет три абстрактных метода родительского класса и
//    предоставляет конкретные реализации методов.
//     */
//    private double cargoCapacity;
//
//    public Truck(String brand, String model, String year, String fuelType, double fuelEfficiency, double cargoCapacity) {
//        super(brand, model, year, fuelType, fuelEfficiency);
//        this.cargoCapacity = cargoCapacity;
//    }
//
//    public double getCargoCapacity() {
//        return cargoCapacity;
//    }
//
//    @Override
//    public double fuelEfficiency() {
//        // implementation for fuel efficiency calculation for trucks
//        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
//    }
//
//    @Override
//    public double distanceTraveled() {
//        // implementation for distance traveled calculation for trucks
//        return fuelEfficiency() * getFuelEfficiency();
//    }
//
//    @Override
//    public double maximumSpeed() {
//        // implementation for maximum speed calculation for trucks
//        return 80.0;
//    }
//}
//
//class Car extends Vehicle {
//
//    /*
//    Объяснение:
//
//    Приведенный выше класс является еще одним дочерним классом автомобиля и расширяет класс автомобиля. У него есть
//    дополнительная переменная экземпляра, numSeats. У класса есть конструктор, который принимает все необходимые
//    параметры, включая количество мест. Класс переопределяет три абстрактных метода родительского класса и предоставляет
//    конкретные реализации методов.
//     */
//    private int numSeats;
//
//    public Car(String brand, String model, String year, String fuelType, double fuelEfficiency, int numSeats) {
//        super(brand, model, year, fuelType, fuelEfficiency);
//        this.numSeats = numSeats;
//    }
//
//    public int getNumSeats() {
//        return numSeats;
//    }
//
//    @Override
//    public double fuelEfficiency() {
//        // implementation for fuel efficiency calculation for cars
//        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
//    }
//
//    @Override
//    public double distanceTraveled() {
//        // implementation for distance traveled calculation for cars
//        return fuelEfficiency() * getFuelEfficiency();
//    }
//
//    @Override
//    public double maximumSpeed() {
//        // implementation for maximum speed calculation for cars
//        return 120.0;
//    }
//}
//
//class Motorcycle extends Vehicle {
//
//    /*
//    Объяснение:
//
//    Это также дочерний класс транспортного средства и расширяет класс транспортного средства. У него есть дополнительная
//    переменная экземпляра engineDisplacement. У класса есть конструктор, который принимает все необходимые параметры.
//    Класс переопределяет три абстрактных метода родительского класса и предоставляет конкретные реализации методов.
//     */
//    private double engineDisplacement;
//
//    public Motorcycle(String brand, String model, String year, String fuelType, double fuelEfficiency, double engineDisplacement) {
//        super(brand, model, year, fuelType, fuelEfficiency);
//        this.engineDisplacement = engineDisplacement;
//    }
//
//    public double getEngineDisplacement() {
//        return engineDisplacement;
//    }
//
//    @Override
//    public double fuelEfficiency() {
//        // implementation for fuel efficiency calculation for motorcycles
//        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
//    }
//
//    @Override
//    public double distanceTraveled() {
//        // implementation for distance traveled calculation for cars
//        return fuelEfficiency() * getFuelEfficiency();
//    }
//
//    @Override
//    public double maximumSpeed() {
//        // implementation for maximum speed calculation for cars
//        return 80.0;
//    }
//}
