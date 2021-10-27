package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedOpt {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(720);
        numbers.add(360);
        numbers.add(4);
        numbers.add(20);
        numbers.add(1337);
        System.out.println(numbers);

        numbers.removeFirst();
        numbers.addLast(121);
        numbers.set(1, 16);
        numbers.add(3, 18);
        System.out.println(numbers);

        System.out.println(numbers.pollLast());
        System.out.println(numbers);
    }
}
