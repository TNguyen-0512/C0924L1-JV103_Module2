package ss3_array.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng:");
        int size1 = Integer.parseInt(sc.nextLine());
        int[] array = new int[size1];
        System.out.println("Nhập các phần tử mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i]) {
                min = array[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
