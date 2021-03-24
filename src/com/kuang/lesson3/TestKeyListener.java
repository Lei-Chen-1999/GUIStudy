package com.kuang.lesson3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame {
    public KeyFrame() {
        setBounds(100, 200, 300, 400);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            // 键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                // 获得键盘按下的键是哪个
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}
