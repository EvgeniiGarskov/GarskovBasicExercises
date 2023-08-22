package BasicExercises.Polymorphism;

public class Polymorphism3 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания базового класса Shape с помощью метода CalculationArea().
        Создайте три подкласса: Circle, Rectangle и Triangle. Переопределите метод CalculationArea() в каждом
        подклассе, чтобы вычислить и вернуть площадь фигуры.
         */

//        Rectangle rectangle = new Rectangle(10.0, 12.0);
//        Circle circle = new Circle(5.0);
//        Triangle triangle = new Triangle(7.0, 8.0, 6.0);
//
//        rectangle.calculateArea();
//        circle.calculateArea();
//        triangle.calculateArea();
    }
}

//class Shape {
//
//    public void calculateArea() {
//        System.out.println("Area = 0");
//    }
//}
//
//class Circle extends Shape{
//
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public void calculateArea() {
//        double a = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area: " + a);
//    }
//}
//
//class Rectangle extends Shape{
//
//    double length;
//    double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    public void calculateArea() {
//        double a = length * width;
//        System.out.println("Area: " + a);
//    }
//}
//
//class Triangle extends Shape{
//
//    double side1;
//    double side2;
//    double side3;
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    @Override
//    public void calculateArea() {
//        double s = (side1 + side2 + side3) / 2;
//        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//        System.out.println("Area: " + a);
//    }
//}