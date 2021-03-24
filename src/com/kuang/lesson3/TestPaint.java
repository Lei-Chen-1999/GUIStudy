package com.kuang.lesson3;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }
    // 画笔
    @Override
    public void paint(Graphics g) {
        // 画笔需要有颜色，画笔可以画画
        g.setColor(Color.red);
        g.drawOval(100, 100, 100, 100);// 空心圆
        g.fillOval(100, 100, 100, 100);// 实心圆
        //画笔用完需要初始化。

    }
}
