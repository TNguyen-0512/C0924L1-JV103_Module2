package ss2_loop.bai_tap;

public class SoNguyenToBeHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố < 100: ");
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
