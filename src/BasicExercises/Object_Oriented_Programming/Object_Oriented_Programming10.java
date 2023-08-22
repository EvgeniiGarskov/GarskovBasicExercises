package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;

public class Object_Oriented_Programming10 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Студент» с именем, оценкой и атрибутами курсов, а также
        методами для добавления и удаления курсов.
         */

//        Student std1 = new Student("Evgenii", "10");
//        Student std2 = new Student("Lilya", "11");
//        Student std3 = new Student("Stefani", "10");
//
//        std1.printStudentDetails();
//        std2.printStudentDetails();
//        std3.printStudentDetails();
//
//        System.out.println("Adding courses for " + std1.getName());
//        std1.addCourse("Math");
//        std1.addCourse("Science");
//        std1.addCourse("English");
//        System.out.println(std1.getName() + "'s courses: " + std1.getCourses());
//
//        System.out.println("\nAdding courses for " + std2.getName());
//        std2.addCourse("Literature");
//        std2.addCourse("Music");
//        std2.addCourse("English");
//        System.out.println(std2.getName() + "'s courses: " + std2.getCourses());
//
//        System.out.println("\nAdding courses for " + std3.getName());
//        std3.addCourse("Technology");
//        std3.addCourse("Science");
//        std3.addCourse("English");
//        System.out.println(std3.getName() + "'s courses: " + std3.getCourses());
//
//        System.out.println("\nDeleting a 'math' course for " + std1.getName());
//        std1.removeCourse("Math");
//        System.out.println(std1.getName() + "'s courses: " + std1.getCourses());
    }
}

//class Student {
//    String name;
//    String grade;
//
//    ArrayList<String> courses;
//
//    public Student(String name, String grade) {
//        this.name = name;
//        this.grade = grade;
//        this.courses = new ArrayList <String> ();
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
//    public String getGrade() {
//        return grade;
//    }
//
//    public void setGrade(String grade) {
//        this.grade = grade;
//    }
//
//    public void printStudentDetails() {
//
//        System.out.println("Student Information: ");
//        System.out.println("Name: " + getName() + "\nGrade: " + getGrade() + "\n");
//    }
//
//    public void addCourse(String сourse) {
//        courses.add(сourse);
//    }
//
//    public void removeCourse(String сourse) {
//        courses.remove(сourse);
//    }
//
//    public ArrayList <String> getCourses() {
//        return courses;
//    }
//}