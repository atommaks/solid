package ru.atom.solid.ocp.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape {
    private double radius;

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
