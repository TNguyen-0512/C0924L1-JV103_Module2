package student.service;

import ss10_DSA.bai_tap.Service.IStudentService;
import ss10_DSA.bai_tap.model.Student;
import student.util.ReadAndWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private final String Student_file ="src/student/data/student.csv";
    private final boolean Append = true;
    private final boolean Not_Append = false;
    @Override
    public List<String> findAllStudent() {
        List<Student> students = new ArrayList<>();
        List<String> studentlist = ReadAndWriteFile.readListObjfile(Student_file);
       return studentlist;
    }

    @Override
    public void addStudent(Student student) {
        List<Student> studentlist = ReadAndWriteFile.readListObjfile(Student_file);
        studentlist.add(student);
        ReadAndWriteFile.writeListObjfile(Student_file, studentlist);
    }

    @Override
    public ArrayList<Student> updateStudent(int id, String name, int age, LocalDate birthday, String address) {
        return null;
    }

    @Override
    public ArrayList<Student> deleteStudent(int id) {
        return null;
    }
}
