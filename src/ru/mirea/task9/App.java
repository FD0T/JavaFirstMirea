package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class App extends JFrame{
    Image icon = Toolkit.getDefaultToolkit().getImage("src/ru/mirea/task8/basketball_logo.png");
    JButton team1_button = new JButton();
    JButton team2_button = new JButton();
    int team1_score, team2_score = 0;
    JLabel result = new JLabel("Result: " + team1_score + " X " + team2_score);
    JLabel banner = new JLabel("", SwingConstants.CENTER);
    JLabel lastScore = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JTextField sample1 = new JTextField("Nothing", 12);
    JTextField sample2 = new JTextField("Nothing", 12);
    JFrame setTeam1 = new JFrame("Введите название первой команды");
    JFrame setTeam2 = new JFrame("Введите название второй команды");

    App(String s){
        super(s);
        //setLayout(new FlowLayout());
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setIconImage(icon);
        //setLayout(new FlowLayout(FlowLayout.CENTER));
        //setLayout(new BorderLayout());
        setLayout(new GridLayout(2,3));
        team1_button.setText("");
        team1_button.setFont(new Font("", Font.ITALIC, 16));
        team2_button.setText("");
        team2_button.setFont(new Font("", Font.ITALIC, 16));

        setTeam1.setSize(400,100);
        setTeam1.setVisible(true);
        setTeam1.add(sample1);
        sample1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                /*JOptionPane.showMessageDialog(App.this,
                        "Ваше слово: " + sample.getText());*/
                team1_button.setText(sample1.getText());
                setTeam1.setVisible(false);
                setTeam2.setVisible(true);
            }
        });
        setTeam2.setSize(400, 100);

        setTeam2.add(sample2);
        sample2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                team2_button.setText(sample2.getText());
                setTeam2.setVisible(false);
            }
        });

        banner.setText("vs");
        banner.setFont(new Font("", Font.BOLD, 32));
        banner.setSize(100,100);
        add(result);
        add(lastScore);
        add(winner);
        add(team1_button);
        add(banner);
        add(team2_button);
        //add(result);
        team1_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team1_score++;
                result.setText("Result: " + team1_score + " X " + team2_score);
                lastScore.setText("Last Scorer: " + team1_button.getText());
                if(team1_score > team2_score){
                    winner.setText("Winner: " + team1_button.getText());
                }
                if(team1_score < team2_score){
                    winner.setText("Winner: " + team2_button.getText());
                }
                if(team1_score == team2_score){
                    winner.setText("Winner: DRAW");
                }
            }
        });
        team2_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team2_score++;
                result.setText("Result: " + team1_score + " X " + team2_score);
                lastScore.setText("Last Scorer: " + team2_button.getText());
                if(team1_score > team2_score){
                    winner.setText("Winner: " + team1_button.getText());
                }
                if(team1_score < team2_score){
                    winner.setText("Winner: " + team2_button.getText());
                }
                if(team1_score == team2_score){
                    winner.setText("Winner: DRAW");
                }
            }
        });
    }


    public static void main(String[] args) {
        String[] title = new String[]{"IDDQD", "↑ ↑ ↓ ↓ ← → ← → B A", "HESOYAM", "MOTHERLODE", "noclip"};
        new App("Task9: " + title[(int) (Math.random() * title.length - 1)]);
    }
}
