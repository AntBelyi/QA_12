package hw_7.Task_2;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int age, double gpa, int id, String name) {
        this.age = age;
        this.gpa = gpa;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public List<Student> addStudent(List<Student> list, Student student) {
//        List<Student> resultStudent = list;
//        resultStudent.add(student);
//        return resultStudent;
        list.add(student);
        return list;
    }

    public List<Student> removeStudentById(List<Student> list, int id) {
        List<Student> resultId = list;
        resultId.remove(id);
        return resultId;
    }

    public List<Student> studentFindStudentByName(List<Student> list, String name) {
        for (Student student : list) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found");
                return (List<Student>) student;
            }
        }
        System.out.println("the student will not find");
        return null;
    }

    public void printAllStudents(List<Student> list) {
        System.out.println(list);
    }


}
