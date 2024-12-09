package ss5_access_modifier.bai_tap.xay_dung_lop_chi_ghi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("----Tên và lớp trước khi đổi----");
        System.out.println(student1.toString());
        System.out.println("---Đổi Tên----");
        student1.setName(in.nextLine());
        System.out.println("----Đổi Lớp----");
        student1.setClasses(in.nextLine());
        System.out.println("----Tên và lớp sau khi đổi----");
        System.out.println(student1.toString());
    }
}
