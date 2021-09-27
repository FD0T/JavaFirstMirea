package ru.mirea.task7;

public class Test {
    public static void main(String[] args) {
        MovableRectangle mr1 = new MovableRectangle(0, 0, 5, -6, 12,12);
        mr1.moveUp();
        mr1.moveRight();
        System.out.println(mr1);
    }
}
