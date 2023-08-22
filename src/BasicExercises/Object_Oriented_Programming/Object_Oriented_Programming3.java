package BasicExercises.Object_Oriented_Programming;

public class Object_Oriented_Programming3 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Прямоугольник» с атрибутами ширины и высоты.
        Вычислите площадь и периметр прямоугольника.

        Объяснение:

        В функции Main() мы создаем экземпляр класса «Прямоугольник» шириной 7 и высотой 12 и вызываем его методы
        для вычисления площади и периметра. Затем мы изменяем ширину и высоту, используя методы установки, и печатаем
        обновленную площадь и периметр прямоугольника.
         */

//        Rectangle rect1 = new Rectangle(7, 12);
//        System.out.println("Square rect1 = " + rect1.square());
//        System.out.println("Perimeter rect1 = " + rect1.perimeter());
//
//        rect1.setWidth(6);
//        rect1.setHeight(12);
//
//        System.out.println("New square rect1 = " + rect1.square());
//        System.out.println("New perimeter rect1 = " + rect1.perimeter());
    }
}

//class Rectangle {
//
//    /*
//    Объяснение:
//
//    Приведенный выше класс имеет два закрытых атрибута: «ширина» и «высота», конструктор, который инициализирует
//    эти атрибуты значениями, переданными в качестве аргументов, и методы получения и установки для доступа и изменения
//    этих атрибутов. Он также имеет два метода getArea() и getPerimeter() для вычисления площади и периметра прямоугольника.
//     */
//
//    double width;
//    double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public double square() {
//
//        double s = this.width * this.height;
//        return s;
//    }
//
//    public double perimeter() {
//
//        double p = 2 * (this.height + this.width);
//        return p;
//    }
//}