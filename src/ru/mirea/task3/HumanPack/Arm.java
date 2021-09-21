package ru.mirea.task3.HumanPack;

public class Arm extends Body{
    private int power;
    private int length;

    Arm(){}
    Arm(int power, int length){
        this.power = power;
        this.length = length;
    }
    Arm(int chest_size, boolean press, int power, int length){
        super(chest_size, press);
        this.power = power;
        this.length = length;
    }

    public void setPower(int power) { this.power = power; }
    public int getPower() { return power; }
    public void setLength(int length) { this.length = length; }
    public int getLength() { return length; }

    public String toString() {
        return "Arm{" +
                "power=" + power +
                ", length=" + length +
                '}';
    }
}
