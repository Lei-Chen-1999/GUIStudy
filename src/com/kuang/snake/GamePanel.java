package com.kuang.snake;

import com.sun.beans.editors.FontEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
    //定义蛇的数据结构
    int length; // 蛇的长度
    int[] snakeX = new int[600]; // 蛇的X坐标25*25
    int[] snakeY = new int[500]; // 蛇的Y坐标25*25
    String fx;
    // 食物坐标
    int foodX, foodY;
    Random random = new Random();
    // 积分
    int source;
    // 游戏当前的状态 开始|停止
    boolean isStart = false;//默认不开始
    boolean isFail = false;//默认游戏不失败
    //定时器
    Timer timer = new Timer(50, this);//100毫秒执行一次

    public GamePanel() {
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);//焦点事件
        this.addKeyListener(this);
        timer.start();//游戏一开始定时器就启动
    }

    //初始化方法
    public void init() {
        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;
        snakeX[1] = 75;
        snakeY[1] = 100;
        snakeX[2] = 50;
        snakeY[2] = 100;
        fx = "R";// 初始方向向右

        foodX = 25+25*random.nextInt(34);
        foodY = 75+75*random.nextInt(8);

        source = 0;
    }

    // 绘制面板
    // 我们游戏中的所有东西都用这个画笔画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);// 清屏
        // 绘制静态面板
        g.fillRect(25, 75, 850, 600);// 默认的游戏界面
        // 画蛇
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);// 蛇头初始化向右
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);// 第一个身体
        }
        // 画食物
        Data.food.paintIcon(this, g, foodX, foodY);
        // 积分
        g.setColor(Color.BLACK);
        g.setFont(new Font("微软雅黑", Font.BOLD, 40));
        g.drawString("分数：" + source, 50, 50);

        if (isStart == false) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));// 设置字体样式
            g.drawString("按下空格开始游戏", 300, 300);
        }
        if (isFail) {
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));// 设置字体样式
            g.drawString("按下空格重新开始游戏", 300, 300);
        }

    }

    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE) {
            if (isFail) {
                //重新开始
                isFail = false;
                init();
            } else {
                isStart = !isStart;//取反
            }

            repaint();
        }
        //小蛇移动
        if (keyCode == KeyEvent.VK_UP) {
            fx = "U";
        } else if (keyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        } else if (keyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            fx = "R";
        }
    }

    // 事件监听——需要通过固定事件来监听
    @Override
    public void actionPerformed(ActionEvent e) {
        //如果游戏是开始状态，才让小蛇动
        if (isStart && isFail == false) {
            // 吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                length++;// 长度加一
                source+=100;//分数加100
                // 再次随机食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 75 * random.nextInt(8);
            }
//            右移
            for (int i = length - 1; i > 0; i--) {//后一节移到前一节的位置
                snakeX[i] = snakeX[i - 1];//向前移动一节
                snakeY[i] = snakeY[i - 1];//向前移动一节
            }
            if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0] > 850) snakeX[0] = 25;
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;
                if (snakeX[0] < 25) snakeX[0] = 850;
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;
                if (snakeY[0] <75)  snakeY[0] = 650;
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;
                if (snakeY[0] > 650) snakeY[0] = 75;
            }

            // 失败判断，撞到自己就算失败
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
