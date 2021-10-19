package ru.mirea.task10.opt9;

import java.util.Scanner;

public class Task2 {
        /*public static int recursion(int a, int b) {
            // Базовый случай
            if (a > b + 1) {
                return 0;
            }
            // Базовый случай
            if (a == 0 || b == 0) {
                return 1;
            }
            System.out.println("________________");
            System.out.println("recursion("+ a + ", " + b + ")");
            System.out.println(a>b+1);
            System.out.println(a==0||b==0);
            System.out.println(a + " " + b);
            System.out.println("recursion("+ a + ", " + (b-1) + ") + recursion("+ (a-1) + ", " + (b-1) + ")");

            // Шаг рекурсии / рекурсивное условие
            return recursion(a, b - 1) + recursion(a - 1, b - 1);
        }
        public static void main(String[] args) {
            System.out.println(recursion(1, 4)); // вызов рекурсивной функции
        }
        */
        public static int func(int c0, int c1){
            //У нас всего есть три варианта
            //1)нет нулей
            //2)нет единиц, но есть нули(которых больше 1)(если он 1, то все ок, мы просто его вставляем и все)
            //3)есть единицы, есть нули
            if(c0==0)//количество нулей равно 0
                return 1;
            if(c1==0 && c0>1)//0 единиц и нулей боюльше одного
                return 0;
            if(c0==1 && c1==0)//0 единиц и 1 нуль
                return 1;
            //в таком случае у нас последовательность начинается либо с 1,
            //тогда мы рассматриваем число, в котором единиц меньше на 1 - f(c0, c1-1)
            //Либо число начинается с 0, но тогда следующее число - точно 1,
            //тогда рассматриваем число без нуля и единицы - f(c0-1, c1-1)
            return func(c0, c1-1)+func(c0-1,c1-1);
            //Еще, конечно, можно немного улучшить, заменив проверку с 0 единиц и 1 нулем, на более общую -
            //если у нас всего 1 ноль, и n единиц, то мы можем возвращать n+1(т.к. n+1 озиций, куда его можно впихнуть)
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c0=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println(func(c0,c1));
    }
}
