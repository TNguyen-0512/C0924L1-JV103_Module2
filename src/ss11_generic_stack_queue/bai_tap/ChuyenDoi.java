package ss11_generic_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập số: ");
        int number = Integer.parseInt(sc.nextLine());
        int num = number;
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        int binaryNumber = 0;
        while (!stack.isEmpty()) {
            binaryNumber = binaryNumber*10 + stack.pop();
        }
        System.out.println("Số nhị phân của "+ number +" là " +binaryNumber);
    }
}
