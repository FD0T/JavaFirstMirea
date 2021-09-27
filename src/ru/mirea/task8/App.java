package ru.mirea.task8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class App extends JFrame implements ActionListener{
    Image icon = Toolkit.getDefaultToolkit().getImage("src/ru/mirea/task8/basketball_logo.png");
    JButton button = new JButton("Запустить");
    Container cont = this.getContentPane();
    ButtonGroup group = new ButtonGroup();
    JRadioButton radio1 = new JRadioButton("Assassin's Creed");
    JRadioButton radio2 = new JRadioButton("Cyberpunk2077");
    JRadioButton radio3 = new JRadioButton("Loading animation");
    JRadioButton radio4 = new JRadioButton("Skull tileset");
    JRadioButton radio5 = new JRadioButton("Best Avatar");
    JRadioButton radio6 = new JRadioButton("Bogosort");


    public App(String s) {
        super(s);
        setLayout(new FlowLayout());
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setIconImage(icon);

        cont.setLayout((new GridLayout(3,2,2,2)));

        group.add(radio1);
        radio1.setSelected(true);
        cont.add(radio1);

        group.add(radio2);
        cont.add(radio2);

        group.add(radio3);
        cont.add(radio3);

        group.add(radio4);
        cont.add(radio4);

        group.add(radio5);
        cont.add(radio5);

        group.add(radio6);
        cont.add(radio6);

        cont.add(button);

        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        add(button);
    }

    public void cyberpunkAnimation(){
        JFrame frame = new JFrame("Cyberpunk2077 ad");
        frame.setSize(420,445);
        JLabel jlabel = new JLabel("Вот когда-то нарисовал");
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/CyberpunkFull.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }

    public void assassinAnimation(){
        JFrame frame = new JFrame("Assassin's Creed ad");
        frame.setSize(450,300);
        JLabel jlabel = new JLabel("Вот когда-то нарисовал");
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/HiddenBlade.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }

    public void loadingAnimation(){
        JFrame frame = new JFrame("Loading animation");
        frame.setSize(450,250);
        JLabel jlabel = new JLabel("Прикольная анимация загрузки");
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/loading_whitebckg.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }

    public void skullTileSet(){
        JFrame frame = new JFrame("Skull tileset");
        frame.setSize(400,300);
        JLabel jlabel = new JLabel("Раскадровка черепа");
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/Skull_sheet.png");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }

    public void avatar(){
        JFrame frame = new JFrame("My lovely avatar");
        frame.setSize(500,300);
        JLabel jlabel = new JLabel("Сам себе сделал гиф-аватарку");
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/BadTrip.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }

    public void bogosort(){
        JFrame frame = new JFrame("Bogosort review");
        frame.setSize(750,200);
        JLabel jlabel = new JLabel("Алгоритм сортировки bogosort");
        Image image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/Bogosort.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(radio1.isSelected()){
            assassinAnimation();
        }
        if(radio2.isSelected()){
            cyberpunkAnimation();
        }
        if(radio3.isSelected()){
            loadingAnimation();
        }
        if(radio4.isSelected()){
            skullTileSet();
        }
        if(radio5.isSelected()){
            avatar();
        }
        if(radio6.isSelected()){
            bogosort();
        }
    }

    public static void main(String[] args) {
        String[] title = new String[]{"IDDQD", "↑ ↑ ↓ ↓ ← → ← → B A", "HESOYAM", "MOTHERLODE", "noclip"};
        new App("Task8: " + title[(int) (Math.random() * title.length - 1)]);
    }
}


