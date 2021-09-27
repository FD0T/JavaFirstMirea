package ru.mirea.task6.nameable;

public class TestNameable {
    public static void main(String[] args) {
        Nameable n1 = new Animal("Собака","Лилу");
        System.out.println(n1.getName());
        n1 = new Car("Mitsubishi", "Lancer Evo", 2008);
        System.out.println(n1.getName());
        n1 = new Planet("Земля","Средний");
        System.out.println(n1.getName());
    }
}
