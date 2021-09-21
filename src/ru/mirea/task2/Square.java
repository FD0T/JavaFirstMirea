package ru.mirea.task2;

public class Square extends Rectangle{
    private double side;

    Square(double side) { this.side = side; }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public Square() {}

    public double getSide() { return this.side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.side +
                '}';
    }
}
