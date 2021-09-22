package ru.mirea.task5.DogPack;

public class AmStaff extends Dog{
    public AmStaff(String name, int age, boolean isOwned) {
        super(name, age, isOwned);
    }

    @Override
    public String getBreed() {
        return "АмСтафф";
    }
}
