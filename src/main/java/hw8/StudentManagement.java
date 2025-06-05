import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Add 5 students
        Student.addStudent(studentList, new Student(1, "Alice", 20, 3.5));
        Student.addStudent(studentList, new Student(2, "Bob", 21, 3.8));
        Student.addStudent(studentList, new Student(3, "Charlie", 19, 3.2));
        Student.addStudent(studentList, new Student(4, "David", 22, 3.9));
        Student.addStudent(studentList, new Student(5, "Eve", 20, 3.7));

        // Print all students
        System.out.println("All Students:");
        Student.printAllStudents(studentList);

        // Find student by name
        System.out.println("\nSearching for student named 'Charlie':");
        Student foundStudent = Student.findStudentByName(studentList, "Charlie");
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent);
        }

        // Remove a student by ID
        System.out.println("\nRemoving student with ID 2...");
        Student.removeStudentById(studentList, 2);

        // Print updated list
        System.out.println("\nUpdated Students List:");
        Student.printAllStudents(studentList);
    }
}
