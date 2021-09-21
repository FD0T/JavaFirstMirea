package ru.mirea.task4.AuthorPack;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tolkien", "tolkien2021@gmail.com", 'M');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        Author a2 = new Author("Fedotov", "vladik.fedotov@vk.com", 'M');
        a2.setEmail("fedotov.v.a@edu.mirea.ru");
        System.out.println(a2);
    }
}
