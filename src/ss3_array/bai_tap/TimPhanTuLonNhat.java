package ss3_array.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = {
                {5,92,8},
                {9,7,6},
                {11,12,15},
        };
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
