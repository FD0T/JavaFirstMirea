package ru.mirea.task2;

public class ClassTesterEverything {
    public static void main(String[] args) {
        System.out.println("////ПРОВЕРКА КЛАССА SHAPE////");
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println('\n');

        //Shape s2 = new Shape(); \/так нельзя, класс абстрактный

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());

        System.out.println('\n');

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println('\n');

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());

        System.out.println("\n////ПРОВЕРКА КЛАССА BALL////");

        Ball b1 = new Ball();
        System.out.println(b1);

        System.out.println('\n');

        Ball b2 = new Ball(12, 2);
        System.out.println(b2);
        System.out.println(b2.getX());

        System.out.println("\n////ПРОВЕРКА КЛАССА AUTHOR////");

        Author a1 = new Author("Tolkien", "tolkien2021@gmail.com", 'M');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }
}