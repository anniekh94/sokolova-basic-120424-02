package lessons.lesson10;

import java.util.Scanner;

public class Main {
    //Створіть Java програму з використанням методів, яка виконує наступні завдання:
    //Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    //Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
    //Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
    //Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
    //Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    //Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
    //Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

    public static int pow(int value) {
        return value * value;
    }

    public static double volume(double radius, double height) {
        return 3.1415 * Math.pow(radius,2) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number, please");
        int value = scanner.nextInt();
        System.out.printf("Square of value %s is %s%n", value, pow(value));
        double radius = 5.15;
        double height = 9.02;
        System.out.printf("Volume of cylinder with radius %s and height %s is %s%n", radius, height, volume(radius, height));


    }


}



