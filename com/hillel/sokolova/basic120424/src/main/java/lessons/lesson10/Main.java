package lessons.lesson10;

import java.util.Scanner;

public class Main {

    public static int square(int value) {
        return value * value;
    }

    public static double volume(double radius, double height) {
        return 3.1415 * Math.pow(radius, 2) * height;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static String revertString(String str) {

        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length-1; i >=0; i--) {
            result += arr[i];
        }
        return result;
    }

    public static int pow (int a, int b){
        return (int) Math.pow(a, b);
    }

    public static void repeatString (int n, String text){
        for (int i = 0; i<n; i++){
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number, please");
        int value = scanner.nextInt();
        System.out.printf("Square of value %s is %s%n", value, square(value));
        double radius = 5.15;
        double height = 9.02;
        System.out.printf("Volume of cylinder with radius %s and height %s is %s%n", radius, height, volume(radius, height));
        int[] arr = {5, 15, 25, 35, 45};
        System.out.println("Sum of array is " + arraySum(arr));
        String revert = "hello";
        System.out.println("Reverted string is "+revertString(revert));
        int a = 11;
        int b = 3;
        System.out.printf("Pow is %s^%s is %s%n", a, b, pow(a,b));
        int n = 4;
        String text = "years";
        repeatString(n,text);

    }
}



