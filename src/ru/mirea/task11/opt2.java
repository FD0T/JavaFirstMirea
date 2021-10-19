package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opt2 {
    static class App extends JFrame{
        Image icon = Toolkit.getDefaultToolkit().getImage("src/ru/mirea/task8/basketball_logo.png");

        App(String s) {
            super(s);
            setSize(300,150);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setIconImage(icon);
            setLayout(new FlowLayout());
            JRadioButton yellowButton = new JRadioButton("Желтый");
            yellowButton.setForeground(Color.yellow);
            add(yellowButton);

            JRadioButton magentaButton = new JRadioButton("Маджента");
            magentaButton.setForeground(Color.magenta);
            add(magentaButton);

            JRadioButton greenButton = new JRadioButton("Зеленый");
            greenButton.setForeground(Color.green);
            add(greenButton);

            ButtonGroup g1 = new ButtonGroup();
            g1.add(yellowButton);
            g1.add(magentaButton);
            g1.add(greenButton);

            JRadioButton font1 = new JRadioButton("Serif");
            //font1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
            font1.setFont(new Font(Font.SERIF, Font.PLAIN, 12));
            add(font1);

            JRadioButton font2 = new JRadioButton("Monospaced");
            font2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
            add(font2);

            JRadioButton font3 = new JRadioButton("Sans serif");
            font3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
            add(font3);

            ButtonGroup g2 = new ButtonGroup();
            g2.add(font1);
            g2.add(font2);
            g2.add(font3);

            TextField text = new TextField(20);
            text.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
            add(text);

            yellowButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.yellow);
                }
            });

            magentaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.magenta);
                }
            });

            greenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.green);
                }
            });

            font1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(font1.getFont());
                }
            });

            font2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(font2.getFont());
                }
            });

            font3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(font3.getFont());
                }
            });
        }
    }

    public static void main(String[] args) {
        String[] title = new String[]{"IDDQD", "↑ ↑ ↓ ↓ ← → ← → B A", "HESOYAM", "MOTHERLODE", "noclip"};
        new opt2.App("Task11_2: " + title[(int) (Math.random() * title.length - 1)]);
    }
}
