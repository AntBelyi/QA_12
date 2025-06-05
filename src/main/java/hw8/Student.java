import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // toString for display
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", GPA=" + gpa +
                '}';
    }

    // Static method to add a student to the list
    public static List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    // Static method to remove a student by ID
    public static List<Student> removeStudentById(List<Student> students, int id) {
        students.removeIf(s -> s.getId() == id);
        return students;
    }

    // Static method to find a student by name
    public static Student findStudentByName(List<Student> students, String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        System.out.println("Student with name '" + name + "' not found.");
        return null;
    }

    // Static method to print all students
    public static void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
