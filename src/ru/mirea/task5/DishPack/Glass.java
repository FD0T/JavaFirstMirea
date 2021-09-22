package ru.mirea.task5.DishPack;

public class Glass extends  Dish{
    Glass(String material, String rarity){
        super(material, rarity);
        this.setType("Стакан");
    }

    @Override
    public String Verb() {
        return "Стоит";
    }
}
