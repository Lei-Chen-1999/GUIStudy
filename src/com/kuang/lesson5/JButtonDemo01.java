package com.kuang.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {
    public JButtonDemo01() {
        Container container = this.getContentPane();
        URL resource = JButtonDemo01.class.getResource("tx.jpg");
        ImageIcon imageIcon = new ImageIcon(resource);

        // 把图表放在按钮上
        JButton jButton = new JButton();
        jButton.setIcon(imageIcon);
        jButton.setToolTipText("图片按钮");
        jButton.setSize(300,300);

        // add()
        container.add(jButton);

        this.setBounds(100,100,800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
