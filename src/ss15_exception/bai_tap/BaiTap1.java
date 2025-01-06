package ss15_exception.bai_tap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        System.out.println("--------------------Bắt đầu chương trình--------------------");
        Scanner sc = new Scanner(System.in);
        float canhA = 0, canhB = 0, canhC = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập cạnh thứ nhất: ");
                canhA = Float.parseFloat(sc.nextLine());
                System.out.println("Nhập cạnh thứ hai: ");
                canhB = Float.parseFloat(sc.nextLine());
                System.out.println("Nhập cạnh thứ ba: ");
                canhC = Float.parseFloat(sc.nextLine());
                checkCanh(canhA, canhB, canhC);
                flag = false;
            } catch (IllegalAccessException e) {
                if (canhA <= 0 || canhB <= 0 || canhC <= 0) {
                  System.out.println("Số nhập phải lớn hơn 0");;
                } else if (canhA + canhB <= canhC || canhC + canhA <= canhB || canhB + canhC <= canhA) {
                    System.out.println("Tổng 2 cạnh không lớn hơn cạnh còn lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cạnh thứ nhất: " + canhA + " \nCạnh thứ 2: " + canhB + " \nCạnh thứ 3: " + canhC);
        System.out.println("--------------------Kết thúc chương trình-------------------");
    }

    public static boolean checkCanh(float canhA, float canhB, float canhC) throws IllegalAccessException {
        if (canhA <= 0 || canhB <= 0 || canhC <= 0) {
            throw new IllegalAccessException("Số nhập phải lớn hơn 0");
        } else if (canhA + canhB <= canhC || canhC + canhA <= canhB || canhB + canhC <= canhA) {
            throw new IllegalAccessException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
        }
        return true;
    }
}
