package ru.mirea.task10.opt12;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(oddCounter("1234501"));
    }

    public static int oddCounter(String s){
        int counter = 0;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != '0'){
                if (Character.getNumericValue(s.charAt(i) ) % 2 != 0){
                    counter++;
                }
            }
            else { break; }
        }
        return counter;
    }
}