package ru.mirea.task5.FurniturePack;

public abstract class Furniture {
    protected String country;
    protected int count;
    protected double price;

    Furniture(String country, int count, double price)
    {
        this.country = country;
        this.count = count;
        this.price = price;
    }
    public abstract String getType();

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }

    public double getPrice() { return price; }
    public void setPrice(double price){ this.price = price; }
    public void sale(int percent){ this.price = this.price * (100 - percent) / 100; }

    public boolean isSold(){
        return this.count == 0;
    }

    public String toString() {
        return "Furniture{" +
                "type='" + this.getType() + '\'' +
                ", country='" + this.getCountry() + '\'' +
                ", count=" + this.getCount() +
                ", price=" + this.getPrice() +
                '}';
    }
}
