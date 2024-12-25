package ss11_generic_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập kích cỡ Stack: ");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập :");
        for (int i = 0; i < size; i++) {
            stack.push(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Stack trước khi đảo ngược: "+stack);
        Stack<Integer> upStack = new Stack<Integer>();
        for (int i = 0; i < size; i++) {
            upStack.push(stack.pop());
        }
        stack = upStack;
        System.out.println("Stack sau khi dao nguoc: " + stack);
    }
}
