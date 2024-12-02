package ss3_array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng trước khi thêm là: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nNhập phần tử muốn thêm vào:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trị thêm vào:");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index >= array.length) {
            System.out.println("Vị trí không hợp lệ !!!");
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = number;
        for (int i = index + 1; i < newArray.length-1; i++) {
            newArray[i+1] = array[i];
        }
        System.out.println("Mảng sau khi thêm là:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
