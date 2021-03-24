package com.kuang.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame {
    public JButtonDemo03() {
        Container container = this.getContentPane();
        URL resource = JButtonDemo03.class.getResource("tx.jpg");
        ImageIcon imageIcon = new ImageIcon(resource);

        // 复选框
        JCheckBox jCheckBox1 = new JCheckBox("jCheckBox1");
        JCheckBox jCheckBox2 = new JCheckBox("jCheckBox2");
        JCheckBox jCheckBox3 = new JCheckBox("jCheckBox3");

        container.add(jCheckBox1,BorderLayout.NORTH);
        container.add(jCheckBox2,BorderLayout.CENTER);
        container.add(jCheckBox3,BorderLayout.SOUTH);

        this.setBounds(100,100,800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo03();
    }
}
