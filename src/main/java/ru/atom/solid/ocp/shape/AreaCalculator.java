package ru.atom.solid.ocp.shape;

import java.util.Arrays;

/**
 * В данном случае класс AreaCalculator закрыт для модификаций, но открыт для расширений(т.е. он сделан универсально
 * и без каких либо проблем мы можем добавить новую фигуру, если заказчик того попросит).
 */
public class AreaCalculator {
    public double calculateArea(Shape... shapes) {
        return Arrays.stream(shapes)
                .map(Shape::area)
                .reduce(Double::sum)
                .orElse(0.0);
    }
}
