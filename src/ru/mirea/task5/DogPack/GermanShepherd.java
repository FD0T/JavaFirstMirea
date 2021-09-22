package ru.mirea.task5.DogPack;

public class GermanShepherd extends  Dog{
    public GermanShepherd(String name, int age, boolean isOwned) {
        super(name, age, isOwned);
    }

    @Override
    public String getBreed() {
        return "Немецкая овчарка";
    }
}
