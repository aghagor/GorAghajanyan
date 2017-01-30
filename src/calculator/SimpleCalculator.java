package calculator;

import javax.swing.*;
import java.awt.*;
import java.io.Closeable;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class SimpleCalculator {

    public static void main(String[] args) {

        JPanel panel = new JPanel();

        GridLayout flowLayout = new GridLayout(4, 2);
        panel.setLayout(flowLayout);

        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField field3 = new JTextField(10);
        JButton go = new JButton("Add");

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(go);

        JFrame frame = new JFrame("My first simple calcualtor");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getDefaultCloseOperation();

    }

}
