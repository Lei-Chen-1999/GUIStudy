package com.kuang.snake;

import javax.swing.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,920,720);
        jFrame.setResizable(false); // 窗口大小不可变
        jFrame.add(new GamePanel());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
