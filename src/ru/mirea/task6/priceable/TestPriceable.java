package ru.mirea.task6.priceable;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable p1 = new Furniture("Стул", "дерево", 499.99);
        System.out.println(p1.getPrice());
        p1 = new Toy ("Солдат", 2000);
        System.out.println(p1.getPrice());
    }
}
