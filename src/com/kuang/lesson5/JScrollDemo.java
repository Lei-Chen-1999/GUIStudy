package com.kuang.lesson5;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo() {
        Container container = this.getContentPane();
        // 文本域
        JTextArea jTextArea = new JTextArea(20, 50);
        jTextArea.setText("hello JTextArea");

        // Scroll面板
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        container.add(jScrollPane);

        this.setVisible(true);
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}