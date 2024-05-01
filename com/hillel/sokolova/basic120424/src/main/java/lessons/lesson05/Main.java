package lessons.lesson05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 0.00;
        double b = 10000.00;
        double c = 25000.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary, please");

        if (scanner.hasNextDouble()) {
            double salary = scanner.nextDouble();
            if (salary >= a && salary <= b) {
                double tax1 = salary * 0.025;
                String result1 = String.format("%.2f",tax1);
                System.out.println("Tax for income in range of 0 to 10000 is " + result1);
            } if (salary > b && salary <= c) {
                double tax2 = salary * 0.043;
                String result2 = String.format("%.2f",tax2);
                System.out.println("Tax for income in range of 10000 to 25000 is " + result2);
            } if (salary > c) {
                double tax3 = salary * 0.067;
                String result3 = String.format("%.2f",tax3);
                System.out.println("Tax for income more than 25000 is " + result3);
            }
        } else {
            System.out.println("You enter wrong value!");
        }
    }
}
