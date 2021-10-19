package ru.mirea.task10.opt10;

public class Task3 {
    public static int reverse(int digit) { return back(digit, 0); }
    public static int back(int digit, int buff)
    {
        if(digit>0)
        {
            /*
            System.out.print(digit / 10);
            System.out.print(" ");
            System.out.println((buff * 10) + (digit % 10));
            */
            return back(digit / 10, (buff * 10) + (digit % 10));

        }
        return buff;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123456));
    }
}
