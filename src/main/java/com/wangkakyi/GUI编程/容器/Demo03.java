package com.wangkakyi.GUI编程.容器;

import javax.swing.*;
import java.awt.*;

public class Demo03 {
    private JFrame frame;
    private JSplitPane sPane;
    private JPanel panRight;
    private JPanel panLeft;
    private JTextArea txtArea;
    private JButton btn;
    private JTextField txt;


    public void init() {
        frame = new JFrame("拆分窗格案例");
        sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        panRight = new JPanel();
        panLeft = new JPanel();
        txtArea = new JTextArea("绿水青山");
        txtArea.setFont(new Font("楷体", Font.BOLD, 20));
        btn = new JButton("确定");
        txt = new JTextField("新时代");
        frame.setSize(400, 300);
        frame.setLocation(500, 300);
        panRight.add(txtArea);
        panLeft.add(btn);
        panLeft.add(txt);
        sPane.setRightComponent(panRight);
        sPane.setLeftComponent(panLeft);
        frame.add(sPane);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
new Demo03().init();
    }
}
