package Swing2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Color c1 = new Color(51,204,255);
        JFrame frame = new JFrame("Kaise ho bhaya");
        JButton btn = new JButton("CLick me pls");
        btn.setBounds(250,300,150,100);
//        btn.setBorderPainted(false);
        btn.setFocusPainted(false);dr
        frame.add(btn);

        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.GREEN);
        frame.setLayout(null);
        frame.setSize(500,600);

        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.decode("#f4de"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
