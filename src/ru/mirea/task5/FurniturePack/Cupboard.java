package ru.mirea.task5.FurniturePack;

public class Cupboard extends Furniture{
    Cupboard(String country, int count, double price){
        super(country, count, price);
    }

    @Override
    public String getType() {
        return "Шкаф";
    }
}
