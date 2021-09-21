package ru.mirea.task3.HumanPack;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    Human(){}
    Human(String name,  int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return height; }
    public void setWeight(double weight) { this.weight = weight; }
    public double getWeight() { return weight; }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
