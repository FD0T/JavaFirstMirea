package ru.mirea.task6.nameable;

public class Animal implements Nameable{
    private String type, name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getName() {
        return "Name: " + this.name;
    }
}