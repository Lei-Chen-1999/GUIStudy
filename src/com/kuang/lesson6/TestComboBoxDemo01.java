package com.kuang.lesson6;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class TestComboBoxDemo01 extends JFrame {
    public TestComboBoxDemo01() {
        Container container = this.getContentPane();

        // 下拉框
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem(null);
        jComboBox.addItem("正在热映");
        jComboBox.addItem("已下架");
        jComboBox.addItem("即将上映");

        container.add(jComboBox);

        this.setBounds(100,100,800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboBoxDemo01();
    }
}
