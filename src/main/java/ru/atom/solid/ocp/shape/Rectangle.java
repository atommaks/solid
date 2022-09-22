package ru.atom.solid.ocp.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }
}
