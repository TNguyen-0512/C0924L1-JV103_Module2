package ss4_class_oop.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số c:");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double delta = qe.getDiscriminant();
        if (delta > 0) {
            double root1 = qe.getRoot1();
            double root2 = qe.getRoot2();
            System.out.println("Phương trình có 2 nghiệm: x1 = " + root1 + " x2 = " + root2);
        } else if (delta == 0) {
            double root1 = qe.getRoot1();
            System.out.println("Phương trình có 1 nghiệm x1 = x2 = " + root1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
