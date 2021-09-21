package ru.mirea.task4.BallPack;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);

        System.out.println('\n');

        Ball b2 = new Ball(12, 2);
        System.out.println(b2);
        System.out.println(b2.getX());
        b2.move(0, -100);
        System.out.println(b2);

    }
}
