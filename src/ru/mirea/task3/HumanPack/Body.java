package ru.mirea.task3.HumanPack;

public class Body extends Human{
    private int chest_size = 50;
    private boolean press = false;

    Body(){}
    Body(int chest_size, boolean press){
        this.chest_size = chest_size;
        this.press = press;
    }
    Body(String name, int age, double height, double weight, int chest_size, boolean press){
        super(name, age, height, weight);
        this.chest_size = chest_size;
        this.press = press;
    }

    public void setChest_size(int chest_size) { this.chest_size = chest_size; }
    public int getChest_size() { return this.chest_size; }
    public void setPress(boolean press) { this.press = press; }
    public boolean getPress(){ return this.press; }

    public String toString() {
        return "Body{" +
                "chest_size=" + chest_size +
                ", press=" + press +
                '}';
    }
}
