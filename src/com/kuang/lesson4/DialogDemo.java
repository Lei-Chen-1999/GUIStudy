package com.kuang.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 主窗口
public class DialogDemo extends JFrame {
    public DialogDemo() {
        this.setVisible(true);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame 放东西需要一个容器
        Container container = this.getContentPane();
        // 绝对定位
        container.setLayout(null);

        // 按钮
        JButton jButton = new JButton("点击弹出一个对话框");
        jButton.setBounds(30, 30, 200, 50);
        // 点击按钮的时候出现一个弹窗
        jButton.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });
        container.add(jButton);

    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

// 弹窗的窗口
class MyDialog extends JDialog {
    public MyDialog() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new Label("hello world"));
    }
}



