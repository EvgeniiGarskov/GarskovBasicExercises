package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;

public class Object_Oriented_Programming14 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Школа» с атрибутами для учащихся, учителей и классов,
        а также методами для добавления и удаления учеников и учителей, а также для создания классов.
         */

//        School school = new School();
//
//        Student student1 = new Student("Evgenii", 15);
//        Student student2 = new Student("Lilya", 15);
//        Student student3 = new Student("Maxim", 15);
//        Student student4 = new Student("Alena", 15);
//
//        school.addStudent(student1);
//        school.addStudent(student2);
//        school.addStudent(student3);
//        school.addStudent(student4);
//
//        Teacher teacher1 = new Teacher("Petr", "History");
//        Teacher teacher2 = new Teacher("Genadius", "Mathematics");
//        Teacher teacher3 = new Teacher("Tatyana", "Social Studies");
//
//        school.addTeacher(teacher1);
//        school.addTeacher(teacher2);
//        school.addTeacher(teacher3);
//
//        SchoolClass schoolClass1 = new SchoolClass("History", teacher1);
//        SchoolClass schoolClass2 = new SchoolClass("Mathematics", teacher2);
//        SchoolClass schoolClass3 = new SchoolClass("Social Studies", teacher3);
//
//        school.addSchoolClass(schoolClass1);
//        school.addSchoolClass(schoolClass2);
//        school.addSchoolClass(schoolClass3);
//
//        schoolClass1.addStudent(student1);
//        schoolClass1.addStudent(student2);
//        schoolClass1.addStudent(student3);
//
//        schoolClass2.addStudent(student1);
//        schoolClass2.addStudent(student2);
//        schoolClass2.addStudent(student3);
//        schoolClass2.addStudent(student4);
//
//        schoolClass3.addStudent(student1);
//        schoolClass3.addStudent(student2);
//        schoolClass3.addStudent(student3);
//        schoolClass3.addStudent(student4);
//
//        school.schoolDetails();
//
//        System.out.println("\nInformation about the history class: ");
//        System.out.println("Class name: " + schoolClass1.getClassName());
//        System.out.println("Teacher: " + teacher1.getTeacherName());
//        System.out.println("Number of students: " + schoolClass1.getStudents().size());
//
//        System.out.println("\nInformation about the math class: ");
//        System.out.println("Class name: " + schoolClass2.getClassName());
//        System.out.println("Teacher: " + teacher2.getTeacherName());
//        System.out.println("Number of students: " + schoolClass2.getStudents().size());
//
//        System.out.println("\nInformation about the social studies class: ");
//        System.out.println("Class name: " + schoolClass3.getClassName());
//        System.out.println("Teacher: " + teacher3.getTeacherName());
//        System.out.println("Number of students: " + schoolClass3.getStudents().size());
//
//        school.removeStudent(student1);
//        school.removeTeacher(teacher1);
//        school.removeSchoolClass(schoolClass1);
//
//        System.out.println("\nSchool information after removing one student, teacher and Class: ");
//
//        school.schoolDetails();
    }
}

//class School {
//
//    private ArrayList<Student> students;
//    private ArrayList <Teacher> teachers;
//    private ArrayList <SchoolClass> schoolClasses;
//
//    public School() {
//        students = new ArrayList <Student>();
//        teachers = new ArrayList <Teacher>();
//        schoolClasses = new ArrayList <SchoolClass>();
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void removeStudent(Student student) {
//        students.remove(student);
//    }
//
//    public void addTeacher(Teacher teacher) {
//        teachers.add(teacher);
//    }
//
//    public void removeTeacher(Teacher teacher) {
//        teachers.remove(teacher);
//    }
//
//    public void addSchoolClass(SchoolClass schoolClass) {
//        schoolClasses.add(schoolClass);
//    }
//
//    public void removeSchoolClass(SchoolClass schoolClass) {
//        schoolClasses.remove(schoolClass);
//    }
//
//    public ArrayList <Student> getStudents() {
//        return students;
//    }
//
//    public ArrayList <Teacher> getTeachers() {
//        return teachers;
//    }
//
//    public ArrayList <SchoolClass> getSchoolClasses() {
//        return schoolClasses;
//    }
//
//    public void schoolDetails() {
//
//        System.out.println("Information about the school: ");
//        System.out.println("Number of students: " + getStudents().size() + "\nNumber of teachers: " + getTeachers().size() + "\nNumber of classes: " + getSchoolClasses().size());
//    }
//}
//
//class Student {
//
//    private String studentName;
//    private int studentAge;
//
//    public Student(String studentName, int studentAge) {
//        this.studentName = studentName;
//        this.studentAge = studentAge;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public int getStudentAge() {
//        return studentAge;
//    }
//
//    public void setStudentAge(int studentAge) {
//        this.studentAge = studentAge;
//    }
//}
//
//class Teacher {
//
//    private String teacherName;
//    private String schoolSubject;
//
//    public Teacher(String teacherName, String schoolSubject) {
//        this.teacherName = teacherName;
//        this.schoolSubject = schoolSubject;
//    }
//
//    public String getTeacherName() {
//        return teacherName;
//    }
//
//    public void setTeacherName(String teacherName) {
//        this.teacherName = teacherName;
//    }
//
//    public String getSchoolSubject() {
//        return schoolSubject;
//    }
//
//    public void setSchoolSubject(String schoolSubject) {
//        this.schoolSubject = schoolSubject;
//    }
//}
//
//class SchoolClass {
//
//    private String className;
//    private Teacher teacher;
//
//    private ArrayList <Student> students;
//
//    public SchoolClass(String className, Teacher teacher) {
//        this.className = className;
//        this.teacher = teacher;
//        this.students = new ArrayList <Student>();
//    }
//
//    public String getClassName() {
//        return className;
//    }
//
//    public void setClassName(String className) {
//        this.className = className;
//    }
//
//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void removeStudent(Student student) {
//        students.remove(student);
//    }
//
//    public ArrayList <Student> getStudents() {
//        return students;
//    }
//}