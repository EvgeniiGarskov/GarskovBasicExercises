package BasicExercises.Abstract_Classes;

public class AbstractClasses2 {

    public static void main(String[] args) {

        /*
        Напишите программу Java для создания абстрактного класса Shape с абстрактными методами
        calculateArea() и calculatePerimeter(). Создайте подклассы Circle и Triangle, которые расширяют класс Shape и
        реализуют соответствующие методы для вычисления площади и периметра каждой фигуры.

        В следующей программе Shape является абстрактным базовым классом с двумя абстрактными методами:
        calculateArea() и calculatePerimeter(). Классы Circle и Triangle являются подклассами Shape и
        предоставляют собственные реализации абстрактных методов.
         */

//        double radius = 4.0;
//        Shape circle = new Circle(radius);
//        double a = 3.0;
//        double b = 4.0;
//        double c = 5.0;
//        Shape triangle = new Triangle(a, b, c);
//        circle.calculateArea();
//        circle.calculatePerimeter();
//
//        triangle.calculateArea();
//        triangle.calculatePerimeter();
    }
}

//abstract class Shape {
//
//    abstract void calculateArea();
//    abstract void calculatePerimeter();
//}
//
//class Circle extends Shape {
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public void calculateArea() {
//        double sCircle = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area of the circle:\n" + sCircle);
//    }
//    @Override
//    public void calculatePerimeter() {
//        double pCircle = 2 * Math.PI * radius;
//        System.out.println("Perimeter of the circle:\n" + pCircle);
//    }
//}
//
//class Triangle extends Shape {
//    double a;
//    double b;
//    double c;
//
//    public Triangle(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    @Override
//    public void calculateArea() {
//        double s = (a + b + c) / 2;
//        double sTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
//        System.out.println("Area of the triangle:\n" + sTriangle);
//    }
//    @Override
//    public void calculatePerimeter() {
//        double pTriangle = (double)(a + b + c);
//        System.out.println("Perimeter of the triangle:\n" + pTriangle);
//    }
//}
