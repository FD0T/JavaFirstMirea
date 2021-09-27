package ru.mirea.task7;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {}

    public double getWidth() { return this.width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return this.length; }
    public void setLength(double length) { this.length = length; }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", length=" + this.length +
                '}';
    }
}
