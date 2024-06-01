package lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        Shape[] shapesArr = {new Circle(3.16), new Square(9), new Triangle(14, 45)};
        double sum = 0;
        for (Shape shape : shapesArr) {
            sum += shape.calculateArea();
        }
        System.out.println("Overall sum of shape areas " + sum);
    }
}
