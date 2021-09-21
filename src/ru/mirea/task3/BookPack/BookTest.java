package ru.mirea.task3.BookPack;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Turgenev", "Mumu");
        Book b2 = new Book("Turgenev", "A Sportsman's Sketches", 1862);
        Book b3 = new Book("Tolstoi", "War and Peace", 1869, 4.2);
        System.out.println(b1.getAuthor());
        b1.setName("Fathers and Sons");
        System.out.println(b1);
        System.out.println((b2.getName()));
        System.out.println(b2);
        System.out.println(b3.getStar_rate());
        System.out.println(b3);
    }
}
