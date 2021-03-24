package com.kuang.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {
    public JButtonDemo02() {
        Container container = this.getContentPane();
        URL resource = JButtonDemo02.class.getResource("tx.jpg");
        ImageIcon imageIcon = new ImageIcon(resource);

        // 单选框
        JRadioButton jRadioButton1 = new JRadioButton("JRadioButton1");
        JRadioButton jRadioButton2 = new JRadioButton("JRadioButton2");
        JRadioButton jRadioButton3 = new JRadioButton("JRadioButton3");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        container.add(jRadioButton1, BorderLayout.CENTER);
        container.add(jRadioButton2, BorderLayout.NORTH);
        container.add(jRadioButton3, BorderLayout.SOUTH);

        this.setBounds(100,100,800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
