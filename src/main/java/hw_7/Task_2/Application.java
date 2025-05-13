package hw_7.Task_2;

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
        oneStudent.addStudent(list,oneStudent);
        twoStudent.addStudent(list,twoStudent);
        threeStudent.addStudent(list,threeStudent);
        fourStudent.addStudent(list,fourStudent);
        fiveStudent.addStudent(list,fiveStudent);
        for (Student student:list){
            System.out.println(student.getAge() + student.getId()+ student.getGpa()+student.getName());
        }
         oneStudent.removeStudentById(list,1);
        oneStudent.studentFindStudentByName(list,"Max");



        System.out.println(list);



    }
}
