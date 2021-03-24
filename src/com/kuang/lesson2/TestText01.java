package com.kuang.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);

        //监听这个文本域输入的文字
        //按下enter就会出发这个输入框的事件
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField textField1 = (TextField) e.getSource();//获得一些资源
                System.out.println(textField1.getText());//获得输入框中的文本
                textField1.setText("");//清空效果
            }
        });
        pack();
        setVisible(true);
        //设置替换编码
        textField.setEchoChar('*');//密码
    }
}