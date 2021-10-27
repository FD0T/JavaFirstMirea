package ru.mirea.task13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOpt {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String thomas = "Томас";
        String behemoth = "Бегемот";
        String philipp = "Филипп Маркович";
        String plush = "Пушок";

        words.add(thomas);
        words.add(behemoth);
        words.add(philipp);
        words.add(plush);

        System.out.println("Words.size() = " + words.size());
        int thomasIndex = words.indexOf(thomas);
        System.out.println(thomasIndex);

        String second_word = words.get(1);
        System.out.println(second_word);

        words.remove(philipp);

        words.set(1, "Гиппопотам");
        words.add(0, "Джерри");
        words.add("Кружок");
        System.out.println(words.contains(philipp) + ", " + words.contains(second_word) + ", " + words.contains("Джерри"));

        System.out.println(words.toString());
        System.out.println(words.size());
        Collections.sort(words);
        System.out.println(words.toString());

        words.clear();
        System.out.println(words.toString());

    }
}