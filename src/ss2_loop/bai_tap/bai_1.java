package ss2_loop.bai_tap;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Menu-----");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Break");
        System.out.println("Nhập: ");
        String choice = sc.nextLine();
        String sao = "*";
        switch (choice) {
            case "1":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(sao);
                    }
                    System.out.println();
                }
                break;
            case "2":
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(sao);
                    }
                    System.out.println(" ");
                }
                System.out.println();
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(sao);
                    }
                    System.out.println(" ");
                }
                System.out.println();
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(sao);
                    }
                    System.out.println();
                }
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(sao);
                    }
                    System.out.println();
                }
                break;
            case "3":
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "4":
                break;
            default:
                System.out.println("Chỉ nhập từ 1 - 4");
        }
    }
}