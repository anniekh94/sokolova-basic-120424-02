package lessons.lesson02;

public class Main {
    public static void main(String[] args) {
        String order = "Order №";
        short orderNumber = 1;
        String client = "Client";
        String clientName = "Anna";
        String product = "Product";
        String productName = "tea";
        String price = "Price UAN";
        double priceValue = 109.99;
        String address = "Address";
        String addressName = "Zdolbunivska Street, 8";
        char semicolon = ':';
        String emptyLine = " ";
        char dot = '.';
        char comma = ',';

        System.out.println(order + emptyLine + orderNumber + emptyLine + client + semicolon + emptyLine + clientName + dot);
        System.out.println(product + semicolon + emptyLine + productName + comma);
        System.out.println(price + emptyLine + priceValue + dot);
        System.out.println(address + semicolon + emptyLine + addressName + dot);

        orderNumber = 2;
        clientName = "Slava";
        productName = "coffee";
        priceValue = 150.99;
        addressName = "Zdolbunivska Street, 10";

        System.out.println(order + emptyLine + orderNumber + emptyLine + client + semicolon + emptyLine + clientName + dot);
        System.out.println(product + semicolon + emptyLine + productName + comma);
        System.out.println(price + emptyLine + priceValue + dot);
        System.out.println(address + semicolon + emptyLine + addressName + dot);

        orderNumber = 3;
        clientName = "Dima";
        productName = "sugar";
        priceValue = 10.99;
        addressName = "Dradomanova Street, 1";

        System.out.println(order + emptyLine + orderNumber + emptyLine + client + semicolon + emptyLine + clientName + dot);
        System.out.println(product + semicolon + emptyLine + productName + comma);
        System.out.println(price + emptyLine + priceValue + dot);
        System.out.println(address + semicolon + emptyLine + addressName + dot);
    }
}
