package BasicExercises.Inheritance;

public class Inheritance4 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса Employee с методами work() и getSalary(). Создайте подкласс с
        именем HRManager, который переопределяет метод work() и добавляет новый метод с именем addEmployee().

        Объяснение:

        В приведенном выше упражнении класс Employee имеет метод work(), который печатает сообщение, и метод
        getSalary(), который возвращает зарплату сотрудника. Подкласс HRManager расширяет класс Employee и
        переопределяет метод work() для отображения другого сообщения. Он добавляет метод addEmployee(), который
        печатает сообщение о добавлении нового сотрудника. Класс Main создает экземпляр Employee и HRManager, вызывает
        методы work() и getSalary(), а также вызывает метод addEmployee() для объекта HRManager.
         */

//        Employee employee = new Employee(30000);
//        employee.work();
//        System.out.println("Employee salary: " + employee.getSalary());
//
//        HRManager hrManager = new HRManager(50000);
//        hrManager.work();
//        System.out.println("Manager salary: " + hrManager.getSalary());
//
//        hrManager.addEmployee();
    }
}

//class Employee {
//    private int salary;
//
//    public Employee(int salary) {
//        this.salary = salary;
//    }
//
//    public void work() {
//        System.out.println("I work as an employee");
//    }
//    public int getSalary() {
//        return salary;
//    }
//}
//
//class HRManager extends Employee {
//
//    public HRManager(int salary) {
//        super(salary);
//    }
//
//    @Override
//    public void work() {
//        System.out.println("I work as an employee manager");
//    }
//    public void addEmployee() {
//        System.out.println("Adding a new employee");
//    }
//}
