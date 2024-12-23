package ss10_DSA.bai_tap.Service;

import ss10_DSA.bai_tap.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IStudentService {


    ArrayList<Student> findAllStudent();

    ArrayList<Student> addStudent(Student student);

    ArrayList<Student> updateStudent(int id, String name, int age, LocalDate birthday, String address);

    ArrayList<Student> deleteStudent(int id);
}