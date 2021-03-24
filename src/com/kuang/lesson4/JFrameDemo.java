package com.kuang.lesson4;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public void init(){
        // 顶级窗口
        JFrame jFrame = new JFrame();
        jFrame.setBounds(100, 100, 100, 100);
        jFrame.setBackground(Color.blue);
        jFrame.setVisible(true);
        // 设置文字 jLabel
        JLabel jLabel = new JLabel("hello world");
        jFrame.add(jLabel);
        // 容器实例化

        // 关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
