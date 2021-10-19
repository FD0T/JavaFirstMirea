package ru.mirea.task10.opt8;

public class Task1 {
    public static void main(String[] args) {
        String inputString = "12345678900987654321";
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println(reversedString.equals(inputString)); //почему через == не работает?!
    }
}