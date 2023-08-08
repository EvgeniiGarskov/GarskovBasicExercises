package BasicExercises.Inheritance;

public class Inheritance7 {

    public static void main(String[] args) {

        /*
        Напишите программу Java для создания класса, известного как Person, с методами getFirstName() и getLastName().
        Создайте подкласс с именем Employee, который добавляет новый метод с именем getEmployeeId() и переопределяет
        метод getLastName(), чтобы включить название должности сотрудника.

        Объяснение:

        Класс Person имеет две частные переменные экземпляра, firstName и lastName, и два общедоступных метода,
        getFirstName() и getLastName(), которые возвращают значения этих переменных.

        Класс Employee является подклассом Person и добавляет две закрытые переменные экземпляра, employeeId и
        jobTitle, а также общедоступный метод getEmployeeId(). Он также переопределяет метод getLastName() из класса
        Person, чтобы включить jobTitle сотрудника.

        В приведенном выше основном классе мы создаем два экземпляра класса Employee, а именно «employee1» и «employee2».

        «employee1» инициализируется значениями «Kortney» для имени, «Rosalee» для фамилии, 4451 для идентификатора
        сотрудника и «HR Manager» для должности. Вызываются методы getFirstName(), getLastName() и getEmployeeId()
        сотрудника "employee1". Их возвращаемые значения объединяются в строку, которая выводится на консоль.

        Точно так же вызываются методы getFirstName(), getLastName() и getEmployeeId() сотрудника Employee2.
        Их возвращаемые значения объединяются в строку, которая выводится на консоль.
         */

//        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
//        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
//        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
//        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}

//class Person {
//    private String firstName;
//    private String lastName;
//
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//}
//
//class Employee extends Person {
//    private int employeeId;
//    private String jobTitle;
//
//    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
//        super(firstName, lastName);
//        this.employeeId = employeeId;
//        this.jobTitle = jobTitle;
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//    @Override
//    public String getLastName() {
//        return super.getLastName() + ", " + jobTitle;
//    }
//}
