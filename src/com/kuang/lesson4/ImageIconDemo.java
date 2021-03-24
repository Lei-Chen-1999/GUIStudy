package com.kuang.lesson4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo() {
        JLabel jLabel = new JLabel("ImageIcon");
        //获取图片的地址
        URL url = ImageIconDemo.class.getResource("tx.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(jLabel);

        setVisible(true);
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
