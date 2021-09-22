package ru.mirea.task5.DishPack;

public class Fork extends Dish{
    Fork(String material, String rarity){
        super(material, rarity);
        this.setType("Вилка");
    }

    @Override
    public String Verb() {
        return "Лежит";
    }
}
