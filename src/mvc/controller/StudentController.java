package mvc.controller;

import mvc.model.Student;
import mvc.util.StudentDAO;

import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentDAO studentDAO;

    public StudentController() {
        studentDAO = new StudentDAO();
        students = studentDAO.readStudentsFromFile();
    }

    public void addStudent(Student student) {
        students.add(student);
        studentDAO.saveStudentsToFile(students);
    }

    public void updateStudent(int id, String name, int age) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                studentDAO.saveStudentsToFile(students);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        studentDAO.saveStudentsToFile(students);
    }

    public void listStudents() {
        students.forEach(System.out::println);
    }
}

