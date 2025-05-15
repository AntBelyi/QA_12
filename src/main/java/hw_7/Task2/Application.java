package hw_7.Task2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student oneStudent = new Student(25, 2.3, 412, "Max");
        Student twoStudent = new Student(24, 3.2, 635, "Alex");
        Student threeStudent = new Student(33, 4.2, 963, "Olga");
        Student fourStudent = new Student(16, 5.2, 456, "Natasha");
        Student fiveStudent = new Student(22, 4.5, 852, "Mark");
        list.add(oneStudent);
        list.add(twoStudent);
        list.add(threeStudent);
        list.add(fourStudent);
        list.add(fiveStudent);
        System.out.println(list);

        Student newStudent = new Student(20, 2.3, 412, "Maria");
        newStudent.addStudent(list, newStudent);
        System.out.println(list + "add new student");
        System.out.println(oneStudent.removeStudentById(list, 1));
        Student found = oneStudent.findStudentByName(list, "Max");
        oneStudent.printAllStudents(list);
    }

}
