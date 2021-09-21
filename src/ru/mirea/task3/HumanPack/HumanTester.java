package ru.mirea.task3.HumanPack;

import ru.mirea.task2.Circle;
import ru.mirea.task2.Shape;

public class HumanTester {
    public static void main(String[] args) {
        Human hu1 = new Human("Vladislav", 18, 180, 65);
        System.out.println(hu1);
        Head he1 = new Head();
        Head he2 = new Head(999, 55.5, "rainbow", 220, 1);
        System.out.println(he1);

        he2.setIq(111);
        System.out.println(he2.getEye_color());
        System.out.println(he2);

        Body b1 = new Body("Kachok", 25, 195, 72, 60,true);
        b1.setName("Sverchok");
        System.out.println(b1);

        Arm a1 = new Arm(99, false, 2, 1);
        a1.setPower(1024);
        System.out.println(a1);
    }
}
