package lessons.lesson04;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        int days = 5;
        double price = 11535.50;
        double result = price / days;

        System.out.printf("Product № %s: coffee, %n", count);
        System.out.printf("total sales for %s days is UAH %s,%n", days, price);
        System.out.printf("sales by day is EUR  %s.%n", result);

        count++;
        days = 7;
        price = 8460.13;
        result = price / days;

        System.out.printf("Product № %s: tea, %n", count);
        System.out.printf("total sales for %s days is UAH %s,%n", days, price);
        System.out.printf("sales by day is EUR  %s.%n", result);

        count++;
        days = 10;
        price = 999.90;
        result = price / days;

        System.out.printf("Product № %s: tea, %n", count);
        System.out.printf("total sales for %s days is UAH %s,%n", days, price);
        System.out.printf("sales by day is EUR  %s.%n", result);

    }

}
