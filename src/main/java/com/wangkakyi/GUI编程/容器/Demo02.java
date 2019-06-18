package com.wangkakyi.GUI编程.容器;

import javax.swing.*;
import java.awt.*;

public class Demo02 {
    private JFrame frame;
    private Container cont;
    private JTabbedPane tabPane;
    private JPanel panA;
    private JPanel panB;
    private JPanel panC;

    public void init() {
        frame = new JFrame("字体");
        cont = frame.getContentPane();
        tabPane = new JTabbedPane(JTabbedPane.TOP);
        panA = new JPanel();
        panB = new JPanel();
        panC = new JPanel();
        frame.setSize(300, 300);
        frame.setLocation(450, 300);
        frame.setLocation(450, 300);
        cont.add(tabPane);
        tabPane.addTab("字体", panA);
        tabPane.addTab("字符间距", panB);
        tabPane.addTab("文字效果", panC);
        panA.add(new JTextField("宋体"));
        panB.add(new JTextField("文字缩放100%"));
        panC.add(new JLabel("赤水情深"));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
new Demo02().init();
    }
}
