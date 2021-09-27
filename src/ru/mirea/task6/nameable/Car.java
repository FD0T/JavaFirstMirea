package ru.mirea.task6.nameable;

public class Car implements Nameable{
    private String brand, model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getName() {
        return "Brand: " + this.brand;
    }
}