package com.kuang.lesson4;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {
    public static void main(String[] args) {
        new MyJFrame2().init();
    }
}

class MyJFrame2 extends JFrame {
    public void init(){
        this.setBounds(100, 100, 100, 100);
        this.setVisible(true);
        // 获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.yellow);
        // 设置文字 jLabel
        JLabel jLabel = new JLabel("hello world");
        this.add(jLabel);
        // 让文本标签居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // 关闭事件
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
