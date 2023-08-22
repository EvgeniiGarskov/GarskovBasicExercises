package BasicExercises.Object_Oriented_Programming;

import java.time.LocalDate;
import java.time.Period;

public class Object_Oriented_Programming9 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Сотрудник» с атрибутами имени, зарплаты и даты приема на
        работу, а также методом подсчета лет службы.
         */

//        Employee emp1 = new Employee("Evgenii", "40 000", LocalDate.parse("2023-10-04"));
//        Employee emp2 = new Employee("Lilya", "50 000", LocalDate.parse("2018-03-01"));
//        Employee emp3 = new Employee("Stefani", "30 000", LocalDate.parse("2020-04-15"));
//
//        emp1.printEmployeeDetails();
//        emp1.getYearsOfService();
//        emp2.printEmployeeDetails();
//        emp2.getYearsOfService();
//        emp3.printEmployeeDetails();
//        emp3.getYearsOfService();
    }
}

//class Employee {
//    String name;
//    String salary;
//    LocalDate dateOfAdmission;
//
//    public Employee(String name, String salary, LocalDate dateOfAdmission) {
//        this.name = name;
//        this.salary = salary;
//        this.dateOfAdmission = dateOfAdmission;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }
//
//    public LocalDate getDateOfAdmission() {
//        return dateOfAdmission;
//    }
//
//    public void setDateOfAdmission(LocalDate dateOfAdmission) {
//        this.dateOfAdmission = dateOfAdmission;
//    }
//
//    public void printEmployeeDetails() {
//
//        System.out.println("Employee Information: ");
//        System.out.println("Name: " + getName() + "\nSelary: " + getSalary() + "\nDate Of Admission: " + getDateOfAdmission());
//    }
//
//    public void getYearsOfService() {
//
//        Period period = Period.between(dateOfAdmission, LocalDate.now());
//        System.out.printf("Experience is %d years, %d months and %d days \n\n", period.getYears(), period.getMonths(), period.getDays());
//    }
//}
