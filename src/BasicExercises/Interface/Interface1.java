package BasicExercises.Interface;

public class Interface1 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания формы интерфейса с помощью метода getArea(). Создайте три
        класса Rectangle, Circle и Triangle, реализующие интерфейс Shape. Реализуйте метод getArea() для каждого
        из трех классов.
         */

//        Rectangle rectangle = new Rectangle(10.0, 12.0);
//        Circle circle = new Circle(5.0);
//        Triangle triangle = new Triangle(7.0, 8.0, 6.0);
//
//        rectangle.getArea();
//        circle.getArea();
//        triangle.getArea();
    }
}

//interface Shape {
//
//    public void getArea();
//}
//
//class Rectangle implements Shape {
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
//    public void getArea() {
//        double a = length * width;
//        System.out.println("Area: " + a);
//    }
//}
//
//class Circle implements Shape {
//
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public void getArea() {
//        double a = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area: " + a);
//    }
//}
//
//class Triangle implements Shape {
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
//    public void getArea() {
//        double s = (side1 + side2 + side3) / 2;
//        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//        System.out.println("Area: " + a);
//    }
//}