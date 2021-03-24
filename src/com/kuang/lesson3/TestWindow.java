package com.kuang.lesson3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {

    public WindowFrame() {
        setBackground(Color.BLACK);
        setBounds(100, 100, 100, 100);
        setVisible(true);
//        addWindowListener(new WindowFrameListener());
        addWindowListener(new WindowAdapter() {
            // 关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);
            }
            // 激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }
        });
    }
/*    class WindowFrameListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);//隐藏窗口。
            System.exit(0);//正常退出 1为非正常退出
        }
    }*/

}
