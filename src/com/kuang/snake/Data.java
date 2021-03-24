package com.kuang.snake;

import org.junit.Test;

import javax.swing.*;
import java.net.URL;

public class Data {
//    public static URL upURL = Data.class.getResource("statics/up.png");
//    public static URL downURL = Data.class.getResource("statics/down.png");
//    public static URL leftURL = Data.class.getResource("statics/left.png");
//    public static URL rightURL = Data.class.getResource("statics/right.png");
//    public static URL bodyURL = Data.class.getResource("statics/body.png");
//    public static URL foodURL = Data.class.getResource("statics/food.png");

    public static ImageIcon up = new ImageIcon("statics/up.png");
    public static ImageIcon down = new ImageIcon("statics/down.png");
    public static ImageIcon left = new ImageIcon("statics/left.png");
    public static ImageIcon right = new ImageIcon("statics/right.png");
    public static ImageIcon body = new ImageIcon("statics/body.png");
    public static ImageIcon food = new ImageIcon("statics/food.png");
    @Test
    public void test(){
        System.out.println(up);
    }
}

