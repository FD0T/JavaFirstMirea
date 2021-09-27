package ru.mirea.task6.priceable;

public class Toy implements Priceable{
    private String type;
    private double price;

    public Toy(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getPrice() {
        return "Стоимость игрушки " + this.type + ": " + this.price + " рублей";
    }
}
