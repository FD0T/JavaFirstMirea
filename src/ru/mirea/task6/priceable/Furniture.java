package ru.mirea.task6.priceable;

public class Furniture implements Priceable{
    private String type, material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String getPrice() {
        return "Стоимость мебели " + this.type + ": " + this.price + " рублей";
    }
}
