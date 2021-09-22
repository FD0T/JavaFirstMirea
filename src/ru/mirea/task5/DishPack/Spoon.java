package ru.mirea.task5.DishPack;

public class Spoon extends Dish{
    Spoon(String material, String rarity){
        super(material, rarity);
        this.setType("Ложка");
    }

    @Override
    public String Verb() {
        return "Лежит";
    }
}
