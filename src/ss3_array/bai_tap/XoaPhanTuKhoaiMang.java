package ss3_array.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class XoaPhanTuKhoaiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng trước khi xóa là: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nNhập số cần xóa: ");
        int x = Integer.parseInt(sc.nextLine());
        int index = 0;
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int k : array) {
            if (k != x) {
                newArray[index++] = k;
                count++;
            }
        }
        if (count < array.length) {
            for (int j : newArray) {
                System.out.print(j + " ");
            }
        }else{
            System.out.println("Không tìm thấy phần tử");
        }
    }
}
