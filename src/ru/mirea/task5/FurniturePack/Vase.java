package ru.mirea.task5.FurniturePack;

public class Vase extends  Furniture{
    Vase(String country, int count, double price){
        super(country, count, price);
    }

    @Override
    public String getType() {
        return "Ваза";
    }
}
