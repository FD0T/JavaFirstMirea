package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a > 0){
            System.out.println(factorial(a));
        }
        else{
            System.out.println("Invalid value");
        }
    }

    public static int factorial(int a)
    {
        int n;
        if (a == 0)
            n = 1;
        else
            n = a * factorial(a-1);
        return(n);
    }
}
