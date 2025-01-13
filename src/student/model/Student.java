package student.model;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfotoFile() {
        return "id: " + id + ", name: " + name + ", age: " + age;
    }

    public int compareTo(Student o) {
        if (this.getId() - o.getId() == 0) {
            return (this.getName().compareTo(o.getName()));
        } else {
            return (this.getId() - o.getId());
        }
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.id == s.id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
}

