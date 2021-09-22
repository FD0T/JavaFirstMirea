package ru.mirea.task5.FurniturePack;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture c1 = new Chair("China", 500, 500);
        System.out.println(c1);
        c1.sale(15);
        System.out.println(c1);

        Furniture b1 = new Bed("Sweden", 13, 22500);
        System.out.println(b1);
        System.out.println(b1.isSold());

        Furniture v1 = new Vase("Greece", 2, 16000);
        v1.sale(75);
        System.out.println(v1.getPrice());

        Furniture c2 = new Cupboard("Switzerland", 5, 17999);
        c2.sale(33);
        System.out.println(c2.getPrice());
        c2.setCount(0);
        System.out.println(c2.isSold());
        System.out.println(c2);
    }
}
