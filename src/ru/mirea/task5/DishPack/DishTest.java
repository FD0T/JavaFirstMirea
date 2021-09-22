package ru.mirea.task5.DishPack;

public class DishTest {
    public static void main(String[] args) {
        Dish d1 = new Fork("iron", "uncommon");
        Dish d2 = new Glass("gold", "legendary");
        Dish d3 = new Spoon("paper", "common");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
