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

            double tax1 = salary * 0.025;
            double tax2 = salary * 0.043;
            double tax3 = salary * 0.067;

            String result1 = String.format("%.2f",tax1);
            String result2 = String.format("%.2f",tax2);
            String result3 = String.format("%.2f",tax3);

            if (salary >= a & salary <= b) {
                System.out.println("Tax for income in range of 0 to 10000 is " + result1);
            } else if (salary > b & salary <= c) {
                System.out.println("Tax for income in range of 10000 to 25000 is " + result2);
            } else if (salary > c) {
                System.out.println("Tax for income more than 25000 is " + result3);
            } else {
                System.out.println("You enter wrong value!");
            }
        } else {
            System.out.println("You enter wrong value!");
        }
    }
}
