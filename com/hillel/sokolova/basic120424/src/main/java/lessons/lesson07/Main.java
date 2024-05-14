package lessons.lesson07;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-100, 101);
        }
        int negativeSum = 0;
        for (int i : arr) {
            if (i < 0) {
                negativeSum += i;
            }
        }
        System.out.printf("Negative sum is %s.%n", negativeSum);

        int evenCount = 0;
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.printf("Even count is %s.%n", evenCount);
        System.out.printf("Odd count is %s.%n", oddCount);

        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Min is %s.%n", min);
        System.out.printf("Max is %s.%n", max);

        int sum = 0;
        int negativeValue = 0;
        int counter = 0;
        int negativeValueIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && negativeValue == 0) {
                negativeValue = arr[i];
                negativeValueIndex = i;
            }
            if (negativeValue < 0 && negativeValueIndex != i) {
                sum += arr[i];
                counter++;
            }
        }
        if (counter > 0) {
            System.out.printf("Average is %s.%n", sum / counter);
        } else {
            System.out.println("No negative numbers.");
        }
    }
}
