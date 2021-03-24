package com.kuang.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEventTwo {
    public static void main(String[] args) {
        Frame frame = new Frame("单击事件");
        Button button1 = new Button("555");
        Button button2 = new Button("999");
        //也可以显式定义button的ActionCommand，如果不显式的定义，则会显示label的内容
        button2.setActionCommand("4564564");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);

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

class MyMonitor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button's ActionCommand:" + e.getActionCommand());
    }
}