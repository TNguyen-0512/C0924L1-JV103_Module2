package ss10_DSA.bai_tap.Service;

import ss10_DSA.bai_tap.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface IStudentService {


    List<String> findAllStudent();

    void addStudent(Student student);

    ArrayList<Student> updateStudent(int id, String name, int age, LocalDate birthday, String address);

    ArrayList<Student> deleteStudent(int id);
}