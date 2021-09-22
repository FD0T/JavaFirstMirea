package ru.mirea.task5.DogPack;

public abstract class Dog {
    private int age;
    private String name;
    private boolean isOwned;
    public Dog(String name,int age, boolean isOwned)
    {
        this.name=name;
        this.age=age;
        this.isOwned = isOwned;
    }

    public int getAge() { return this.age; }
    public String getName() { return this.name; }
    public boolean getIsOwned() {return this.isOwned; }
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setIsOwned(boolean isOwned) { this.isOwned = isOwned; }

    public abstract String getBreed();

    public String toString() {
        return "name:" + getName() +
                " age:" + getAge() +
                " breed:" + getBreed() +
                " isOwned:" + getIsOwned();
    }
}
