package ru.mirea.task5.DogPack;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new AmStaff("Лилу", 1, true);
        Dog d2 = new Pekingese("Чаки", 13, true);
        Dog d3 = new GermanShepherd("Мухтар", 990, false);

        d3.setIsOwned(true);
        d1.setAge(2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
