package ru.mirea.task1.opt4;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        for(int i = args.length - 1; i >= 0; i--)
        {
            System.out.print(args[i] + " ");
        }
        System.out.print('\n' + args.length);
    }
}
