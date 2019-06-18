package com.wangkakyi.GUI编程.第一个GUI;

import javax.swing.*;
import java.awt.*;

public class Demo01 {
    private JFrame frame;
    private FlowLayout fly;
    private JButton btnA;
    private JButton btnB;
    private JTextField txt;
    public  void init() {
         frame = new JFrame("GUI");
         fly = new FlowLayout(FlowLayout.LEFT, 10, 5);
        btnA = new JButton("按钮A");
        btnB = new JButton("按钮B");
        txt = new JTextField(20);
        frame.setSize(500,300);
        frame.setLocation(700,300);
        frame.setLayout(fly);
        frame.add(btnA);
        frame.add(btnB);
        frame.add(txt);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
new Demo01().init();
    }
}
