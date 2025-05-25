package hw7;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> studentList = new ArrayList<>();

        // Add 5 students
        Student.addStudent(studentList, new Student(1, "Alice", 20, 3.8));
        Student.addStudent(studentList, new Student(2, "Bob", 21, 3.5));
        Student.addStudent(studentList, new Student(3, "Charlie", 22, 3.9));
        Student.addStudent(studentList, new Student(4, "Diana", 19, 4.0));
        Student.addStudent(studentList, new Student(5, "Ethan", 23, 3.4));

        System.out.println("All students:");
        Student.printAllStudents(studentList);

        System.out.println("\nRemoving student with ID 3...");
        Student.removeStudentById(studentList, 3);

        System.out.println("\nAll students after removal:");
        Student.printAllStudents(studentList);

        System.out.println("\nSearching for student by name 'Bob':");
        Student found = Student.findStudentByName(studentList, "Bob");
        if (found != null) {
            System.out.println("Found student: " + found);
        }

        System.out.println("\nSearching for student by name 'Charlie':");
        Student.findStudentByName(studentList, "Charlie");
    }
}
