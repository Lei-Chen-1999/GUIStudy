package com.kuang.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;

public class TestActionEventOne {
    public static void main(String[] args) {
        Frame frame = new Frame("单击事件");
        Button button = new Button("555");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button's label:" + button.getLabel());
            }
        });
        frame.add(button, BorderLayout.CENTER);
        frame.pack();//使此窗口的大小适合其子组件的首选大小和布局。
        windowClose(frame);
        frame.setVisible(true);
    }

    public static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
