package ru.mirea.task10.opt11;

import java.util.Scanner;

public class Task4 {
    public static int count_out(String s) { return count(s, 0, 0); }
    public static int count(String s, int one, int iter) {
        if (iter < s.length() && !(s.charAt(iter) == '0' && s.charAt(iter+1) == '0')) {
            if (s.charAt(iter) == '1') {
                one++;
                iter++;
            } else {
                iter++;
            }
            return count(s, one, iter);
        }
        return one;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count_out(s));
    }
}
