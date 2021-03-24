package com.kuang.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demo {
    public static void main(String[] args) {
        Frame frame = new Frame("嵌套布局练习");
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        GridLayout gridLayout = new GridLayout(2, 1);
        frame.setLayout(gridLayout);

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        panel1.add(new Button("east-1"), BorderLayout.EAST);
        panel1.add(new Button("west-1"), BorderLayout.WEST);
        panel2.add(new Button("p2-bt1"));
        panel2.add(new Button("p2-bt2"));
        panel1.add(panel2, BorderLayout.CENTER);

        panel3.add(new Button("east-2"), BorderLayout.EAST);
        panel3.add(new Button("west-2"), BorderLayout.WEST);
        panel4.add(new Button("p4-bt1"));
        panel4.add(new Button("p4-bt2"));
        panel4.add(new Button("p4-bt3"));
        panel4.add(new Button("p4-bt4"));
        panel3.add(panel4, BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
