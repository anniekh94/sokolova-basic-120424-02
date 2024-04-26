package lessons.lesson04;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        int days1 = 5;
        int days2 = 7;
        int days3 = 10;
        double price1 = 11535.50;
        double price2 = 8460.13;
        double price3 = 999.90;
        double result1 = price1 / days1;
        double result2 = price2 / days2;
        double result3 = price3 / days3;

        System.out.printf("Product № %s: coffee, %n", count);
        System.out.printf("total sales for %s days is UAH %s,%n", days1, price1);
        System.out.printf("sales by day is EUR  %s.%n", result1);

        count++;

        System.out.printf("Product № %s: tea, %n", count);
        System.out.printf("total sales for %s days is UAH %s,%n", days2, price2);
        System.out.printf("sales by day is EUR  %s.%n", result2);

        count++;

        System.out.printf("Product № %s: sugar, %n", count);
        System.out.printf("total sales for %s days is UAH %s,%n", days3, price3);
        System.out.printf("sales by day is EUR  %s.%n", result3);

    }

}
