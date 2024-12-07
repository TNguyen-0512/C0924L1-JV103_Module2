package ss4_class_oop.bai_tap;

import java.util.Random;

public class SelectionSort {
    public static void SelectionSort(int[] arr) {
        int min = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int size = 10000;
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size);
        }
        StopWatch timer = new StopWatch();
        timer.start();
        SelectionSort(arr);
        timer.stop();
        System.out.println("Thời gian thực thi: "+timer.getElapsedTime());
    }
}
