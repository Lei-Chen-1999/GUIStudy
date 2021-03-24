package com.kuang.lesson6;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboBoxDemo02 extends JFrame {
    public TestComboBoxDemo02() {
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        // 列表框  静态
        String[] contents = {"1", "2", "3", "2", "3", "2", "3", "2", "3", "2", "3"};
        JList jList1 = new JList(contents);

        container.add(jList1);
        container.add(new Label("-----------------------------"));
        // 动态
        Vector vector = new Vector();
        JList jList2 = new JList(vector);
        vector.add("adjkl");
        vector.add("adjkl");
        vector.add("adjkl");
        container.add(jList2);


        this.setBounds(100,100,800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboBoxDemo02();
    }
}
