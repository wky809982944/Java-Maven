package com.wangkakyi.GUI编程.布局管理;

import javax.swing.*;
import java.awt.*;

public class Demo01 {
    private JFrame frame;
    private BorderLayout bly;
    private JLabel lbl;
    private JTextField txt;
    private JButton btnA;
    private JButton btnB;
    private JTextArea txtArea;

    public void init() {
        frame = new JFrame("边框布局案例");
        bly = new BorderLayout(10, 10);
        lbl = new JLabel("北方");
        txt = new JTextField("南方");
        btnA = new JButton("东方");
        btnB = new JButton("西方");
        txtArea = new JTextArea("中央位置");
        frame.setSize(800, 400);
        frame.setLocation(400, 200);
        frame.setLayout(bly);
        frame.add(lbl, BorderLayout.NORTH);
        frame.add(txt, BorderLayout.SOUTH);
        frame.add(btnA, BorderLayout.EAST);
        frame.add(btnB, BorderLayout.WEST);
        frame.add(txtArea, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
new Demo01().init();
    }
}
