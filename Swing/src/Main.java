import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");

        JButton btn = new JButton("Jara Jara Touch me");

        JLabel label = new JLabel("Arigato");

        label.setBounds(50,100,100,50);
        btn.setBounds(100,100,300,50);
        frame.add(label);
        frame.add(btn);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}