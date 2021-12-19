package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener {
    Image img = new ImageIcon("src/ru/mirea/task8/Skull_sheet.png").getImage();
    Timer timer = new Timer(20, this);
    JFrame frame;
    public Main(JFrame frame){
        this.frame = frame;
    }

    public void paint(Graphics g){
        g.drawImage(img, 0, 0, frame.getWidth(), frame.getHeight(), null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
