package ru.mirea.task1.opt3;
import java.util.Scanner;

public class Task {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr_length = 1+(int)(Math.random()*10);
        int [] arr = new int [arr_length];
        System.out.println("Enter numbers for array");
        for (int i = 0; i < arr_length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("For:");
        for (int i = 0; i < arr_length;i++)
        {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("\nWhile:");
        int i = 0;
        while (i < arr_length)
        {
            System.out.print(" " + arr[i] + " ");
            i++;
        }
        System.out.println("\nDo While:");
        i = 0;
        do {
            System.out.print(" " + arr[i] + " ");
            i++;
        } while (i < arr_length);
    }
}
