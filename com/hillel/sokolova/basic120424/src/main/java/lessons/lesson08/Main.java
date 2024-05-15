package lessons.lesson08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number, please");
        int number = scanner.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) {
                index = mid;
                break;
            } else if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index == -1) {
            System.out.println("Number doesn't exist.");
        } else {
            System.out.println("Number index is " + index);
        }
    }
}


