package lessons.lesson06;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.printf("%s) Num is %s, sum is %s %n", i, i, sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
