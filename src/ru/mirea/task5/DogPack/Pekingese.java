package ru.mirea.task5.DogPack;

public class Pekingese extends Dog{
    public Pekingese(String name, int age, boolean isOwned) {
        super(name, age, isOwned);
    }

    @Override
    public String getBreed() {
        return "Пекинес";
    }
}
