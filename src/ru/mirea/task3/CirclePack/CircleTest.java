package ru.mirea.task3.CirclePack;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.2);
        c1.setRadius(3);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getLength());
    }
}
