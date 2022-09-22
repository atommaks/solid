package ru.atom.solid.ocp.shape;

public class Controller {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Rectangle rectangle = new Rectangle(100.0, 123.1);
        Circle circle = new Circle(10.0);
        System.out.println(calculator.calculateArea(rectangle, circle));
    }
}
