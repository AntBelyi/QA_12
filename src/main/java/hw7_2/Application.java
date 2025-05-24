package hw7_2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Bogdan", 20, 4.3));
        studentList.add(new Student(2, "Masha", 19, 3.8));
        studentList.add(new Student(3, "Sergij", 22, 4.7));
        studentList.add(new Student(4, "Olena", 21, 4.1));
        studentList.add(new Student(5, "German", 18, 2.9));

        System.out.println("Initial list of students:");
        Student.printAllStudents(studentList);

        Student newStudent = new Student(6, "Oksana", 20, 4.2);
        Student.addStudent(studentList, newStudent);

        System.out.println("After adding a new student:");
        Student.printAllStudents(studentList);

        Student.removeStudentById(studentList, 3);
        System.out.println("After removing a student:");
        Student.printAllStudents(studentList);

        System.out.println("Search for a student by name:");
        Student found = Student.findStudentByName(studentList, "Olena");
        if (found != null) {
            System.out.println("Found:" + " " + found);
        }
    }
}