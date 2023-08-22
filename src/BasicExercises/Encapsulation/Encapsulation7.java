package BasicExercises.Encapsulation;

import java.util.ArrayList;

public class Encapsulation7 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса Student с частными переменными экземпляра Student_id,
        Student_name и Grades. Предоставьте общедоступные методы получения и установки для доступа и изменения
        переменных Student_id и Student_name. Однако предоставьте метод addGrade(), который позволяет добавлять
        оценку к переменной Grades, одновременно выполняя дополнительную проверку.
         */

//        Student student = new Student();
//        student.setStudentId(1);
//        student.setStudentName("Evgeniy");
//
//        student.addGrade(92.5);
//        student.addGrade(84.5);
//        student.addGrade(76.3);
//
//        System.out.println("Student info: ");
//        System.out.println("Student ID: " + student.getStudentId());
//        System.out.println("Student Name: " + student.getStudentName());
//        System.out.println("Grades: " + student.getGrades());
    }
}

//class Student {
//
//    private int student_id;
//    private String student_name;
//    private ArrayList<Double> grades;
//
//    public int getStudentId() {
//        return student_id;
//    }
//
//    public void setStudentId(int student_id) {
//        this.student_id = student_id;
//    }
//
//    public String getStudentName() {
//        return student_name;
//    }
//
//    public void setStudentName(String student_name) {
//        this.student_name = student_name;
//    }
//
//    public ArrayList <Double> getGrades() {
//        return grades;
//    }
//
//    public void addGrade(double grade) {
//        if (grades == null) {
//            grades = new ArrayList < > ();
//        }
//        grades.add(grade);
//    }
//}