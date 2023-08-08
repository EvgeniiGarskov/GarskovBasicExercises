package BasicExercises.Inheritance;

public class Inheritance8 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса Shape с методами getPerimeter() и getArea(). Создайте подкласс
        Circle, который переопределяет методы getPerimeter() и getArea() для вычисления площади и периметра круга.

        Объяснение:

        В приведенном выше упражнении класс Shape является базовым классом, предоставляющим универсальные методы для
        вычисления периметра и площади фигуры. Класс Circle является подклассом, который расширяет Shape и
        переопределяет методы getPerimeter() и getArea() для реализации формул круга.

        Класс Circle имеет частное поле радиуса, которое принимает аргумент радиуса для инициализации поля. Метод
        getPerimeter() использует формулу 2πr для вычисления длины окружности. Метод getArea() использует формулу πr^2
        для вычисления площади круга.

        В основном классе -

        Данный код создает два объекта Circle, c1 и c2, и вычисляет их периметр и площадь с помощью методов
        getPerimeter() и getArea(). Радиус каждого круга сначала устанавливается с помощью двойной переменной r.
        На выходе отображаются радиус, периметр и площадь каждого круга.
         */

//        Circle circle = new Circle(8);
//
//        circle.getRadius();
//        circle.getPerimeter();
//        circle.getArea();
//
//        System.out.println();
//
//        Circle circle2 = new Circle(3.2);
//
//        circle2.getRadius();
//        circle2.getPerimeter();
//        circle2.getArea();
    }
}

//class Shape {
//
//    public void getPerimeter() {
//
//    }
//    public void getArea() {
//
//    }
//}
//
//class Circle extends Shape {
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public void getRadius() {
//        System.out.println("Radius:\n" + radius);
//    }
//
//    @Override
//    public void getPerimeter() {
//        double pCircle = 2 * Math.PI * radius;
//        System.out.println("Perimeter of the circle:\n" + pCircle);
//    }
//
//    @Override
//    public void getArea() {
//        double sCircle = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area of the circle:\n" + sCircle);
//    }
//}
