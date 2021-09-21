package ru.mirea.task2;

public class Circle extends Shape{
    private double radius;

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {}

    public double getRadius() { return this.radius; }
    public void setRadius(double radius) { this.radius = radius; }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                "}";
    }
}
