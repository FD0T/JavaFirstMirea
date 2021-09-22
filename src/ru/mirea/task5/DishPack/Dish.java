package ru.mirea.task5.DishPack;

public abstract class Dish {
    private String type;
    private String material;
    private String rarity;

    Dish(/*String type, */String material, String rarity)
    {
        /*this.type = type;*/
        this.material = material;
        this.rarity = rarity;
    }

    protected String getType() { return type; }
    protected void setType(String type) { this.type = type; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getRarity() { return rarity; }
    public void setRarity(String rarity) { this.rarity = rarity; }
    public abstract String Verb();

    @Override
    public String toString() {
        return "Dish{" +
                "type='" + this.getType() + '\'' +
                ", material='" + this.getMaterial() + '\'' +
                ", rarity='" + this.getRarity() + '\'' +
                ", Что делает?: " + this.Verb() +
                '}';
    }
}
