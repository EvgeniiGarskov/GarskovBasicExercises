package BasicExercises.Polymorphism;

public class Polymorphism6 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса Shape с методами getArea() и getPerimeter(). Создайте три
        подкласса: Circle, Rectangle и Triangle. Переопределите методы getArea() и getPerimeter() в каждом подклассе,
        чтобы вычислить и вернуть площадь и периметр соответствующих фигур.
         */

//        Rectangle rectangle = new Rectangle(10.0, 12.0);
//        rectangle.rectangleInfo();
//        rectangle.getArea();
//        rectangle.getPerimeter();
//
//        Circle circle = new Circle(5.0);
//        circle.circleInfo();
//        circle.getArea();
//        circle.getPerimeter();
//
//        Triangle triangle = new Triangle(7.0, 8.0, 6.0);
//        triangle.triangleInfo();
//        triangle.getArea();
//        triangle.getPerimeter();
    }
}

//class Shape {
//
//    public void getArea() {
//        System.out.println("Area = 0");
//    }
//
//    public void getPerimeter() {
//        System.out.println("Perimeter = 0");
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
//    public double getRadius() {
//        return radius;
//    }
//
//    @Override
//    public void getArea() {
//        double a = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area: " + a);
//    }
//
//    @Override
//    public void getPerimeter() {
//        double p = 2 * Math.PI * radius;
//        System.out.println("Perimeter: " + p);
//    }
//
//    public void circleInfo() {
//        System.out.println("\nCircle: radius - " + getRadius());
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
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    @Override
//    public void getArea() {
//        double a = length * width;
//        System.out.println("Area: " + a);
//    }
//
//    @Override
//    public void getPerimeter() {
//        double p = 2 * (length + width);
//        System.out.println("Perimeter: " + p);
//    }
//
//    public void rectangleInfo() {
//        System.out.println("Rectangle: length - " + getLength() + ", width - " + getWidth());
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
//    public void getArea() {
//        double s = (side1 + side2 + side3) / 2;
//        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//        System.out.println("Area: " + a);
//    }
//
//    @Override
//    public void getPerimeter() {
//        double p = (double)(side1 + side2 + side3);
//        System.out.println("Perimeter: " + p);
//    }
//
//    public void triangleInfo() {
//        System.out.println("\nTriangle: side1 - " + getSide1() + ", side2 - " + getSide2() + ", side3 - " + getSide3());
//    }
//}