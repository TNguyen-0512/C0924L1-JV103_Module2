package ss5_access_modifier.bai_tap.xay_dung_lop_chi_ghi;


public class Student {
    private String name = "John";
    private String classes = "Co2";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Student [name=" + name + ", classes=" + classes + "]";
    }
}
