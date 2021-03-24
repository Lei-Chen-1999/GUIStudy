package com.kuang.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalculator {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

class Calculator extends Frame {
    // 利用构造器实现就属于面向过程
    // 属性
    TextField num1, num2, num3;

    // 方法
    public void loadFrame() {
        // 3个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        // 1个按钮
        Button button = new Button("=");
        // 1个标签
        Label label = new Label("+");

        // 添加监听器
        button.addActionListener(new CalculatorListener());

        // 布局
        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    // 监听器类
    // 内部类最大的好处就是 可以畅通无阻的访问内部类的属性和方法！
    private class CalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(String.valueOf(n1 + n2));
            num1.setText("");
            num2.setText("");
        }
    }
}
/*

class CalculatorListener implements ActionListener {
    // 在一个类中组合另一个类
    private Calculator calculator = null;

    public CalculatorListener(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(calculator.num1.getText());
        int num2 = Integer.parseInt(calculator.num2.getText());
        calculator.num3.setText(String.valueOf(num1 + num2));
        calculator.num1.setText("");
        calculator.num2.setText("");
    }
}
*/
