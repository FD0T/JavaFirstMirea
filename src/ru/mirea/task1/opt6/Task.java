package ru.mirea.task1.opt6;
import java.util.Arrays;

public class Task {
    public static void main(String[] args){

        int[] arr = new int [1+(int)(Math.random()*10)];
        for(int i = 0; i< arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(arr));

        boolean isSorted = false;
        while(!isSorted)
        {
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++)
            {
                if (arr[i] > arr[i+1]) {
                    isSorted = false;

                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}