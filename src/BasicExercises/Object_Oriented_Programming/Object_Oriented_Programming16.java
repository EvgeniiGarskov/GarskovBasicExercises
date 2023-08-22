package BasicExercises.Object_Oriented_Programming;

public class Object_Oriented_Programming16 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Форма» с абстрактными методами вычисления площади и
        периметра и подклассов «Прямоугольник», «Окружность» и «Треугольник».
         */

//        Rectangle rectangle = new Rectangle(10.0, 12.0);
//        rectangle.rectangleInfo();
//        rectangle.calculateArea();
//        rectangle.calculatePerimeter();
//
//        Circle circle = new Circle(5.0);
//        circle.circleInfo();
//        circle.calculateArea();
//        circle.calculatePerimeter();
//
//        Triangle triangle = new Triangle(7.0, 8.0, 6.0);
//        triangle.triangleInfo();
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
//class Rectangle extends Shape {
//
//    double length;
//    double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    @Override
//    public void calculateArea() {
//        double a = length * width;
//        System.out.println("Area: " + a);
//    }
//
//    @Override
//    public void calculatePerimeter() {
//        double p = 2 * (length + width);
//        System.out.println("Perimeter: " + p);
//    }
//
//    public void rectangleInfo() {
//        System.out.println("Rectangle: length - " + getLength() + ", width - " + getWidth());
//    }
//}
//
//class Circle extends Shape {
//
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    @Override
//    public void calculateArea() {
//        double a = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area: " + a);
//    }
//
//    @Override
//    public void calculatePerimeter() {
//        double p = 2 * Math.PI * radius;
//        System.out.println("Perimeter: " + p);
//    }
//
//    public void circleInfo() {
//        System.out.println("\nCircle: radius - " + getRadius());
//    }
//}
//
//class Triangle extends Shape {
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
//    public double getSide1() {
//        return side1;
//    }
//
//    public double getSide2() {
//        return side2;
//    }
//
//    public double getSide3() {
//        return side3;
//    }
//
//    @Override
//    public void calculateArea() {
//        double s = (side1 + side2 + side3) / 2;
//        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//        System.out.println("Area: " + a);
//    }
//
//    @Override
//    public void calculatePerimeter() {
//        double p = (double)(side1 + side2 + side3);
//        System.out.println("Perimeter: " + p);
//    }
//
//    public void triangleInfo() {
//        System.out.println("\nTriangle: side1 - " + getSide1() + ", side2 - " + getSide2() + ", side3 - " + getSide3());
//    }
//}