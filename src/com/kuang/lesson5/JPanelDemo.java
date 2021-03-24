package com.kuang.lesson5;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    public JPanelDemo() {
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1, 10, 10));//后两个参数是 间距
        JPanel jPanel = new JPanel(new GridLayout(1, 3));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        container.add(jPanel);
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
