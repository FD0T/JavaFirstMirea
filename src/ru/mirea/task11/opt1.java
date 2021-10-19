package ru.mirea.task11;

import ru.mirea.task9.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opt1 {
    public static class App extends JFrame {
        Image icon = Toolkit.getDefaultToolkit().getImage("src/ru/mirea/task8/basketball_logo.png");
        JTextField sample = new JTextField(12);

        int attempt = 0;
        int rndm = 1+(int)(Math.random()*20);
        boolean win = false;


        App(String s) {
            super(s);
            setSize(400, 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setIconImage(icon);
            setLayout(new GridLayout(2, 3));

            sample.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Дебаг ответа " + rndm);
                    System.out.println("Попытка номер: " + attempt++);
                    if(Integer.parseInt(sample.getText()) < rndm){
                    JOptionPane.showMessageDialog(App.this,
                            "Ваше число меньше заданного"); }
                    if(Integer.parseInt(sample.getText()) > rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Ваше число больше заданного"); }
                    if(Integer.parseInt(sample.getText()) == rndm){
                        win = true;
                        JOptionPane.showMessageDialog(App.this,
                                "УРА! ЭТО ОНО!"); }
                    if (win || attempt == 3) {
                        attempt = 0;
                        rndm = 1 + (int) (Math.random() * 20);
                        if (win)
                        JOptionPane.showMessageDialog(App.this,
                                "Победа! Игра начинается заново");
                        else
                        JOptionPane.showMessageDialog(App.this,
                                "Потрачено три попытки! Игра начинается заново");
                        win = false;
                    }
                }
            });

            add(sample);
        }
    }

    public static void main(String[] args) {
        String[] title = new String[]{"IDDQD", "↑ ↑ ↓ ↓ ← → ← → B A", "HESOYAM", "MOTHERLODE", "noclip"};
        new App("Task11_1: " + title[(int) (Math.random() * title.length - 1)]);
    }
}
